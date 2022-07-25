package jetbrain

fun main() {
    val mutList2D = mutableListOf<MutableList<Int>>(
        mutableListOf<Int>(0),
        mutableListOf<Int>(1, 2),
        mutableListOf<Int>(3, 4, 5)
    )

    print(mutList2D[1][1])

    val mutListOfString2D = mutableListOf(
        mutableListOf<String>("to", "be", "or"),
        mutableListOf<String>("not", "to", "be")
    )

    val mutListOfStringAndInt2D = mutableListOf(
        mutableListOf<String>("Practice", "makes", "perfect"),
        mutableListOf<Int>(1, 2)
    )


    val inputList = mutableListOf(
        mutableListOf(1, 2),
        mutableListOf(3, 4),
        mutableListOf(5, 6),
        mutableListOf(7, 8)
    )
    println("[${inputList[inputList.size - 1]}, ${inputList[0]}]")

    val len = 3
    val numberList = mutableListOf(
        mutableListOf(1, 0, 1),
        mutableListOf(0, 0, 0),
        mutableListOf(1, 0, 1)
    )

    println("${numberList[0][0]} ${numberList[0][numberList[0].size - 1]}\n" +
            "${numberList[numberList.size - 1][0]} ${numberList[numberList.size - 1][numberList[0].size - 1]}")


}