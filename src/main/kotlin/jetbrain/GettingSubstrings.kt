package jetbrain

fun main() {
    val greeting = "Hello"

    println(greeting.substring(0, 3)) // "Hel"
    println(greeting.substring(1, 3)) // "el"
    println(greeting.substring(2))    // "llo"
    println(greeting.substring(4, 5)) // "o"

    println(greeting.substringAfter('l'))  // "lo"
    println(greeting.substringBefore('o')) // "Hell"
    println(greeting.substringBefore('z')) // "Hello"

    println(greeting.substringAfterLast('l'))  // "o"
    println(greeting.substringBeforeLast('l')) // "Hel"

    val example = "Kotlin is a language" // cannot be change
    example.replace(" language", "n island")
    println(example)


    val oldStr = "Hello"
    val value = 3
    println(
        if (oldStr.length < value) {
            oldStr
        } else {
            (oldStr.substring(value) + oldStr.substring(0, value))
        }
    )

    val str = "The"

    for (i in 0 until str.length) {
        print("${str[i]}${str[i]}")
    }

}