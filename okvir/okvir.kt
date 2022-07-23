package okvir

fun main() {
    val (M, N) = readLine()!!.split(" ").map { it.toInt() }
    val (U, L, R, D) = readLine()!!.split(" ").map { it.toInt() }

    val puzzle = mutableListOf<String>()
    for (x in 1..M) {
        puzzle.add(readLine()!!)
    }

    for (i in 0 until (M+U+D)) {
        for (j in 0 until (N+L+R)) {
            // Toppraden
            if (i < U) {
                if (i % 2 == 0) {
                    if (j % 2 == 0) {
                        print('#')
                    } else {
                        print('.')
                    }
                } else {
                    if (j % 2 == 0) {
                        print('.')
                    } else {
                        print('#')
                    }
                }
            }

            // Siderader
            if (i >= U && i < (U+M)) {
                if (j == L) {
                    print(puzzle[i-U])
                }
                if (j < L || j >= L+N) {
                    if (i % 2 == 0) {
                        if (j % 2 == 0) {
                            print('#')
                        } else {
                            print('.')
                        }
                    } else {
                        if (j % 2 == 0) {
                            print('.')
                        } else {
                            print('#')
                        }
                    }
                }
            }

            // Sluttrader
            if (i >= U+M) {
                if (i % 2 == 0) {
                    if (j % 2 == 0) {
                        print('#')
                    } else {
                        print('.')
                    }
                } else {
                    if (j % 2 == 0) {
                        print('.')
                    } else {
                        print('#')
                    }
                }
            }
        }
        println()
    }
}