package task08

const val VAT_RATE = 0.12

// Whole property marked inline (no backing field).
inline val Double.withVat: Double
    get() = this * (1 + VAT_RATE)

// Only the getter marked inline (also no backing field).
val String.wordCount: Int
    inline get() = split(" ").count { it.isNotBlank() }

// Extra task: input number of kilobytes, output number of bytes.
inline val Int.kilobytes: Int
    get() = this * 1024

fun main() {
    print("Price without VAT: ")
    val price = readln().trim().toDoubleOrNull()
    if (price == null) {
        println("Not a number")
        return
    }
    println("Price with VAT: ${"%.2f".format(price.withVat)}")
    print("Write a sentence: ")
    val sentence = readln()
    println("Words: ${sentence.wordCount}")

    print("Number of kilobytes: ")
    val kb = readln().trim().toIntOrNull()
    if (kb == null) {
        println("Not a whole number")
    } else {
        println("$kb KB = ${kb.kilobytes} bytes")
    }
}
