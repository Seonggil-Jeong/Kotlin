package jetbrain

fun printLine(line: String = "default", end: String = " (End) \n") = print("$line$end")

fun sum5(a1: Int = 0, a2: Int = 0, a3: Int = 0, a4: Int = 0, a5: Int = 0): Int = a1 + a2 + a3 + a4 + a5

fun polynomial(x: Int, c: Int, b: Int = 0, a: Int = 0): Int {
    return if (a != 0) {
        a * x * x + b * x + c
    } else if (b != 0) {
        b * x + c
    } else {
        c
    }
}

fun main() {

    sum5(8, 11)

    printLine("Kotlin", " <- End -> ")
    printLine()

    println(url("127.0.0.1"))

}

fun url(host: String = "localhost", port: Int = 443): String = "https://${host}:${port}"

class Site(val address: String, val foundationYear: Int)

fun makeReddit(address:String = "reddit.com",foundationYear: Int = 2005):Site = Site(address, foundationYear)