package jetbrain

fun main() {
    val range:IntRange = 1..10 // type

    val aS = readln().toInt()
    val aE = readln().toInt()
    val bS = readln().toInt()
    val bE = readln().toInt()
    val value = readln().toInt()

    println(
        if (value in aS..aE || value in bS..bE) {
            "true"
        } else {
            "false"
        }
    )

}