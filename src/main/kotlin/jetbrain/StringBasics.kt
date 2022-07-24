package jetbrain

fun main() {
    val language = "Kotlin"
    println(language.length) // 6

    val empty = ""
    println(empty.length) // 0

    val str1 = "ab"
    val str2 = "cde"
    val result = str1 + str2

    val one = "1"
    val two = "2"
    val twelve = one + two
    println(one)      // 1, no changes
    println(two)      // 2, no changes
    println(twelve)   // 12

    val stringPlusBoolean = "abc" + 10 + true
    println(stringPlusBoolean) // abc10true

    println("Hello".repeat(5))
    println("Eat. Sleep. Code.\n".repeat(5))

    val largeString = """
    This is the house that Jack built.
      
    This is the malt that lay in the house that Jack built.
       
    This is the rat that ate the malt
    That lay in the house that Jack built.
       
    This is the cat
    That killed the rat that ate the malt
    That lay in the house that Jack built.
""".trimIndent() // removes the first and the last lines and trim indents
    println(largeString)

    val name:String = "10" + "years" + "ago" + "we were" + "s in London"
}