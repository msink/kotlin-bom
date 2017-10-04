/*
 *
 */

object board {
    var name        = ""
    var code        = ""
    var developed   = ""
    var checked     = ""
    var approved    = "Кропотов"
}

data class Component(
    val refdes: String,
    val category: String,
    val prefix: String,
    val value: Int = 0,
    val suffix: String = "") {
    val name = (prefix + suffix)
        .replace("+-", "±")
        .replace("\"C", "°C")
        .replace("\"С", "°C")
}

fun readIni(fileName: String) {
    board.name = fileName.substringAfterLast("\\").substringBefore(".")
    val lines = readFile(fileName, maybeAbsent = true)
    lines.forEach {
        when {
            it.startsWith("Код:")        -> board.code = it.substringAfter(":").trim()
            it.startsWith("Разработал:") -> board.developed = it.substringAfter(":").trim()
            it.startsWith("Проверил:")   -> board.checked = it.substringAfter(":").trim()
            it.startsWith("Утвердил:")   -> board.approved = it.substringAfter(":").trim()
        }
    }
}

fun readBom(fileName: String) : List<Component> {
    fun String.parseCSV() : List<String> = this.split('@').map { it.trim('"') }
    val lines = readFile(fileName)
    if (lines.size < 3 || !lines[1].isEmpty())
        throw Error("Bad input file '$fileName'")

    val header = lines[0].parseCSV()
    fun List<String>.field(key: String) : Int = this.indexOf(key).also { if (it < 0)
        throw Error("Bad input file '$fileName': field '$key' not found") }
    val refdesIndex = header.field("RefDes")
    val componentIndex = header.field("ComponentName")
    val patternIndex = header.field("PatternName")
    val valueIndex = header.field("Value")
    val descriptionIndex = header.field("Description")

    return lines.drop(2).map {
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
        fun RValueString(value: String) = when {
            value.endsWith('M') -> value.dropLast(1) + " МОм"
            value.endsWith('k') -> value.dropLast(1).replace('.', ',') + " кОм"
            value.contains('k') -> value.replace('k', ',') + " кОм"
            else -> value + " Ом"
        }
        fun RValueInt(value: String) = when {
            value.endsWith('M') -> value.dropLast(1).toInt() * 1000 * 1000
            value.endsWith('k') -> (value.dropLast(1).replace(',', '.').toDouble() * 1000).toInt()
            value.contains('k') -> (value.replace('k', '.').toDouble() * 1000).toInt()
            else -> value.toInt()
        }
        fun CValueString(value: String) = when {
            value.contains(',') -> value + " мкФ"
            value.contains('.') -> value.replace('.', ',') +" мкФ"
            value.endsWith('n') -> "0," + value.dropLast(1).padStart(3, '0') + " мкФ"
            else -> value + " пФ"
        }
        fun CValueInt(value: String) = when {
            value.contains(',') -> (value.replace(',', '.').toDouble() * 1000 * 1000).toInt()
            value.contains('.') -> (value.toDouble() * 1000 * 1000).toInt()
            value.endsWith('n') -> value.dropLast(1).toInt() * 1000
            else -> value.toInt()
        }
        when {
            refdes.startsWith("RT") -> Component(refdes, "Терморезисторы", name)
            refdes.startsWith("RU") -> Component(refdes, "Варисторы", name)
            refdes.startsWith("RN") -> Component(refdes, "Наборы резисторов",
                    description,
                    RValueInt(value),
                    "-" + RValueString(value) + when {
                        percent.isNotEmpty() -> percent
                        else -> "+-5%"
                    })
            refdes.startsWith("R") -> Component(refdes, "Резисторы",
                    when {
                        pattern.startsWith("SMD") -> "SMD-" + pattern.drop(3)
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
                    RValueInt(value),
                    "-" + RValueString(value) + when {
                        percent.isNotEmpty() -> percent
                        else -> "+-5%"
                    })
            refdes.startsWith("C") -> Component(refdes, "Конденсаторы",
                    when {
                        pattern.startsWith("SMD") -> "SMD-" + pattern.drop(3)
                        part.isNotEmpty() -> part
                        else -> "???"
                    },
                    CValueInt(value),
                    when {
                        pattern.startsWith("SMD") -> "-" + when {
                            part.isNotEmpty() -> part
                            else -> "Z5U"
                        }
                        else -> ""
                    } + "-" + CValueString(value) + when {
                        percent.isNotEmpty() -> percent
                        else -> "+-20%"
                    })
            refdes.startsWith("L") -> Component(refdes, "Дроссели",
                    when {
                        value.startsWith(component) -> value
                        else -> component + "-" + value
                    })
            refdes.startsWith("XP") -> Component(refdes, "Радиокомпоненты", "Вилка " + name)
            refdes.startsWith("XS") -> Component(refdes, "Радиокомпоненты", "Розетка " + name)
            refdes.startsWith("VD") -> Component(refdes, "Диоды и стабилитроны", name)
            refdes.startsWith("VT") -> Component(refdes, "Транзисторы", name)
            refdes.startsWith("DO") -> Component(refdes, "Оптопары", name)
            refdes.startsWith("D") -> Component(refdes, "Микросхемы", name)
            refdes.startsWith("TV") -> Component(refdes, "Трансформаторы", name)
            else -> Component(refdes, "Прочие", name)
        }
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
        if (list.isEmpty()) continue;
        if (line.isLastOnPage()) {
            out.pTableEmptyRow(); ++line
        }
        out.pTableHeaderRow(category); ++line
        var first = list[0]
        var count = 1
        list.forEachIndexed { index, current ->
            if (index < list.lastIndex && list[index + 1].name == first.name) {
                count++
            } else {
                val refdes = when (count) {
                    1 -> current.refdes
                    2 -> first.refdes + ", " + current.refdes
                    else -> first.refdes + ".." + current.refdes
                }
                if (index < list.lastIndex) {
                    first = list[index + 1]
                    count = 1
                }
                out.pTableRow(refdes, first.name, count); ++line
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
        if (list.isEmpty()) continue;
        if (header != lastHeader) {
            if (line.isLastOnPage()) {
                out.zTableEmptyRow(); ++line
            }
            out.zTableHeaderRow(header); ++line
            lastHeader = header
        }
        list.groupBy { it.name }.forEach { (name, it) ->
            out.zTableRow(name, it.size); ++line
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
        print("Fatal error: ${e.message}")
    }
}
