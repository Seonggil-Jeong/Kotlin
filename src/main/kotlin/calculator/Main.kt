package calculator

fun main() {
    val (value1, value2) = readln().split(" ").map { it.toInt() }
    println(add(value1, value2))
}

fun add(value1:Int, value2: Int):Int = value1 + value2