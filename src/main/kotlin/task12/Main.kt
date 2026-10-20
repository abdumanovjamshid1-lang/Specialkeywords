package task12

class Contact(val name: String, val phone: String) {
    override fun toString(): String = "$name ($phone)"

    // Two contacts are treated as duplicates if their phone numbers match.
    override fun equals(other: Any?): Boolean =
        other is Contact && other.phone == phone

    // Required consistency: equal contacts must have equal hash codes.
    override fun hashCode(): Int = phone.hashCode()
}

fun readContact(): Contact {
    print("Name: ")
    val name = readln().trim()
    print("Phone: ")
    val phone = readln().trim()
    return Contact(name, phone)
}

fun main() {
    println("--- first contact ---")
    val a = readContact()
    println("--- second contact ---")
    val b = readContact()
    println(a)
    println("a == b: ${a == b}")
    println("a === b: ${a === b}")
    val book = hashSetOf(a)
    println("book contains b: ${b in book}")
}
