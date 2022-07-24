package jetbrain

fun main() {
    val numbers = readLine()!!.split(' ').map { it.toInt() }.toMutableList()

    numbers.add(0, numbers.sum())
    numbers.removeAt(numbers.size - 2)

    println(numbers.joinToString(" "))

    val firstList = readLine()!!.split(' ').map { it }.toMutableList()
    val secondList = readLine()!!.split(' ').map { it }.toMutableList()
    firstList.addAll(secondList)

    print(firstList.joinToString())



}