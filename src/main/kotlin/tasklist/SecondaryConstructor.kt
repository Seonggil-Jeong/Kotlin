package tasklist

class Size { // or Size()
    var width: Int = 0
    var height: Int = 0

    // if you make constructor, can't use Size()

    constructor(_height: Int) {
        height = _height
    }

    constructor(_width: Int, _height: Int) {
        width = _width
        height = _height
    }

    constructor(_width: Int, _height: Double) {
        width = _width
        height = _height.toInt()
    }

    constructor(_height: Double, _width: Int) {
        width = _width
        height = _height.toInt()
    }
}

fun main() {
    val size1 = Size(7) // uses 1st constructor
    val size2 = Size(0,7) // uses 2nd constructor
    val size3 = Size(0, 7.0) // uses 3rd constructor
    val size4 = Size(7.0, 0) // uses 4th constructor
//    val size5 = Size()
//    DIRECTORY-NAME/FILE-NAME.EXTENSION/META_INF/
}