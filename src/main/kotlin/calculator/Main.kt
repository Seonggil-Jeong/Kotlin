import java.lang.Exception

fun calculate(input: String){
    val fixedInput = input.replace("(--)+".toRegex(), "+")
        .replace("((-[+])|([+]-))".toRegex(), "-")
        .replace("[+]+".toRegex(), "+")
        .replace("[+]\\s*".toRegex(), "+")
        .replace("[-]\\s*".toRegex(), "-")
        .split(' ')
    try {
        println(fixedInput.sumOf { it.toInt() })
    } catch (e: Exception) {
        println("Invalid input")
    }
}


fun main() {
    while(true) {
        val input = readLine()!!
        if (input.isEmpty())
            continue

        when(input[0]){
            '/' -> when(input){
                "/exit" -> {
                    println("Bye!")
                    break
                }
                "/help" -> println("Simple calculator")
                else ->  println("Unknown command")
            }
            '+' -> calculate(input)
            '-' -> calculate(input)
            in '0'..'9' -> calculate(input)
            else -> println("Invalid input")
        }
    }
}