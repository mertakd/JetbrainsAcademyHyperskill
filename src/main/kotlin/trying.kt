fun main() {

    val mutList = mutableListOf("apple", "banana", "cherry")

    // indices → 0..2 (çünkü listenin 3 elemanı var)
    println(mutList.indices)



    for (i in mutList.indices) {
        println("Index $i -> ${mutList[i]}")
    }
}