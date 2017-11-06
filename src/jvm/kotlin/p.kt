/*
 * Licensed under the Apache License, Version 2.0
 */

fun StringBuilder.pDocumentHeader() = append("""-----
${Board.name} ${Board.code}
Разработал: ${Board.developed}
Проверил: ${Board.checked}
Утвердил: ${Board.approved}
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
