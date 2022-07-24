package jetbrain

fun main() {
    val chU = '\u0040' // it represents '@'
    println(chU) // @

    val ch = 'a'
    println(ch.code)   // 97
    val num = 97
    println(num.toChar()) // a

    val chIn: Char = readln().first() // input(abc) -> a

    println(chIn)

    val ch1 = 'b'
    val ch2 = ch1 + 1 // 'c'
    val ch3 = ch2 - 2 // 'a'

    val one = '1'

    val isDigit = one.isDigit()   // 숫자를 나타내는 경우 true
    val isLetter = one.isLetter() // 문자를 나타내는 경우 true


    for (i: Int in 1..4) {
        val value: Char = readln().first()
        println(value - 1)

    }

    val value: Char = readln().first()
    // 대문자인 경우 true
    println(value.isUpperCase() || (value.isDigit() && ((value <= '9') && (value>= '1'))))
}