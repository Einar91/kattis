package warehouse

fun main() {
    val numTestCases = readLine()!!.toInt()
    for (i in 1..numTestCases) {
        val numShipments = readLine()!!.toInt()
        val toys = mutableMapOf<String, Int>()
        for (shipment in 1..numShipments) {
            val (toy, num) = readLine()!!.split(" ")
            toys.putIfAbsent(toy, 0)
            toys[toy] = toys[toy]!! + num.toInt()
        }
        println(toys.size)

        // Måte en å sortere på, tester for alfabetisk order på keys
        val tmp = mutableMapOf<String, Int>()
        toys.entries.sortedBy { it.key }.forEach{tmp[it.key] = it.value}

        // Måte to å sortere på, tester for int values
        val output = tmp.toList().sortedByDescending { (key, value) -> value }.toMap()
        output.forEach { (k,v) -> println("$k $v")}
    }
}