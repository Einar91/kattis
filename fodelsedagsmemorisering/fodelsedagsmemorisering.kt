package fodelsedagsmemorisering

fun main() {
    val numFriends = readLine()!!.toInt()
    val friends = mutableListOf<Friend>()
    for (num in 1..numFriends) {
        val parts = readLine()!!.split(" ")
        val f = Friend(parts[0], parts[1].toInt(), parts[2])
        var toRemove: Friend? = null
        for (friend in friends) {
            if (friend.date == f.date) {
                if (friend.likes < f.likes) {
                    toRemove = friend
                    break
                } else {
                    toRemove = f
                }
            }
        }
        friends.add(f)
        if (toRemove != null) {
            friends.remove(toRemove)
        }
    }
    friends.sortBy { it.name }
    println(friends.size)
    friends.forEach { println(it.name)}
}

data class Friend(val name: String, val likes: Int, val date: String)