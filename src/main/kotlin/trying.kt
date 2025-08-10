import Projects.SimpleChatBot.SimpleChatBotProject.scanner
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


fun main12() {

    var y = 10
    while (y > 0) {
        var x = 5
        x += y
        y--
    }
}





fun main13(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var n: Int = scanner.nextInt()
    var i: Int = 0
    while (n > 0) {
        i ++
        repeat(if (i > n) n else i) { print("$i ") }
        n -= i
    }
}


fun main14() {


    var y = 10
    while (y > 0) {
        var x = 5
        x += y
        y--
    }
}


fun main15() {
    var max = readln().toInt()   // ilk sayıyı okur, başlangıç maksimumu yapar
    var index = 1                // maksimumun bulunduğu 1-tabanlı pozisyon
    var count = 1                // o ana dek okunan eleman sayısı (pozisyon sayacı)

    while (true) {
        val next = readLine()?.toInt() ?: break  // satır yoksa (EOF) kır

        count++                 // yeni elemanı say
        if (next > max) {       // SADECE daha büyükse güncelle (>= değil!)
            max = next
            index = count       // ilk görülen maksimum pozisyonu korunur
        }
    }

    println("$max $index")
}


fun main16() {

    val scanner = Scanner(System.`in`)
    var balance = scanner.nextInt() // ilk satır: başlangıç bakiyesi
    while (scanner.hasNextInt()) {
        val payment = scanner.nextInt() // sıradaki ödeme

        if (payment <= balance) {
            balance -= payment // ödeme yapılabiliyorsa çıkar
        } else {
            println("Error, insufficient funds for the purchase. Your balance is $balance, but you need $payment.")
            return // işlemi bitir
        }
    }

    println("Thank you for choosing us to manage your account! Your balance is $balance.")

}

fun main17() {

    println("Let's test your programming knowledge.")
    println("Why do we use methods?")
    println("1. To repeat a statement multiple times.")
    println("2. To decompose a program into several small subroutines.")
    println("3. To determine the execution time of a program.")
    println("4. To interrupt the execution of a program.")

    var answer: Int?
    do {
        answer = scanner.nextInt()
        if (answer != 2) {
            println("Please, try again.")
        }
    } while (answer != 2)
    println("Congratulations, have a nice day!")
}

fun main() {
    println("Let's test your programming knowledge.")
    println("Why do we use methods?")
    println("1. To repeat a statement multiple times.")
    println("2. To decompose a program into several small subroutines.")
    println("3. To determine the execution time of a program.")
    println("4. To interrupt the execution of a program.")

    var answer : Int?

    do {
        answer = scanner.nextInt()
        if (answer !=2){
            println("Please try again")
        }
    }while (answer !=2)
}










