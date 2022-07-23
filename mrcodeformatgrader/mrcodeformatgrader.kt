package mrcodeformatgrader

fun main() {
    val (totalLines, _) = readLine()!!.split(" ").map { it.toInt() }
    val listOfErrors = readLine()!!.split(" ").map { it.toInt() }

    // -- Dette fungerer men tar for lang tid å truncate
    val correctLines = mutableListOf<Int>()
    for (i in 1..totalLines) {
        if(!listOfErrors.contains(i)) correctLines.add(i)
    }


    printOutput("Errors", truncateList(listOfErrors))
    printOutput("Correct", truncateList(correctLines))
}

fun truncateList(numList: List<Int>): List<String> {
    val output = mutableListOf<String>()

    var lastLine: Int
    val listedErr = mutableListOf<Int>()
    for (i in numList.indices) {
        if (listedErr.contains(numList[i])) {
            continue
        }
        val firstErrLine = numList[i]
        lastLine = numList[i]

        var next = i+1
        while (next < numList.size && lastLine == numList[next] - 1) {
            lastLine = numList[next++]
        }

        if (firstErrLine == lastLine) {
            output.add(firstErrLine.toString())
        } else {
            output.add("$firstErrLine-$lastLine")
        }

        for (j in firstErrLine..lastLine) {
            listedErr.add(j)
        }
    }
    return output
}

fun printOutput(prefix: String, stringList: List<String>) {
    var string = "$prefix: "
    for (i in stringList.indices) {
        if (i == stringList.size-1) {
            string += " and ${stringList[i]}\n"
        } else if (i == stringList.size-2) {
            string += stringList[i]
        } else {
            string += "${stringList[i]}, "
        }
    }
    print(string)
}

// Denne gir feil svar på testcase 4
fun generateCorrectNumbers(errorList: List<String>, totalLines: Int): List<String> {
    val correct = mutableListOf<String>()

    var lastLine = 1
    for (i in errorList.indices) {
        val parts = errorList[i].split("-").map { it.toInt() }
        val first = parts[0]
        val last = if (parts.size == 1) {
            parts[0]
        } else {
            parts[1]
        }

        if (first == 1) {
            lastLine = last
            continue
        }

        if (lastLine == 1 && first == 2) {
            correct.add("1")
        }
        else if (lastLine == first - 2) {
            correct.add("${lastLine + 1}")
        } else {
            correct.add("${lastLine+1}-${first-1}")
        }
        lastLine = last
    }
    if (lastLine != totalLines) {
        correct.add("${lastLine+1}-${totalLines}")
    }

    return correct
}