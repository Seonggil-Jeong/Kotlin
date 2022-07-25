package jetbrain

fun main() {
    val string = "cat" // creating the "cat" string
    val regex = Regex("cat") // creating the "cat" regex

    val stringCat = "cat"
    val stringDog = "dog"
    val stringCats = "cats"

    println(regex.matches(stringCat))   // true
    println(regex.matches(stringDog))   // false
    println(regex.matches(stringCats))  // false

    val answer = "I can do my homework on time!"
    val answerRegex = Regex("I can.?t? do my homework on time!")
    println(answerRegex.matches(answer))

    val report = "20 wrong answers"

    val reportList = report.split(" ")

    println(
        if (reportList[0].toInt() >= 10) "false" else "true"

    )




}