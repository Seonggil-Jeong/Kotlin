package jetbrain

import kotlin.reflect.typeOf

fun main() {
    val num: Int = 100
    val longNum: Long = 1000
    val result = num + longNum // 1100, Long

    println(result)

    val one: Byte = 1
    val two: Byte = 2
    val three = one + two // 3, Int

    /**
     * Type coercion does not occur when a value is put into the variable.
     * For example, val longValue: Long = 10.toInt() is incorrect,
     * because 10 is Int and longValue requires Long type.
     */

    val intValue: Int = 10.0.toInt()

    println(intValue)

    println(Float.SIZE_BYTES)
    println(Int.SIZE_BYTES)
    println(Long.SIZE_BYTES)
    println(Double.SIZE_BYTES)
    println(Short.SIZE_BYTES)

    /**
     * {Byte, Short} -> {Int} -> {Long} -> {Float} -> {Double}
     */



}