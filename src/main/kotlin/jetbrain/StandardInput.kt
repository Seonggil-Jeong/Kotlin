package jetbrain

import java.util.*

fun main() {
    val line = readLine() // read Next Value
    println(line)

    val lineNotNull = readLine()!! // !! = this value is not Null
    println("lineNotNull : $lineNotNull")


    val lineInt: Int = readLine()!!.toInt()
    println(lineInt + 2)


    val (a, b) = readLine()!!.split(" ")


    /**
     * Java Scanner in Kotlin
     */

    val scanner = Scanner(System.`in`)

    val c = scanner.nextInt()

    println(c)
}