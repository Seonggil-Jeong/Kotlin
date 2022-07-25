package tasklist

fun main() {
    println("Input an action (add, print, end):")
    val mutList = emptyList<String>().toMutableList()
    var run = true

    while (run) {
        val line = readln().trim()
        if (line.isEmpty()) { //
            run = false // 실행 종료
            break
        } else mutList.add(line) // 작업 추가
    }
    // 등록된 작업이 없을 경우
    if (mutList.isEmpty()) println("No tasks have been input") else { //  있다면 작업 출력
        for (index in mutList.indices) {
            val spacing = if (index < 9) "  " else " "
            println("${index + 1}$spacing${mutList[index]}")
        }
    }


}


