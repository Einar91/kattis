package sidewayssorting

fun main() {
    var testCase = readLine()
    while (testCase!![0] != '0') {
        val (r, c) = testCase.split(" ")
        val arr = Array(r.toInt()) {CharArray(c.toInt())}
        for (i in 0 until r.toInt()) {
            val row = readLine()!!.toList()
            for (j in 0 until c.toInt()) {
                arr[i][j] = row[j]
            }
        }

        val words = mutableListOf<String>()
        for (i in 0 until c.toInt()) {
            var s = ""
            for (j in 0 until r.toInt()) {
                s += arr[j][i]
            }
            words.add(s)
        }

        val sorted = words.sortedWith(String.CASE_INSENSITIVE_ORDER)
        for (i in 0 until r.toInt()) {
            for (j in 0 until c.toInt()) {
                print(sorted[j][i])
            }
            println()
        }

        println()
        testCase = readLine()
    }
}