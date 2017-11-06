/*
 * Licensed under the Apache License, Version 2.0
 */

fun StringBuilder.zDocumentHeader() = append("""-----
${Board.name} ${Board.code}
Разработал: ${Board.developed}
Проверил: ${Board.checked}
Утвердил: ${Board.approved}
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
