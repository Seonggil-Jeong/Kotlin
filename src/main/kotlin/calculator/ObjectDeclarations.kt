package calculator

object PlayingField {
    object Size {
        var width: Int = 0
        var height: Int = 0
    }

    fun changeSize(newWidth: Int, newHeight: Int) {
        Size.width = newWidth
        Size.height = newHeight
    }
}

object Me {
    var CURRENT_AGE = 18
    var EYES_COLOR = "green"
    var HEIGHT = 188
}