package task13

fun Any.typeName(): String = this::class.simpleName ?: "anonymous"

fun describe(value: Any?): String = when (value) {
    null -> "no value"
    is Int -> "a number, doubled it is ${value * 2}"
    is Boolean -> if (value) "switched ON" else "switched OFF"
    is String -> "a text of ${value.length} characters"
    is Double -> "a decimal number: $value" // Extra exercise.
    else -> "an unknown type: ${value.typeName()}"
}

fun main() {
    val settings: Map<String, Any?> = mapOf(
        "volume" to 7,
        "darkMode" to true,
        "username" to "Dilnoza",
        "theme" to null,
        "ratio" to 1.5,
    )
    println("Settings: ${settings.keys}")
    print("Setting name: ")
    val key = readln().trim()
    if (key !in settings) {
        println("No such setting")
        return
    }
    val value = settings[key]
    println("$key is ${describe(value)}")

    val asNumber = value as? Int
    println("as? Int gives: $asNumber")

    // Show all three casts in one runnable program, catching expected failures.
    try {
        val asText = value as String
        println("as String gives: $asText")
    } catch (e: Exception) {
        println("as String failed: ${e::class.simpleName}: ${e.message}")
    }
    println("as? String gives: ${value as? String}")
    try {
        val nullableText = value as String?
        println("as String? gives: $nullableText")
    } catch (e: Exception) {
        println("as String? failed: ${e::class.simpleName}: ${e.message}")
    }
    println("5.typeName() = ${5.typeName()}")
    println("\"x\".typeName() = ${"x".typeName()}")
}
