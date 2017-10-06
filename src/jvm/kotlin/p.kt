/*
 *
 */

fun StringBuilder.pDocumentHeader() = append("""-----
${board.name} ${board.code}
Разработал: ${board.developed}
Проверил: ${board.checked}
Утвердил: ${board.approved}
-----
""")

fun StringBuilder.pTableHeaderRow(
        name: String
) = append("""    $name
""")

fun StringBuilder.pTableRow(
        refdes: String,
        name: String,
        count: Int
) = append("""${refdes.padEnd(10)}${name.padEnd(40)}${count}
""")

fun StringBuilder.pTableEmptyRow() = append("""
""")

fun StringBuilder.pDocumentFooter() = append("""-----""")
