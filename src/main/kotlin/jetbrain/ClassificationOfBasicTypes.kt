package jetbrain

fun main() {
    val zero = 0 // Int
    val twoMillion = 2_000_000L           // Long because it is tagged with L
    val bigNumber = 1_000_000_000_000_000 // Long, Kotlin automatically chooses it (Int is too small)
    val ten: Long = 10

    val shortNumber: Short = 15
    val byteNumber: Byte = 15

    println(Int.MIN_VALUE)  // -2147483648
    println(Int.MAX_VALUE)  // 2147483647
    println(Long.MIN_VALUE) // -9223372036854775808
    println(Long.MAX_VALUE) // 9223372036854775807


    println(Int.SIZE_BYTES) // 4
    println(Int.SIZE_BITS) //  4 * 8

    val charValue = 'a' // Char = ''
    val enabled = true // boolean

    val creditCardNumber = "1234 5678 9012 3456" // String = ""

    println(Int.SIZE_BITS)
    println(Int.MIN_VALUE)
    println(Int.MAX_VALUE)


    val big = 999_999_999_999_999_999 // Long Type
}