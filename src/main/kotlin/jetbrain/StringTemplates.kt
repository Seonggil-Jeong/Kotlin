package jetbrain

fun main() {
    val language = "Kotlin"
    println("$language has ${language.length} letters in the name")

    println("Have a nice $language!")        // nice code
    println("Have a nice " + language + "!") // bad practice


    val value:Int = 12
    println("The obtained value is $value and its Int representation is ${value / 2}")
    println("The obtained value is $value and its Int representation is $value / 2")

    val number: String = "four"
    println("${number.length} repetitions of the word $number: ${number.repeat(number.length)}")


    val s = "string"
    print("$s.length") // = string.length
}