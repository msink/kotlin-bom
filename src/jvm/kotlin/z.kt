/*
 * Licensed under the Apache License, Version 2.0
 */

fun StringBuilder.zDocumentHeader() = append("""-----
${board.name} ${board.code}
Разработал: ${board.developed}
Проверил: ${board.checked}
Утвердил: ${board.approved}
-----
""")

fun StringBuilder.zTableHeaderRow(
        name: String
) = append("""    $name
""")

fun StringBuilder.zTableRow(
        name: String,
        count: Int
) = append("""${name.padEnd(40)}${count}
""")

fun StringBuilder.zTableEmptyRow() = append("""
""")

fun StringBuilder.zDocumentFooter() = append("""-----""")
