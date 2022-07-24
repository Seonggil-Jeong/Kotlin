package jetbrain

fun main() {
    for (i in 1..4) {
        println(i)
    }

    for (ch in 'a'..'c') {
        println(ch)
    }

    val str = "Hello!"
    for (ch in str) { // don't have to split()
        println(ch)
    }

    for (i in 4 downTo 1) {
        println(i)
    }

    for (i in 1 until 4) { // 1 -> 3
        println(i)
    }

    for (i in 1..7 step 2) {
        println(i)
    }

    for (i in 7 downTo 1 step 2) { // 7 -> 1 , += 2
        println(i)
    }

    for (i in 8..16) {
        println(
            if (i % 5 == 0 && i % 3 == 0) {
                "FizzBuzz"
            } else if (i % 5 == 0) {
                "Buzz"
            } else if (i % 3 == 0) {
                "Fizz"
            } else {
                i
            }
        )
    }
}