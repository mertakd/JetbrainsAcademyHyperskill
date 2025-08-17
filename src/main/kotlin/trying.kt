fun main() {

    val size = readLine()!!.toInt()
    val list: MutableList<Int> = mutableListOf()

    for (i in 0 until size) {
        list.add(readLine()!!.toInt())
    }

    var maxIndex = 0
    for (i in 1 until list.size) {
        if (list[i] > list[maxIndex]) {
            maxIndex = i
        }
    }

    println(maxIndex)

}