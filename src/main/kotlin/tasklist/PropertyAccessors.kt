package tasklist

class Client {
    var name = "Unknown"
        get() {
            println("Somebody wants to know $field name")
            return field
        }
        set(value) {
            println("The name is changing. Old value is $field. New value is $value.")
            field = value
        }

    var age = 0
        get() {
            println("Age : $field")
            return field // return age = 무한 반복
        }
        set(value) {
            println("$field -> $value")
            field = value
        }

}

fun main() {

    val client = Client()
    client.age = 20
    client.age = 40
    println(client.age)

    var five = highFive()
    println(five)


}

class Six(var six: Int) {
    var seven: String = "seven"
    var nine: Int = seven.length
}

fun highFive(): Int {
    var eight: Int = 8
    return 5
}

class City(val name: String) {
    var population: Int = 0
        set(value) {
            field = if (value > 50_000_000) {
                50_000_000
            } else if (value < 0) {
                0
            } else {
                value
            }

        }
}