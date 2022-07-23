package peg

fun main() {
    val board = readBoard()
    val legalMoves = findLegalMoves(board)
    println(legalMoves)
}

fun readBoard(): List<List<Char>> {
    val matrix = mutableListOf<List<Char>>()
    var input = readLine()
    while (input != null) {
        matrix.add(input.toList())
        input = readLine()
    }
    return matrix
}

fun findLegalMoves(board: List<List<Char>>): Int {
    var legalMoves = 0
    val numRows = board.size
    val numCols = board[0].size

    for (i in 0 until numRows) {
        for (j in 0 until numCols) {
            val piece = board[i][j]
            if (piece != 'o') {
                continue
            }

            // venstre
            if (j-2 >= 0 && board[i][j-1] == 'o' && board[i][j-2] == '.') {
                legalMoves++
            }
            // Høyre
            if (j+2 < numCols && board[i][j+1] == 'o' && board[i][j+2] == '.') {
                legalMoves++
            }
            // Opp
            if (i-2 >= 0 && board[i-1][j] == 'o' && board[i-2][j] == '.') {
                legalMoves++
            }
            // Ned
            if (i+2 < numRows && board[i+1][j] == 'o' && board[i+2][j] == '.') {
                legalMoves++
            }
        }
    }
    return legalMoves
}