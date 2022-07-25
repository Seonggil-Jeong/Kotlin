package tasklist

fun main() {
    val mul2 = { a: Int, b: Int -> a * b } // Lambda
    val lambda: (Long, Long) -> Long = { left, right -> (left..right).reduce { acc, it -> acc * it } }
    println(mul2(10, 20))
    fun isNotDot(c: Char): Boolean = c != '.'
    val originalText = "I don't know... what to say..."


    println(originalText.map { isNotDot(it) })
    println(originalText.filter(::isNotDot)) // I don't know what to say
    fun(number: Int) = number.toString()
}