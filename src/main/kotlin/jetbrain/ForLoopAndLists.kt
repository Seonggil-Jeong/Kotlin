package jetbrain

fun main() {
    val daysOfWeek = mutableListOf("Sun", "Mon", "Tues", "Wed", "Thur", "Fri", "Sat")

    for (day in daysOfWeek) {
        println(day)
    }

    for (index in daysOfWeek.indices) { // Iterating by indexes
        println("$index: ${daysOfWeek[index]}")
    }

    for (index in daysOfWeek.lastIndex downTo 0) {
        println("$index: ${daysOfWeek[index]}")
    }


    var count = 0
    val list = mutableListOf<Int>()
    for (i in 0 until readln().toInt()) {
        list.add(readln().toInt())
    }

    val check: Int = readln().toInt()


    for (i in list) {
        if (i == check) {
            count++
        }

    }

    println(count)


}