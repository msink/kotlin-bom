/*
 * Licensed under the Apache License, Version 2.0
 */

data class Board(
    val name: String,
    val code: String,
    var developed: String,
    var checked: String,
    var approved: String,
)

data class Component(
    val refdes: String,
    val category: String,
    val prefix: String,
    val value: Int = 0,
    private val suffix: String = "",
) {
    val name = (prefix + suffix)
        .replace("+-", "±")
        .replace("\"C", "°C")
        .replace("\"С", "°C")
    var replacements = emptyList<String>()
    fun fullname() =
        if (replacements.isEmpty()) name else name + replacements.joinToString(prefix = " (", postfix = ")")

    fun index() = refdes.takeLastInt()
}

fun readIni(fileName: String): Board {
    val name = fileName.substringAfterLast("\\").substringBefore(".")
    var code = ""
    var developed = ""
    var checked = ""
    var approved = ""

    val lines = readFile(fileName, maybeAbsent = true)
    lines.forEach {
        when {
            it.startsWith("Код:") -> code = it.substringAfter(":").trim()
            it.startsWith("Разработал:") -> developed = it.substringAfter(":").trim()
            it.startsWith("Проверил:") -> checked = it.substringAfter(":").trim()
            it.startsWith("Утвердил:") -> approved = it.substringAfter(":").trim()
        }
    }

    return Board(
        name = name,
        code = code,
        developed = developed,
        checked = checked,
        approved = approved
    )
}

private fun String.takeInt(): Int {
    val str = takeWhile { it.isDigit() }
    return if (str.isEmpty()) 0 else str.toInt()
}

private fun String.takeLastInt(): Int {
    val str = takeLastWhile { it.isDigit() }
    return if (str.isEmpty()) 0 else str.toInt()
}

private fun String.takeDouble(): Double {
    val str = takeWhile { it.isDigit() || it == '.' }
    return if (str.isEmpty()) 0.0 else str.toDouble()
}

private fun String.toRString() = when {
    endsWith('M') -> dropLast(1).replace('.', ',') + " МОм"
    endsWith('k') -> dropLast(1).replace('.', ',') + " кОм"
    contains('k') -> replace('k', ',') + " кОм"
    else -> replace('.', ',') + " Ом"
}

private fun String.toRInt() = when {
    endsWith('M') -> (takeDouble() * 1000000.0).toInt()
    endsWith('k') -> (takeDouble() * 1000.0).toInt()
    contains('k') -> (replaceFirst('k', '.').takeDouble() * 1000.0).toInt()
    else -> takeInt()
}

private fun String.toCString() = when {
    contains(',') -> this + " мкФ"
    contains('.') -> replace('.', ',') + " мкФ"
    else -> this + " пФ"
}

private fun String.toCInt() = when {
    contains(',') -> (replaceFirst(',', '.').takeDouble() * 1000000.0).toInt()
    contains('.') -> (takeDouble() * 1000000.0).toInt()
    else -> takeInt()
}

fun readBom(fileName: String): List<Component> {
    fun String.parseCSV(): List<String> = listOf("") + split('@').map { it.trim('"') }
    val lines = readFile(fileName)
    if (lines.size < 3 || !lines[1].isEmpty())
        throw Error("Bad input file '$fileName'")

    val header = lines[0].parseCSV()
    fun List<String>.field(key: String): Int {
        val index = indexOf(key)
        if (index < 0) {
            if (key != "RefDes") return 0
            else throw Error("Bad input file '$fileName': 'RefDes' not found")
        }
        return index
    }

    val refdesIndex = header.field("RefDes")
    val componentIndex = header.field("ComponentName")
    val patternIndex = header.field("PatternName")
    val valueIndex = header.field("Value")
    val descriptionIndex = header.field("Description")

    val bom = lines.drop(2).map {
        val fields = it.parseCSV()
        val refdes = fields[refdesIndex]
        val component = fields[componentIndex]
        val pattern = fields[patternIndex]
        val value = fields[valueIndex]
        val description = fields[descriptionIndex]
        val part = when {
            description.contains('\\') -> description.takeWhile { it != '\\' }
            description.startsWith("+-") -> ""
            else -> description
        }
        val percent = when {
            description.contains('\\') -> description.takeLastWhile { it != '\\' }
            description.startsWith("+-") -> description
            else -> ""
        }
        val name = when {
            part.isNotEmpty() -> part
            value.isNotEmpty() -> value
            else -> component
        }
        when {
            refdes.startsWith("RT") -> Component(
                refdes = refdes,
                category = "Терморезисторы",
                prefix = name
            )

            refdes.startsWith("RU") -> Component(
                refdes = refdes,
                category = "Варисторы",
                prefix = name
            )

            refdes.startsWith("RN") -> Component(
                refdes = refdes,
                category = "Наборы резисторов",
                prefix = description,
                value = value.toRInt(),
                suffix = "-" + value.toRString() + when {
                    percent.isNotEmpty() -> percent
                    else -> "+-5%"
                }
            )

            refdes.startsWith("R") -> Component(
                refdes = refdes,
                category = "Резисторы",
                prefix = when {
                    pattern.startsWith("SMD") -> "SMD-" + pattern.substring(3, 7)
                    part.isNotEmpty() -> part
                    else -> "С2-23"
                } + "-" + when (component) {
                    "RES-0062", "RES_SMD0062" -> "0,0625"
                    "RES_01", "RES_SMD0125", "SMD-0805-0,125" -> "0,125"
                    "RES_02", "RES_SMD025", "RES_SMD025-1" -> "0,25"
                    "RES_05", "RES_SMD05" -> "0,5"
                    "RES_1", "RES_SMD1" -> "1"
                    "RES_2" -> "2"
                    "RES_3" -> "3"
                    else -> "???"
                } + when {
                    pattern.startsWith("SMD") && part.isNotEmpty() -> "-" + part
                    else -> ""
                },
                value = value.toRInt(),
                suffix = "-" + value.toRString() + when {
                    percent.isNotEmpty() -> percent
                    else -> "+-5%"
                }
            )

            refdes.startsWith("C") -> Component(
                refdes = refdes,
                category = "Конденсаторы",
                prefix = when {
                    pattern.startsWith("SMD") -> "SMD-" + pattern.substring(3, 7)
                    part.isNotEmpty() -> part
                    else -> "???"
                },
                value = if (value.contains('n') || value.contains('н')) {
                    throw Error("Bad nominal $refdes: $value")
                } else {
                    value.toCInt()
                },
                suffix = when {
                    pattern.startsWith("SMD") -> "-" + when {
                        part.isNotEmpty() -> part
                        else -> "Y5U"
                    }
                    else -> ""
                } + when {
                    value.isEmpty() -> ""
                    else -> "-" + value.toCString()
                } + when {
                    percent.isNotEmpty() -> percent
                    description.endsWith('\\') -> ""
                    else -> "+-20%"
                }
            )

            refdes.startsWith("L") -> Component(
                refdes = refdes,
                category = "Дроссели",
                prefix = when {
                    description.isNotEmpty() -> description
                    value.startsWith(component) -> value
                    else -> component + "-" + value
                }
            )

            refdes.startsWith("XP") -> Component(
                refdes = refdes,
                category = "Радиокомпоненты",
                prefix = "Вилка " + name
            )

            refdes.startsWith("JP") -> Component(
                refdes = refdes,
                category = "Радиокомпоненты",
                prefix = "Вилка " + name
            )

            refdes.startsWith("XS") -> Component(
                refdes = refdes,
                category = "Радиокомпоненты",
                prefix = "Розетка " + name
            )

            refdes.startsWith("VD") -> Component(
                refdes = refdes,
                category = "Диоды и стабилитроны",
                prefix = name
            )

            refdes.startsWith("VT") -> Component(
                refdes = refdes,
                category = "Транзисторы",
                prefix = name
            )

            refdes.startsWith("DO") -> Component(
                refdes = refdes,
                category = "Оптопары",
                prefix = name
            )

            refdes.startsWith("D") -> Component(
                refdes = refdes,
                category = "Микросхемы",
                prefix = name
            )

            refdes.startsWith("TV") -> Component(
                refdes = refdes,
                category = "Трансформаторы",
                prefix = name
            )

            else -> Component(
                refdes = refdes,
                category = "Прочие",
                prefix = name
            )
        }
    }

    return bom.filter {
        !(it.refdes.endsWith('-') || it.refdes.endsWith('~')) && (!it.refdes.endsWith('*') || run {
            val key = it.refdes.trimEnd('*')
            val real = bom.find { it.refdes == key }
            real == null || run {
                real.replacements += it.name
                false
            }
        })
    } + List(bom.count {
        it.refdes.startsWith("FU") &&
            !it.name.contains(" самовос", ignoreCase = true)
    } * 2) {
        Component("XF${it + 1}", "Прочие", "Держатель вставки плавкой FH-100")
    }
}

fun Int.isLastOnPage() = when {
    this == 28 -> true
    (this - 29).rem(32) == 31 -> true
    else -> false
}

fun makeList(board: Board, bom: List<Component>, fileName: String) {
    val out = StringBuilder()
    out.pDocumentHeader(board)
    var line = 0
    for (category in listOf(
        "Конденсаторы",
        "Микросхемы",
        "Оптопары",
        "Дроссели",
        "Резисторы",
        "Наборы резисторов",
        "Терморезисторы",
        "Варисторы",
        "Трансформаторы",
        "Диоды и стабилитроны",
        "Транзисторы",
        "Радиокомпоненты",
        "Прочие"
    )) {
        var list = bom.filter { it.category == category }
        if (list.isEmpty()) continue
        out.pTableEmptyRow(); ++line
        if (line.isLastOnPage()) {
            out.pTableEmptyRow(); ++line
        }
        out.pTableHeaderRow(category); ++line
        while (list.isNotEmpty()) {
            var pos = list.takeWhile { it.fullname() == list[0].fullname() }
            list = list.drop(pos.size)
            when (pos.size) {
                1 -> {
                    out.pTableRow(
                        refdes = pos[0].refdes,
                        name = pos[0].fullname(),
                        count = pos.size
                    ); ++line
                }
                2 -> {
                    out.pTableRow(
                        refdes = pos[0].refdes + ", " + pos[1].refdes,
                        name = pos[0].fullname(),
                        count = pos.size
                    ); ++line
                }
                else -> if (pos.zipWithNext().all { (a, b) -> a.index() + 1 == b.index() }) {
                    out.pTableRow(
                        refdes = pos[0].refdes + ".." + pos.last().refdes,
                        name = pos[0].fullname(),
                        count = pos.size
                    ); ++line
                } else {
                    var first = pos.zipWithNext().indexOfFirst { (a, b) -> a.index() + 1 != b.index() } + 1
                    if (first == 1 && pos[1].index() != pos[2].index()) {
                        first = 2
                    }
                    when (first) {
                        1 -> {
                            out.pTableRow(
                                refdes = pos[0].refdes + ",",
                                name = pos[0].fullname()
                            ); ++line
                        }
                        2 -> {
                            out.pTableRow(
                                refdes = pos[0].refdes + ", " + pos[1].refdes + ",",
                                name = pos[0].fullname()
                            ); ++line
                        }
                        else -> {
                            out.pTableRow(
                                refdes = pos[0].refdes + ".." + pos[first - 1].refdes + ",",
                                name = pos[0].fullname()
                            ); ++line
                        }
                    }
                    pos = pos.drop(first)
                    while (pos.isNotEmpty()) {
                        if (pos.size <= 2 || pos.zipWithNext().all { (a, b) -> a.index() + 1 == b.index() }) {
                            when (pos.size) {
                                1 -> {
                                    out.pTableRow(
                                        refdes = pos[0].refdes,
                                        count = pos.size
                                    ); ++line
                                }
                                2 -> {
                                    out.pTableRow(
                                        refdes = pos[0].refdes + ", " + pos[1].refdes,
                                        count = pos.size
                                    ); ++line
                                }
                                else -> {
                                    out.pTableRow(
                                        refdes = pos[0].refdes + ".." + pos.last().refdes,
                                        count = pos.size
                                    ); ++line
                                }
                            }
                            break
                        }
                        var next = pos.zipWithNext().indexOfFirst { (a, b) -> a.index() + 1 != b.index() } + 1
                        if (next == 1 && pos[1].index() != pos[2].index()) {
                            next = 2
                        }
                        when (next) {
                            1 -> {
                                out.pTableRow(
                                    refdes = pos[0].refdes + ","
                                ); ++line
                            }
                            2 -> {
                                out.pTableRow(
                                    refdes = pos[0].refdes + ", " + pos[1].refdes + ","
                                ); ++line
                            }
                            else -> {
                                out.pTableRow(
                                    refdes = pos[0].refdes + ".." + pos[next - 1].refdes + ","
                                ); ++line
                            }
                        }
                        pos = pos.drop(next)
                    }
                }
            }
        }
    }
    while (!line.isLastOnPage()) {
        out.pTableEmptyRow(); ++line
    }
    out.pDocumentFooter()
    writeFile(fileName, out.toString())
}

fun makeZakaz(board: Board, bom: List<Component>, fileName: String) {
    val out = StringBuilder()
    out.zDocumentHeader(board)
    var line = 0
    var lastHeader = ""
    for ((category, header) in listOf(
        "Резисторы" to "Резисторы",
        "Наборы резисторов" to "Резисторы",
        "Терморезисторы" to "Резисторы",
        "Варисторы" to "Резисторы",
        "Конденсаторы" to "Конденсаторы",
        "Диоды и стабилитроны" to "Полупроводниковые приборы",
        "Транзисторы" to "Полупроводниковые приборы",
        "Оптопары" to "Полупроводниковые приборы",
        "Микросхемы" to "Микросхемы",
        "Радиокомпоненты" to "Радиокомпоненты",
        "Трансформаторы" to "Прочие",
        "Дроссели" to "Прочие",
        "Прочие" to "Прочие"
    )) {
        val list = bom.filter { it.category == category }
            .sortedWith(compareBy({ it.prefix }, { it.value }, { it.name }))
        if (list.isEmpty()) continue
        if (header != lastHeader) {
            out.zTableEmptyRow(); ++line
            if (line.isLastOnPage()) {
                out.zTableEmptyRow(); ++line
            }
            out.zTableHeaderRow(header); ++line
            lastHeader = header
        }
        list.groupBy { it.fullname() }.forEach { (name, group) ->
            out.zTableRow(name, group.size); ++line
        }
    }
    while (!line.isLastOnPage()) {
        out.zTableEmptyRow(); ++line
    }
    out.zDocumentFooter()
    writeFile(fileName, out.toString())
}

fun main(args: Array<String>) {
    if (args.size != 1) {
        println("Usage: bom.exe file.bom")
        return
    }
    var fileName = args[0]
    if (!fileName.endsWith(".bom", ignoreCase = true))
        fileName += ".bom"
    try {
        val bom = readBom(fileName)
        val board = readIni(fileName.replaceAfterLast('.', "txt"))
        makeList(board, bom, fileName.replaceAfterLast('.', "p.fodt"))
        makeZakaz(board, bom, fileName.replaceAfterLast('.', "z.fodt"))
    } catch (e: Throwable) {
        MessageBox(e.toString().drop(14))
    }
}
