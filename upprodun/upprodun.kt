package upprodun

fun main() {
    val rooms = readLine()!!.toInt()
    val teams = readLine()!!.toInt()
    val teamsPerRoom = teams / rooms
    var remainder = teams % rooms
    for (i in 1..rooms) {
        var string = "*".repeat(teamsPerRoom)
        if (remainder != 0) {
            string += "*"
            remainder--
        }
        println(string)
    }
}