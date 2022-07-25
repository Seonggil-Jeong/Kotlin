package jetbrain

class Patient {
    var name: String = ""
    var age: Int = 0
    var height: Double = 0.0
}
fun main() {
    val john = Patient()
    john.name = "John"
    john.age = 20
    john.height = 175.0

    val alice = Patient()
    alice.name = "Alice"
    alice.age = 22
    alice.height = 165.0

    println("${john.name}: ${john.age} yrs, ${john.height} cm")
    println("${alice.name}: ${alice.age} yrs, ${alice.height} cm")

}