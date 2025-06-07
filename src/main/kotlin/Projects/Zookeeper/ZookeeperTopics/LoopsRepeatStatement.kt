package Projects.Zookeeper.ZookeeperTopics

import java.util.Scanner

/**
 *
 * Reading and processing data in a loop
 *fun main() {
 *
 *     val n = readln().toInt()
 *     var sum = 0
 *
 *
 *     repeat(n) {
 *         val next = readln().toInt()
 *         sum += next
 *     }
 *
 *     println(sum)
 * }
 *
 *
 *
 *
 *
 *
 *
 * How many times it repeats
 *  Report a typo
 * Take a look at the code:
 *
 * repeat(5) {
 *     println("Kotlin")
 * }
 *
 * exactly 5
 *
 *
 *
 *
 *
 *
 *
 *
 * What is the output of the following piece of code?
 *
 * var number = 1
 * repeat(5) {
 *     number++
 * }
 *
 * println(number)
 * sol1 : 6
 *
 *
 *
 *
 *
 *
 * Decrement in loops
 *  Report a typo
 * What does this code print?
 *
 *
 * var number = 5
 *
 * repeat(2) {
 *     number--
 * }
 *
 * repeat(0) {
 *     number--
 * }
 *
 * repeat(1) {
 *     number--
 * }
 *
 * println(number)
 *sol1: 2
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 * Print a string exactly ten times
 *  Report a typo
 * Write a program that reads a line and then prints it 10 times, each on a new line. A line may include multiple words separated by spaces.
 *
 * Sample Input 1:
 *
 * I will not use copy-paste!
 *
 * Sample Output 1:
 *
 * I will not use copy-paste!
 * I will not use copy-paste!
 * I will not use copy-paste!
 * I will not use copy-paste!
 * I will not use copy-paste!
 * I will not use copy-paste!
 * I will not use copy-paste!
 * I will not use copy-paste!
 * I will not use copy-paste!
 * I will not use copy-paste!
 *
 *SOL1
 *val line = readln()
 *
 *     repeat(10){
 *         println(line)
 *     }
 *
 *sol2
 * print("${readLine()!!}\n".repeat(10))
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 * Increment in loop
 *  Report a typo
 * What is the output of the following piece of code?
 *
 * var number = 1
 * repeat(5) {
 *     number++
 * }
 *
 * println(number)
 * sol1: 6
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 * Maximum element divisible by 4
 *  Report a typo
 * You have a sequence of natural numbers that do not exceed 30000. Find the maximum element in the sequence divisible by 4. As input, the program first gets the number of elements in the sequence, and then the elements themselves. A sequence always has an element divisible by 4. The number of elements does not exceed 1000. The program should print a single number — the maximum sequence element (number) divisible by 4.
 *
 * Sample Input 1:
 *
 * 12
 * 38
 * 15
 * 36
 * 80
 * 44
 * 12
 * 27
 * 63
 * 88
 * 46
 * 16
 * 49
 *
 * Sample Output 1:
 *
 * 88
 *
 * SOL1
 * fun main() {
 *     val n = readln().toInt() // Kaç tane sayı girileceğini okur
 *     var maxDivBy4 = 0        // 4'e bölünen sayıların en büyüğünü tutmak için değişken
 *
 *     repeat(n) {
 *         val number = readln().toInt() // Her sayıyı sırayla oku
 *         if (number % 4 == 0 && number > maxDivBy4) {
 *             maxDivBy4 = number        // Hem 4'e bölünüyor hem de mevcut en büyükten büyükse güncelle
 *         }
 *     }
 *
 *     println(maxDivBy4) // Sonuç: 4'e bölünebilen en büyük sayı
 * }
 *
 * SOL2
 * fun main(args: Array<String>) {
 *     val scanner = Scanner(System.`in`)
 *     val loop = scanner.nextInt()
 *     var maximum = 0
 *     repeat(loop) {
 *         val value = scanner.nextInt()
 *         if (value % 4 == 0 && value > maximum) {
 *             maximum = value
 *         }
 *     }
 *     println(maximum)
 * }
 *
 * SOL3
 * fun main() {
 *     var maximum = 0
 *     repeat(readLine()!!.toInt()) {
 *         val input = readLine()!!.toInt()
 *         if (input % 4 == 0 && input > maximum) maximum = input
 *     }
 *     print(maximum)
 * }
 *
 *
 * SOL4
 * fun main(args: Array<String>) {
 *     val scanner = Scanner(System.`in`)
 *
 *     val n = scanner.nextInt()
 *
 *     var maxElem = 0
 *
 *     repeat(n) {
 *         val currentNum = scanner.nextInt()
 *         val isDivBy4AndMax: (Int) -> Boolean = { n -> n % 4 == 0 && n > maxElem }
 *
 *         if (isDivBy4AndMax(currentNum)) maxElem = currentNum
 *     }
 *
 *     println(maxElem)
 * }
 *
 * SOL5
 * fun main() {
 *     val array = List(readLine()!!.toInt()) { readLine()!!.toInt() }
 *     println(array.sorted().last { it % 4 == 0 })
 * }
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 * Size of parts
 *  Report a typo
 * A detecting device compares the size of components produced by a machine against the reference component.
 *
 * If the size of the component is larger, it can be fixed; the detector prints 1.
 * If the size of the component is smaller, it is deemed as a rejection; the detector prints -1.
 * If the component is perfect, it is sent to the box; the detector prints 0.
 *
 * Write a program which takes n (the number of parts) as input and then the detector sequence. The program should output three numbers in a single line — the number of perfect components, the number of larger components, and the number of rejections.
 *
 * Sample Input 1:
 *
 * 10
 * 1
 * 1
 * 1
 * 0
 * 1
 * -1
 * 0
 * 1
 * -1
 * 0
 *
 * Sample Output 1:
 *
 * 3 5 2
 *
 *fun main() {
 *
 *     val n = readln().toInt()
 *
 *     var perfect = 0
 *     var larger = 0
 *     var rejected = 0
 *
 *
 *     repeat(n){
 *         val result = readln().toInt()
 *         when(result){
 *             0 ->perfect++
 *             1 -> larger++
 *             -1 -> rejected++
 *         }
 *     }
 *
 *
 *     println("$perfect $larger $rejected")
 *
 * }
 *
 * sol2
 *fun main() {
 *     val n = readln().toInt()                     // Parça sayısını oku
 *     val parts = List(n) { readln().toInt() }     // Parçaları liste olarak oku
 *
 *     val perfect = parts.count { it == 0 }        // 0 olanların sayısı
 *     val larger = parts.count { it == 1 }         // 1 olanların sayısı
 *     val rejected = parts.count { it == -1 }      // -1 olanların sayısı
 *
 *     println("$perfect $larger $rejected")
 * }
 *
 *sol3
 * fun main(args: Array<String>) {
 *     val scanner = Scanner(System.`in`)
 *     val count = IntArray(3)
 *     val n = scanner.nextInt()
 *     repeat(n) {
 *         val next = scanner.nextInt()
 *         count[(next + 3) % 3]++
 *     }
 *     println(count.joinToString(separator = " "))
 *     }
 *
 * sol4
 * fun main(args: Array<String>) {
 *     val scanner = Scanner(System.`in`)
 *     val n = scanner.nextInt()
 *     val checks = IntArray(n) { scanner.nextInt() }
 *
 *     var ready = checks.count { it == 0 }
 *     var fix = checks.count { it == 1 }
 *     var reject = checks.count { it == -1 }
 *
 *     println("$ready $fix $reject")
 * }
 *
 *sol5
 * fun main() {
 *     val results = arrayOf(0, 0, 0)
 *     repeat(readLine()!!.toInt()) {
 *         results[readLine()!!.toInt() + 1] += 1
 *     }
 *     print("${results[1]} ${results[2]} ${results[0]}")
 * }
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 * Grades
 *  Report a typo
 * Find how many "D", "C", "B" and "A" grades the students have got after the last Computer Science test. There are n students in the class. The program gets the n number as input and then gets the grades one by one. The program should output four numbers in a single line, representing the number of grades equal to "D", "C", "B" and "A".
 *
 * Numbers represent the following grades: 2 is "D", 3 is "C", 4 is "B", and 5 is "A".
 *
 * Sample Input 1:
 *
 * 10
 * 3
 * 5
 * 4
 * 4
 * 2
 * 5
 * 5
 * 5
 * 5
 * 2
 *
 * Sample Output 1:
 *
 * 2 1 2 5
 *
 *
 * SOL1
 * fun main() {
 *     val n = readln().toInt() // Öğrenci sayısını oku
 *
 *     var d = 0 // 2 → D
 *     var c = 0 // 3 → C
 *     var b = 0 // 4 → B
 *     var a = 0 // 5 → A
 *
 *     repeat(n) {
 *         val grade = readln().toInt()
 *         when (grade) {
 *             2 -> d++
 *             3 -> c++
 *             4 -> b++
 *             5 -> a++
 *         }
 *     }
 *
 *     println("$d $c $b $a")
 * }
 *
 * SOL2
 * fun main(args: Array<String>) {
 *     val scanner = Scanner(System.`in`)
 *     // put your code here
 *     val n = scanner.nextInt()
 *     var (d, c, b, a) = arrayOf(0, 0, 0, 0)
 *     repeat(n) {
 *         val x = scanner.nextInt()
 *         when (x) {
 *             2 -> d++
 *             3 -> c++
 *             4 -> b++
 *             5 -> a++
 *         }
 *     }
 *     print("$d $c $b $a")
 * }
 *
 * SOL3
 * fun main() {
 *     val n = readLine()!!.toInt()
 *     val grades = IntArray(4)
 *     repeat(n) {
 *         val number = readLine()!!.toInt() - 2
 *         grades[number] += 1
 *     }
 *     println(grades.joinToString(" "))
 * }
 *
 * SOL4
 * fun main() {
 *     val grades = Array(readLine()!!.toInt()) { readLine()!!.toInt() }
 *     for (i in 2..5) print("${grades.count{ it == i }} ")
 * }
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 * Counting positive numbers
 *  Report a typo
 * Write a program that reads a sequence and prints how many positive numbers it contains.
 *
 * The first number is the length of the sequence. Other numbers are the elements of this sequence.
 *
 * Sample Input 1:
 *
 * 8
 * 2
 * 3
 * 0
 * 7
 * 4
 * -2
 * -3
 * 0
 *
 * Sample Output 1:
 *
 * 4
 *
 * SOL1
 * fun main() {
 *
 *     val n =readln().toInt()
 *
 *     var d = 0
 *     var c = 0
 *     var b = 0
 *     var a = 0
 *
 *     repeat(n){
 *
 *         val grade = readln().toInt()
 *
 *         when(grade){
 *             2 -> d++
 *             3 -> c++
 *             4 -> b++
 *             5 -> a++
 *         }
 *     }
 *
 *
 *     println("$d $c $b $a")
 *
 * }
 *
 * SOL2
 *
 *fun main() {
 *     val n = readLine()!!.toInt()
 *     var count = 0
 *     repeat(n) {
 *         val num = readLine()!!.toInt()
 *         if (num > 0) {
 *             count++
 *         }
 *     }
 *     println(count)
 * }
 *
 *
 * SOL3
 * fun main(args: Array<String>) {
 *     val scanner = Scanner(System.`in`)
 *     val sequence = scanner.nextInt()
 *     var sum = 0
 *     repeat(sequence) {
 *         sum += if (scanner.nextInt() > 0) 1 else 0
 *     }
 *     print(sum)
 * }
 *
 *
 * SOL4
 * fun main() {
 *     val n = readLine()!!.toInt()
 *     var count = 0
 *
 *     repeat(n) {
 *         val number = readLine()!!.toInt()
 *         if (number > 0) {
 *             count++
 *         }
 *     }
 *
 *     println(count)
 * }
 *
 *
 *
 *
 *
 *
 *
 *
 * Kotlin x5
 *  Report a typo
 * Write a program that prints the word Kotlin five times. Print each word on a new line.
 *
 * Use the provided template for your solutions:
 *
 * Sample Output
 *
 * Kotlin
 * Kotlin
 * Kotlin
 * Kotlin
 * Kotlin
 *
 *SOL1
 * fun main() {
 *     repeat(5) {
 *         println("Kotlin")
 *     }
 * }
 *
 * SOL2
 * fun main() = print("Kotlin\n".repeat(5))
 * SOL3
 * fun main() = repeat(5) { println("Kotlin") }
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 * Repeat by value
 *  Report a typo
 * Write a program that reads a number and prints it the number of times corresponding to the value of the input number.
 *
 * Sample Input 1:
 *
 * 5
 *
 * Sample Output 1:
 *
 * 55555
 *
 * Sample Input 2:
 *
 * 10
 *
 * Sample Output 2:
 *
 * 10101010101010101010
 *
 * SOL1
 * fun main() {
 *    val n= readln().toInt()
 *
 *     repeat(n){
 *         print("$n")
 *     }
 *
 * }
 *
 * SOL2
 * fun main() {
 *     val a = readln()
 *     println(a.repeat(a.toInt()))
 * }
 *SOL3
 * fun main() = readln().let { print(it.repeat(it.toInt())) }
 * SOL4
 * fun main() {
 *
 *     val n = readln().toInt()
 *     println("$n".repeat(n))
 * }
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 * Calculate the sum of natural numbers up to a given limit
 *  Report a typo
 * Write a Kotlin program that finds the sum of the natural numbers up to a given number. You'll receive an integer 'N' as input, representing the limit of the numbers to be added. Your program should print the calculated sum as the output.
 *
 * Sample Input 1:
 *
 * 10
 *
 * Sample Output 1:
 *
 * 55
 *
 * Sample Input 2:
 *
 * 100
 *
 * Sample Output 2:
 *
 * 5050
 *
 * SOL1
 * fun main(args: Array<String>) {
 *     val scanner = Scanner(System.`in`)
 *     val N = scanner.nextInt()
 *     var sum = 0
 *
 *     // 1'den N'ye kadar sayıları topla
 *     repeat(N) {
 *         sum += it + 1  // it 0'dan başladığı için 1 ekliyoruz
 *     }
 *
 *     println(sum)
 * }
 *
 * SOL2
 * // Import necessary Kotlin libraries
 * import java.util.*
 *
 * fun main(args: Array<String>) {
 *     // Create a scanner object for getting input
 *     val scanner = Scanner(System.`in`)
 *
 *     // Read the input number
 *     val N = scanner.nextInt()
 *
 *     // Variable to store the sum
 *     var sum = 0
 *
 *     // Write a repeat loop here to add the numbers from 1 to N to the sum variable
 *     repeat(N.inc()) {
 *         sum += it
 *     }
 *
 *     // Output the sum
 *     println(sum)
 * }
 *
 *
 * SOL3
 * // Import necessary Kotlin libraries
 * import java.util.*
 *
 * fun main(args: Array<String>) {
 *     // Create a scanner object for getting input
 *     val scanner = Scanner(System.`in`)
 *
 *     // Read the input number
 *     val N = scanner.nextInt()
 *
 *     // Variable to store the sum
 *     var sum = 0
 *
 *     // Write a repeat loop here to add the numbers from 1 to N to the sum variable
 *     repeat(N) {
 *         val x = (1 + N) * N / 2
 *         sum = x
 *     }
 *
 *     // Output the sum
 *     println(sum)
 * }
 *
 * SOL4
 * fun main() {
 *     val n = readln().toInt()
 *
 *     println((n + 1) * n / 2)
 * }
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 * Printing an ascending asterisk triangle
 *  Report a typo
 * Write a program that reads a positive integer N and prints a triangle with N rows using asterisks ('*'). Each row should have one more asterisk than the previous row, starting with one asterisk in the first row.
 *
 * Sample Input 1:
 *
 * 5
 *
 * Sample Output 1:
 *
 * *
 * **
 * ***
 * ****
 * *****
 *
 * Sample Input 2:
 *
 * 3
 *
 * Sample Output 2:
 *
 * *
 * **
 * ***
 *
 *SOL1
 * import java.util.Scanner
 *
 * fun main() {
 *     val scanner = Scanner(System.`in`)
 *     val n = scanner.nextInt()
 *
 *     repeat(n) {
 *         println("*".repeat(it + 1))
 *     }
 * }
 *
 *
 * SOL2
 * fun main() {
 *     repeat(readln().toInt() + 1) {
 *         print("*".repeat(it))
 *         println()
 *     }
 * }
 *
 * SOL3
 * fun main() {
 *     val input = readln().toInt()
 *     for (i in 1..input) {
 *         println("*".repeat(i))
 *     }
 * }
 *
 *
 * SOL4
 * fun main() {
 *     val numberOfRows = readln().toInt()
 *     val row = "*"
 *     var numberOfAsterisks = 1
 *
 *     repeat(numberOfRows) {
 *         println(row.repeat(numberOfAsterisks))
 *         numberOfAsterisks++
 *     }
 * }
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 * Sum of squares of even numbers up to a limit
 *  Report a typo
 * Write a program in Kotlin that displays the sum of squares of even numbers from 1 up to a given limit. Take the limit as an integer input from the user. If the limit is less than 0, print 'Invalid Input'.
 *
 * Sample Input 1:
 *
 * 10
 *
 * Sample Output 1:
 *
 * 220
 *
 * Sample Input 2:
 *
 * 5
 *
 * Sample Output 2:
 *
 * 20
 *
 * SOL1
 * fun main() {
 *     val n = readln().toInt()
 *
 *     if (n < 0) {
 *         println("Invalid Input")
 *         return
 *     }
 *
 *     var sum = 0
 *     for (i in 1..n) {
 *         if (i % 2 == 0) {      // çift sayı mı kontrol et
 *             sum += i * i       // çift sayının karesini topla
 *         }
 *     }
 *
 *     println(sum)
 * }
 *
 *
 * SOL2
 * fun main() = readln().toInt().let { n ->
 *     print(if (n < 0) "Invalid Input" else (1..n).filter { it % 2 == 0 }.sumOf { it * it })
 * }
 *
 *
 * SOL3
 * fun main() {
 *     val input = readln().toInt()
 *     println(
 *         if (input < 0) {
 *             "Invalid Input"
 *         } else {
 *             (1..input)
 *                 .filter { it % 2 == 0 }
 *                 .map { it * it }
 *                 .sum()
 *         }
 *     )
 * }
 */


fun main() {
    val n = readln().toInt()    // 1. Kullanıcıdan bir sayı alıyoruz ve n değişkenine atıyoruz.

    if (n < 0) {                // 2. Eğer n negatifse,
        println("Invalid Input") // "Invalid Input" yazdırıp programı bitiriyoruz.
        return
    }

    var sum = 0                 // 3. Toplamı tutacak değişkeni başlatıyoruz.

    for (i in 1..n) {           // 4. 1’den n’ye kadar sayılar arasında döngü kuruyoruz.
        if (i % 2 == 0) {       // 5. Eğer i çift sayıysa (2,4,6,8,...) işlem yap:
            sum += i * i        // 6. i sayısının karesini (i*i) hesapla ve toplam değişkenine ekle.
            // Mesela i=4 ise, 4*4=16 toplam sum’a eklenir.
        }
    }

    println(sum)                // 7. Son olarak toplamı yazdırıyoruz.
}