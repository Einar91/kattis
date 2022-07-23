package savingdaylight

fun main() {
    var input = readLine()
    while (input != null) {
        val (mnt, day, year, start, end) = input.split(" ")
        val (startH, startM) = start.split(":").map { it.toInt() }
        val (endH, endM) = end.split(":").map { it.toInt() }

        var minutes = 0
        var hours = 0
        if (startM > endM) {
            minutes = (60 - startM) + endM
            hours = endH - startH - 1
        } else {
            minutes = endM - startM
            hours = endH - startH
        }
        println("$mnt $day $year $hours hours $minutes minutes")
        input = readLine()
    }
}