package jetbrain

fun main() {
    val num: Int = 100

    val res: Double = Math.sqrt(num.toDouble())
    println(res) // 10.0

    println(num) // 100, it is not modified

    val n1: Int = 125
    val ch: Char = n1.toChar() // '}'
    val n2: Int = ch.code // 125

    // String conversion
    val sn = 8     // Int
    val sd = 10.09 // Double
    val sc = '@'   // Char
    val sb = true  // Boolean

    val s1 = sn.toString() // "8"
    val s2 = sd.toString() // "10.09"
    val s3 = sc.toString() // "@"
    val s4 = sb.toString() // "true"
}