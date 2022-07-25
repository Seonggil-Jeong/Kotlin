package jetbrain

class MyClass {
    fun print() = println("Hello from print")

}

class MyClassWithProperty(var property: Int) {
    fun printProperty() {
        println(this.property)
    }
}


fun main() {
    val service: MyClass = MyClass()

    service.print()
    MyClassWithProperty(10).printProperty()
}

class Patient2(val name: String) {
    fun say() = println("Hello, my name is ${this.name}, I need a doctor.")

    // write the say method here
}