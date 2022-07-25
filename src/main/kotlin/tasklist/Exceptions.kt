package tasklist

import java.util.Objects

fun main() {
    tryCatch(-1)

    /**
     * nullable
     */
    //    var name: String = null
    var name: String? = null // can be null with {?} / nullable

    val line: String? = readLine()
    // write your code here. Do not change line above
    println(
        line?.length?: -1
    )// need a fix

}


fun throwingExceptions(value: Int) {

    if (value < 0) {
        throw java.lang.Exception("Value can't be negative")
    }
}


fun tryCatch(value: Int) {
    try {
        if (value < 0) {
            throw java.lang.Exception("Value can't be negative")
        }
    } catch (e: Exception) {
        println("there is Exception")
        println(e.message)
    } finally {
        println("End tryCatch fun!")
    }
}

fun nullOrNotNull(value: Int?): Int = value ?: -1
