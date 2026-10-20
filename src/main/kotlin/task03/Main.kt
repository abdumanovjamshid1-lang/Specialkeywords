package task03

val contacts = listOf("Ali Karimov", "Dilnoza Yusupova", "Aliyah Smith", "Bobur Aliev")

fun findFirst(query: String) {
    contacts.forEach {
        if (it.contains(query, ignoreCase = true)) {
            println("First match: $it")
            return // Non-local return: leaves findFirst.
        }
    }
    println("No contact contains '$query'")
}

fun findAll(query: String) {
    contacts.forEach {
        if (!it.contains(query, ignoreCase = true)) return@forEach
        println("Match: $it")
    }
}

// The inline modifier permits a non-local return in its action lambda.
inline fun each(items: List<String>, action: (String) -> Unit) {
    for (item in items) action(item)
}

fun findWithEach(query: String) {
    each(contacts) {
        if (it.contains(query, ignoreCase = true)) {
            println("First match (custom each): $it")
            return
        }
    }
}

fun main() {
    print("Search: ")
    val query = readln().trim()
    findFirst(query)
    findAll(query)
    findWithEach(query)
    println("Search finished")
}
