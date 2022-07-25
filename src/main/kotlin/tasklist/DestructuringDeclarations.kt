package tasklist


data class User(val name: String, val age: Int, val isAdmin: Boolean)


val anonim = User("Anonim", 999, false)
fun main() {
    var (userName, userAge, isAdmin) = anonim
    println(userName)  // prints Anonim
    println(userAge)   // prints 999
    println(isAdmin)   // prints false

    userName = anonim.component1()
    userAge = anonim.component2()
    isAdmin = anonim.component3()

    println(userName)  // prints Anonim
    println(userAge)   // prints 999
    println(isAdmin)   // prints false
    var (userName2, _, isAdmin2) = anonim // {_} It skips a variable in an object

}