package task09

@PublishedApi
internal var debugEnabled = false

// Lazy message: only evaluated if logging is enabled.
inline fun debug(message: () -> String) {
    if (debugEnabled) println("[DEBUG] ${message()}")
}

// Experiment: eager evaluation means buildReport() runs before this call.
fun debugEager(message: String) {
    if (debugEnabled) println("[DEBUG] $message")
}

fun buildReport(): String {
    println("(building the report...)")
    return "report with 1000 rows"
}

fun main() {
    print("Enable debug logging? (yes/no): ")
    debugEnabled = readln().trim().equals("yes", ignoreCase = true)
    debug { buildReport() }
    // Try replacing the line above with: debugEager(buildReport())
    println("Program finished")
}
