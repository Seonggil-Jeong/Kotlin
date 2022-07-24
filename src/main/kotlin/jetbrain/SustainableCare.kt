package jetbrain

val animals = arrayOf(camel, lion, deer, goose, bat, rabbit)
fun main() {

    while (true) {
        print("Please enter the number of the habitat you would like to view:")
        val animal = readln()

        if (animal.equals("exit")) {
            break

        }
        println(animals[animal.toInt()])
    }
    println("See you later!")

}