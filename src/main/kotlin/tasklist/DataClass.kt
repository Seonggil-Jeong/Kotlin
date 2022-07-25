package tasklist

data class ClientData(val name: String, val age: Int, val gender: String) { //like Dto ..?
    var balance: Int = 0

    override fun toString(): String {
        return "Client(name='$name', age=$age, gender='$gender', balance=$balance)"
    }


}

data class Box(val height: Int, val length: Int, val width: Int) {
    var size: Int = height + length + width
}

fun main() {
    val bob = ClientData("Bob", 29, "Male")
    val john = bob.copy(name = "John")
    println(bob)
    println(john)
    val (h, l, w) = readln().split(" ").map { it.toInt() }
    val box = Box(height = h, length = l, width = w)
    println("Box(height=${box.height}, width=${box.width}, size=${box.size})")
}
