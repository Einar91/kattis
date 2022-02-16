fun main() {
    var a = readLine()!!.toInt()
    var b = readLine()!!.toInt()

    if (a > 0) {
        if (b > 0) {
            println("1")
        } else {
            println("4")
        }
    } else {
        if (b > 0) {
            println("2")
        } else {
            println("3")
        }     
    }
}