fun main() {



    val myList: MutableList<Int> = mutableListOf(1,2,3,4,5)

    for(i in 0 until myList.size){
        myList[i] = myList[i] * 2
    }

    print(myList.joinToString())


}