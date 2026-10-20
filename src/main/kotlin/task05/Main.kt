package task05

// REQUIRES Kotlin 2.2+. `continue` inside the inline lambda skips the while loop.
inline fun orSkip(text: String?, onNull: () -> Double): Double =
    text?.toDoubleOrNull() ?: onNull()

fun main() {
    val prices = mutableListOf<Double>()
    println("Enter prices, one per line. Type 'done' to finish.")
    while (true) {
        val line = readln().trim()
        if (line == "done") break

        // This is the completed experiment: a custom inline function replaces run.
        val price = orSkip(line) {
            println("'$line' is not a number, skipped")
            continue
        }
        // Standard inline `let` allows a break from the enclosing while loop.
        price.takeIf { it > 10_000 }?.let {
            println("Price $it is too large, stopping")
            break
        }
        prices.add(price)
    }
    println("Items: ${prices.size}, total: ${prices.sum()}")
}
