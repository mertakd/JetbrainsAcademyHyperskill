import java.util.Scanner

fun main1() {


    var i = 0

    while (i < 5) {
        println(i)
        i++
    }

    println("Completed")

}


fun main2() {

    var letter = 'A'

    while (letter <= 'Z') {
        print(letter)
        letter++
    }
}




fun main3() {
    val scanner = Scanner(System.`in`)

    while (scanner.hasNext()) {
        val next = scanner.next()
        println(next)
    }
}


fun main4() {

    do {
        val n = readln().toInt()
        println(n)
    } while (n > 0)
}


fun main5() {

    var i = 3
    do {
        println(i)
        i--
    } while(i > 3)

}


fun main6() {

    var i = 5

    do {
        i++
        print("$i ")
        i -= 2
    } while (i > 1)
}


fun main7() {

    var maxElement = Int.MIN_VALUE
    var input: Int

    do {
        input = readLine()!!.toInt()
        if (input != 0 && input > maxElement) {
            maxElement = input
        }
    } while (input != 0)

    println(maxElement)
}


fun main8() {
    var sum = 0
    var num = readLine()!!.toInt()

    while (num != 0) {
        sum += num
        num = readLine()!!.toInt()
    }

    println(sum)
}


fun main9() {

    var n = 0
    do {
        val s = readln().toInt()
        n += s
    } while (s > 0)
    print(n)
}


fun main10() {
    var count = 0
    var num = readLine()!!.toInt()

    while (num != 0) {
        count++
        num = readLine()!!.toInt()
    }

    println(count)
}


fun main11() {
    val scanner = Scanner(System.`in`)
    var n = scanner.nextInt()  // Kullanıcıdan sayı alınır

    while (n != 1) {
        print("$n ")           // Sayıyı yazdır (sonunda boşlukla)
        n = if (n % 2 == 0) {
            n / 2              // Çiftse 2'ye böl
        } else {
            n * 3 + 1          // Tekse 3n + 1 yap
        }
    }
    print("1")
}


fun main() {

    var y = 10
    while (y > 0) {
        var x = 5
        x += y
        y--
    }
}













