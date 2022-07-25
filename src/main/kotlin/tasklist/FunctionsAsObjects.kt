package tasklist

fun sum(a: Int, b: Int): Int = a + b

fun main() {
    val sumObject: (Int, Int) -> Int = ::sum
    println(sumObject(1, 2))

    val generate: (String) -> (Int) -> Int = ::generate
    val method: (Int) -> Int = generate("half")
    println(method(10))

}
fun identity(a: Int) = a

fun half(a: Int) = a / 2

fun zero(a: Int = 0) = 0

fun generate(functionName: String): (Int) -> Int {
    return when (functionName) {
        "identity" -> ::identity
        "half" -> ::half
        else -> ::zero
    }
}