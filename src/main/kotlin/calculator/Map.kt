package calculator

import java.math.BigInteger

fun main() {
    /**
     * immutable implies that the size and content of the collection cannot be changed once it's initialized
     */
    val students = mapOf(
        "Zhenya" to 5,
        "Vlad" to 4,
        "Nina" to 5
    )
    println(students) // output: {Zhenya=5, Vlad=4, Nina=5}

    students["Nina"] // get

    val employees = mapOf(
        "Mike" to 1500,
        "Jim" to 500,
        "Sara" to 1000
    )

    for ((k, v) in employees)
        println("$k $v")

    // Mutable Map
    val staff = mutableMapOf(
        "John" to 500,
        "Mike" to 1000,
        "Lara" to 1300
    )


    staff["Sg"] = 6000


}

