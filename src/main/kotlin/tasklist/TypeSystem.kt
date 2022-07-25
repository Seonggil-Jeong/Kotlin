package tasklist


fun main() {
    // Any type , -> Int, String
    val message: Any = "Important message" // Any = Object

}

fun stringify(any: Any) {
    // At the very bottom of the Kotlin type hierarchy is the type Nothing.
    any?.toString()  // '?' can be omitted
    any!!.toString() // '!!' can be omitted
}

fun fail(): Nothing { // return Nothing
    throw Exception("Fail!")
}

fun logCurrentState(): Unit {
// Unit type can be used as the return type of a function that does not return any meaningful value
    println("Current state of a program")
}
