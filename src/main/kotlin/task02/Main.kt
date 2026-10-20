package task02

val pending = mutableListOf<() -> Unit>()

// The reminder escapes this call, so it must be noinline.
inline fun addTask(save: () -> Unit, noinline reminder: () -> Unit) {
    save()
    pending.add(reminder)
}

fun main() {
    print("Task name: ")
    val name = readln().trim()
    addTask(
        save = { println("Saved: $name") },
        reminder = { println("Reminder: finish '$name'") },
    )
    // pending.add(save) inside addTask would be illegal: save is an inlined lambda.
    println("Pending reminders: ${pending.size}")
    pending.forEach { it() }
}
