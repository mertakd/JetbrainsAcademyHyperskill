import java.util.Scanner

fun main1() {

    val daysOfWeek = mutableListOf("Sun", "Mon", "Tues", "Wed")

    for (index in daysOfWeek.indices){
        println("$index: ${daysOfWeek[index]} ")
    }


}


fun main2() {

    val size = readln().toInt()
    val mutList: MutableList<Int> = mutableListOf()

    for (i in 0 until size){
        mutList.add(readln().toInt())
    }


    for (i in mutList.lastIndex downTo 0){
        println("${mutList[i]}")
    }
}


fun main3() {

    val daysOfWeek = mutableListOf("Sun", "Mon", "Tues", "Wed")

    for ((i, value) in daysOfWeek.withIndex()){
        println("$i: $value")
    }

}


fun main4() {

    val numbers = mutableListOf(1,2,3,4,5,6,7,8,9,10)

    for (index in numbers.lastIndex downTo 0 step 2){
        println("$index: ${numbers[index]}")
    }


}


fun main5() {

    val myList: MutableList<Int> = mutableListOf(1,2,3,4,5)

    for (i in 0 until myList.size){
        myList[i] = myList[i] * 2
    }

    println(myList.joinToString())

}


fun main6() {

    val numbers = mutableListOf(1,2,3,4,5)

    for (i in numbers.indices){
        numbers[i] = numbers[i] * 2
    }

    println(numbers.joinToString(","))
}



fun transformList(numbersString: String): String{

    val numbers = numbersString.split(",").map { it.toInt() }

    val transformed = numbers.map { number ->

        if (number % 2 == 0){
            number / 2
        }else{
            number * 2
        }
    }
    return transformed.joinToString(",")

}


fun main7() {

    val scanner = Scanner(System.`in`)
    val numbersString = scanner.nextLine()

    val result = transformList(numbersString)
    println(result)

}


fun main() {

    val n = readln().toInt()
    val numbers = mutableListOf<Int>()


    repeat(n){

    }
}