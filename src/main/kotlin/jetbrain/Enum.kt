package jetbrain

enum class Rainbow(val color:String) {
    RED("Red"),
    ORANGE("Orange"),
    YELLOW("Yellow"),
    GREEN("Green"),
    BLUE("Blue"),
    INDIGO("Indigo"),
    VIOLET("Violet")
}

enum class RainbowV2(val color: String, val rgb: String) {
    RED("Red", "#FF0000"),
    ORANGE("Orange", "#FF7F00"),
    YELLOW("Yellow", "#FFFF00"),
    GREEN("Green", "#00FF00"),
    BLUE("Blue", "#0000FF"),
    INDIGO("Indigo", "#4B0082"),
    VIOLET("Violet", "#8B00FF"),
    NULL("", "");

    fun printFullInfo() {
        println("Color - $color, rgb - $rgb")
    }
}

fun findByRgb(rgb: String): RainbowV2 {
    for (enum in RainbowV2.values()) {
        if (rgb == enum.rgb) return enum
    }
    return RainbowV2.NULL
}

enum class Materials {
    GLASS, WOOD, FABRIC, METAL, PLASTIC, CERAMICS, CONCRETE, ROCK
}

fun main() {
    println(RainbowV2.RED.rgb)

    val rgb = RainbowV2.RED
    rgb.printFullInfo()

    println(isRainbow("red2"))

    println(findByRgb("#FF0001"))
}


fun isRainbow(color: String): Boolean {
    for (enum in Rainbow.values()) {
        if (color.toUpperCase() == enum.name) return true

    }

    return false
}

enum class Currency(code: Int) {
    USD(840),
    EUR(978),
    GBP(826),
    RUB(643),
    UAH(980),
    KZT(398),
    CAD(124),
    JPY(392),
    CNY(156);
}
