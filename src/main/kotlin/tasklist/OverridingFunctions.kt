package tasklist

import kotlin.math.roundToInt

open class Transport(val cost: Int) {
    open fun getFullInfo(): String {
        return "$$cost cost"
    }

    fun getTax(): String {
        return "$${(cost * 0.25).roundToInt()} tax"
    }
}

open class Ship(cost: Int, val color: String) : Transport(cost) {
    override fun getFullInfo(): String { // override
        return super.getFullInfo() + ", $color color"
    }

    fun onlyShip(): String {
        return "only Ship"

    }
}

fun getTransportInfo(transport: Transport): String {
    return "transport info: " + transport.getFullInfo()
}

fun main() {
    val transport = Transport(1000)
    val ship = Ship(2000, "marine")
    println(getTransportInfo(transport))
    println(getTransportInfo(ship))
    ship.onlyShip()
//    transport.onlyShip() X
    // As you can see it handles the Transport class. What is more, it can process easily any child of this class too

    val leatherCase = LeatherCase(190, "brown")
    val softCase = SoftCase(120, "yellow")
    val woodCase = WoodCase(230, "orange")
    println(getCaseTax(leatherCase) + getCaseTax(softCase) + getCaseTax(woodCase))
}


open class Me {
    open fun returnName(name: String): String = "My name is $name"
}

open class ActuallyMe : Me() {
    fun answer() {
        super.returnName("Seonggil")
    }
    override fun returnName(name: String): String = "Actually, my name is $name"
}

open class Case(val cost: Int) {
    fun getFullInfo(): String = "$$cost cost" + getTax()

    open fun getTax(): Int = (cost * 0.25).roundToInt()
}

open class SoftCase(cost: Int, val color: String) : Case(cost) {
    override fun getTax(): Int = super.getTax() + 100
}

open class WoodCase(cost: Int, val color: String) : Case(cost)

open class LeatherCase(cost: Int, color: String) : SoftCase(cost, color) {
    override fun getTax(): Int = (cost * 0.35).roundToInt()
}

fun getCaseTax(case: Case): Int = case.getTax()
