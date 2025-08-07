import java.util.Scanner

fun main1() {


    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val n = readLine()!!.toInt()

    var count = 0

    for (i in a..b){
        if (i % n == 0)
            count++
    }

    println(count)
}


fun main2() {

    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val n = scanner.nextInt()

    println((a..b).count{it % n == 0})
}

fun main3() {
    val a = readln().toInt()
    val b = readln().toInt()
    val n = readln().toInt()

    println((a..b).filter { it % n == 0}.size)
}


fun main4() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()


    var sum = 0

    for (i in a..b){
        sum += i
    }

    println(sum)
}


fun main5() {
    val a = readln().toInt()
    val b = readln().toInt()

    var product = 1L

    for (i in a until b){
        product *= i
    }

    println(product)
}


fun main6() {
    for (i in 1..3) {
        for (j in 1..i) {
            print(j)
        }
    }
}


fun main() {

    val n = readln().toIntOrNull() ?: return
    var sum = 0

    for (i in 1..n){
        val number = readln().toIntOrNull() ?: return
        sum += number
    }

    println(sum)
}