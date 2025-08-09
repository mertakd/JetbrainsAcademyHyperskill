import java.util.Scanner

fun main1() {

    val start = readLine()?.toIntOrNull() ?: return
    val end = readLine()?.toIntOrNull() ?: return

    for (number in start..end) {
        when {
            number % 3 == 0 && number % 5 == 0 -> println("FizzBuzz")
            number % 3 == 0 -> println("Fizz")
            number % 5 == 0 -> println("Buzz")
            else -> println(number)
        }
    }
}


fun main2() {

    val n = readLine()?.toIntOrNull() ?: return
    var min = Int.MAX_VALUE

    for (i in 1..n) {
        val number = readLine()?.toIntOrNull() ?: return
        if (number < min) {
            min = number
        }
    }

    println(min)
}


fun main3() {
    val n = readLine()?.toIntOrNull() ?: return
    var isSorted = true
    var previousNumber = Int.MIN_VALUE

    for (i in 1..n) {
        val number = readLine()?.toIntOrNull() ?: return
        if (number < previousNumber) {
            isSorted = false
            break
        }
        previousNumber = number
    }

    if (isSorted) {
        println("YES")
    } else {
        println("NO")
    }
}


fun main() {
    val scanner = Scanner(System.`in`)
    val num = scanner.nextInt()

    for(i in 0..num){
        println("$i!")
    }

    println("Completed, have a nice day!")
}