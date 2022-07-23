package princesspeach

fun main() {
    val (obstacles, obstaclesFound) = readLine()!!.split(" ").map { it.toInt() }
    val mariosObstacles = mutableListOf<Int>()
    for (i in 1..obstaclesFound) {
        mariosObstacles.add(readLine()!!.toInt())
    }
    var foundByMario = 0
    for (i in 0 until obstacles) {
        if (mariosObstacles.contains(i)) {
            foundByMario++
        } else {
            println(i)
        }
    }
    println("Mario got $foundByMario of the dangerous obstacles.")
}