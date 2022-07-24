package jetbrain

import java.util.*

fun main() {
    val numbers = mutableListOf(10.8, 14.3, 13.5, 12.1, 9.7)
    println(numbers[0])

    val mutableListA = mutableListOf<Int>(1, 2, 3, 4, 3)

    val mutableListB = mutableListOf<String>("Kotlin", "JetBrains")


    val list = MutableList(5) {0}
    println(list)

    val stringList = mutableListOf<String>()
    stringList.add("name")

    print(name)
    val numbersInput = MutableList(5) { readln().toInt() } // on each line single numbers from 1 to 5
    println(numbersInput) // [1, 2, 3, 4, 5]


    val numbersMap = readln().split(" ").map { it.toInt() }.toMutableList()
    println(numbersMap) // [1, 2, 3, 4, 5]



    val inputValue: String = readln()
    val numbersList = inputValue.split(", ").map {it.toInt()}.toMutableList()

    // do not touch the lines below
    println(numbersList.joinToString())
}