package jetbrain

fun main() {
    val a = 10
    val b = 20
    var max = if (a > b) {
        println("Choose a")
        a
    } else {
        println("Choose b")
        b
    }
    println(max)

    println(
        if (a == b) {
            "a equal b"
        } else if (a > b) {
            "a is greater than b"
        } else {
            "a is less than b"
        }
    )
    max = if (a > b) a else b // one line

    max = a // try to avoid var if possible
    if (b > a) max = b


    val s = readln().toInt()
    val e = readln().toInt()
    val h = readln().toInt()
    println(
        if (h < s) {
            "Deficiency"
        } else if (e < h) {
            "Excess"
        } else {
            "Normal"
        }

    )
}