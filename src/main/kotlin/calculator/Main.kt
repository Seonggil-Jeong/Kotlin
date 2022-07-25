package calculator

fun main() {
    while (true) {
        val input = readln()

        if (input == ("/exit")) {
            println("Bye!")
            break
        } else if (input.isEmpty()) {
            continue
        } else if (input.split(" ").size == 1) {
            println(input.toInt())
            continue
        }

        val (v1, v2) = input.split(" ").map { it.toInt() }
        println(add(v1, v2))

    }
}

fun add(value1:Int, value2: Int):Int {
    return value1 + value2
}