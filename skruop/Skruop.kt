package skruop

class Skruop {

    fun main() {
        var volume = 7
        val numLines = readLine()!!.toInt()
        for (num in 1..numLines) {
            val input = readLine()
            if (input == "Skru op!" && volume != 10) {
                volume++
            }
            if (input == "Skru ned!" && volume != 0) {
                volume--
            }
        }
        println(volume)
    }
}