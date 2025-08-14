fun main() {

    val s = readLine()!!.trim()
    println("---------")
    for (i in 0..2) {
        val a = s[i * 3]
        val b = s[i * 3 + 1]
        val c = s[i * 3 + 2]
        println("| $a $b $c |")
    }
    println("---------")
}




