import java.io.*
import java.nio.charset.Charset

fun readFile(fileName: String) : List<String> {
    return File(fileName).readLines(Charset.forName("windows-1251"))
}

fun writeFile(fileName: String, out: String) {
    File(fileName).printWriter().use { it.print(out) }
}
