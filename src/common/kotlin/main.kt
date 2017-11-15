/*
 * Licensed under the Apache License, Version 2.0
 */

object Board {
    var name        = ""
    var code        = ""
    var developed   = ""
    var checked     = ""
    var approved    = ""
}

data class Component(
    val refdes: String,
    val category: String,
    val prefix: String,
    val value: Int = 0,
    private val suffix: String = "") {
    val name = (prefix + suffix)
        .replace("+-", "±")
        .replace("\"C", "°C")
        .replace("\"С", "°C")
    var replacements = emptyList<String>()
    fun fullname() = if (replacements.isEmpty()) name else name + replacements.joinToString(prefix = " (", postfix = ")")
}

fun readIni(fileName: String) {
    Board.name = fileName.substringAfterLast("\\").substringBefore(".")
    val lines = readFile(fileName, maybeAbsent = true)
    lines.forEach {
        when {
            it.startsWith("Код:")        -> Board.code = it.substringAfter(":").trim()
            it.startsWith("Разработал:") -> Board.developed = it.substringAfter(":").trim()
            it.startsWith("Проверил:")   -> Board.checked = it.substringAfter(":").trim()
            it.startsWith("Утвердил:")   -> Board.approved = it.substringAfter(":").trim()
        }
    }
}

private fun String.takeInt() : Int {
    val str = takeWhile { it.isDigit() }
    return if (str.isEmpty()) 0 else str.toInt()
}

private fun String.takeDouble() : Double {
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
    endsWith('n') -> "0," + dropLast(1).padStart(3, '0') + " мкФ"
    else -> this + " пФ"
}

private fun String.toCInt() = when {
    contains(',') -> (replaceFirst(',', '.').takeDouble() * 1000000.0).toInt()
    contains('.') -> (takeDouble() * 1000000.0).toInt()
    endsWith('n') -> (takeDouble() * 1000.0).toInt()
    else -> takeInt()
}

fun readBom(fileName: String) : List<Component> {
    fun String.parseCSV() : List<String> = split('@').map { it.trim('"') }
    val lines = readFile(fileName)
    if (lines.size < 3 || !lines[1].isEmpty())
        throw Error("Bad input file '$fileName'")

    val header = lines[0].parseCSV()
    fun List<String>.field(key: String) : Int = indexOf(key).also { if (it < 0)
        throw Error("Bad input file '$fileName': field '$key' not found") }
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
            refdes.startsWith("RT") -> Component(refdes, "Терморезисторы", name)
            refdes.startsWith("RU") -> Component(refdes, "Варисторы", name)
            refdes.startsWith("RN") -> Component(refdes, "Наборы резисторов",
                    description,
                    value.toRInt(),
                    "-" + value.toRString() + when {
                        percent.isNotEmpty() -> percent
                        else -> "+-5%"
                    })
            refdes.startsWith("R") -> Component(refdes, "Резисторы",
                    when {
                        pattern.startsWith("SMD") -> "SMD-" + pattern.substring(3, 7)
                        part.isNotEmpty() -> part
                        else -> "С2-23"
                    } + "-" + when(component) {
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
                    value.toRInt(),
                    "-" + value.toRString() + when {
                        percent.isNotEmpty() -> percent
                        else -> "+-5%"
                    })
            refdes.startsWith("C") -> Component(refdes, "Конденсаторы",
                    when {
                        pattern.startsWith("SMD") -> "SMD-" + pattern.substring(3, 7)
                        part.isNotEmpty() -> part
                        else -> "???"
                    },
                    value.toCInt(),
                    when {
                        pattern.startsWith("SMD") -> "-" + when {
                            part.isNotEmpty() -> part
                            else -> "Z5U"
                        }
                        else -> ""
                    } + "-" + value.toCString() + when {
                        percent.isNotEmpty() -> percent
                        else -> "+-20%"
                    })
            refdes.startsWith("L") -> Component(refdes, "Дроссели",
                    when {
                        description.isNotEmpty() -> description
                        value.startsWith(component) -> value
                        else -> component + "-" + value
                    })
            refdes.startsWith("XP") -> Component(refdes, "Радиокомпоненты", "Вилка " + name)
            refdes.startsWith("JP") -> Component(refdes, "Радиокомпоненты", "Вилка " + name)
            refdes.startsWith("XS") -> Component(refdes, "Радиокомпоненты", "Розетка " + name)
            refdes.startsWith("VD") -> Component(refdes, "Диоды и стабилитроны", name)
            refdes.startsWith("VT") -> Component(refdes, "Транзисторы", name)
            refdes.startsWith("DO") -> Component(refdes, "Оптопары", name)
            refdes.startsWith("D") -> Component(refdes, "Микросхемы", name)
            refdes.startsWith("TV") -> Component(refdes, "Трансформаторы", name)
            else -> Component(refdes, "Прочие", name)
        }
    }

    return bom.filter {
        !it.refdes.endsWith('-') && (!it.refdes.endsWith('*') || run {
            val key = it.refdes.trimEnd('*')
            val real = bom.find { it.refdes == key }
            real == null || run {
                real.replacements += it.name
                false
            }
        })
    } + List(bom.count { it.refdes.startsWith("FU") } * 2) {
        Component("XF${it + 1}", "Прочие", "Держатель вставки плавкой FH-100")
    }
}

fun Int.isLastOnPage() = when {
    this == 28 -> true
    (this - 29).rem(32) == 31 -> true
    else -> false
}

fun makeList(bom: List<Component>, fileName: String) {
    val out = StringBuilder()
    out.pDocumentHeader()
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
                "Прочие")) {
        val list = bom.filter { it.category == category }
        if (list.isEmpty()) continue
        out.pTableEmptyRow(); ++line
        if (line.isLastOnPage()) {
            out.pTableEmptyRow(); ++line
        }
        out.pTableHeaderRow(category); ++line
        var first = list[0]
        var count = 1
        list.forEachIndexed { i, current ->
            if (i < list.lastIndex && list[i + 1].fullname() == first.fullname()) {
                count++
            } else {
                val refdes = when (count) {
                    1 -> current.refdes
                    2 -> first.refdes + ", " + current.refdes
                    else -> first.refdes + ".." + current.refdes
                }
                out.pTableRow(refdes, first.fullname(), count); ++line
                if (i < list.lastIndex) {
                    first = list[i + 1]
                    count = 1
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

fun makeZakaz(bom: List<Component>, fileName: String) {
    val out = StringBuilder()
    out.zDocumentHeader()
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
                "Прочие" to "Прочие")) {
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
        readIni(fileName.replaceAfterLast('.', "txt"))
        makeList(bom, fileName.replaceAfterLast('.', "p.fodt"))
        makeZakaz(bom, fileName.replaceAfterLast('.', "z.fodt"))
    } catch (e: Throwable) {
        print("Fatal error: $e")
    }
}
