package calculator


fun main() {
    while (true) {
        val input = readln()
        var rValue = 0
        val valueList = mutableListOf<Int>()

        if (input == ("/exit")) {
            println("Bye!")
            break
        } else if (input == "/help") {
            println("The program calculates the sum of numbers")
            continue
        }
        else if (input.isEmpty()) {
            continue
        } else if (input.split(" ").size == 1) {
            println(input.toInt())
            continue
        } else {
            input.split(" ").map { valueList.add(it.toInt()) }
        }
        for (i in valueList) {
            rValue += i
        }
        println(rValue)

    }
}