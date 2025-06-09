package Projects.Zookeeper.ZookeeperTopics

import java.util.Scanner

/**
 *
 *
 * fun main() {
 *
 *     var i = 0
 *
 *     while (i < 5){
 *         println(i)
 *         i++
 *     }
 *
 *
 *     println("Completed")
 * }
 *
 *
 *
 *
 * fun main() {
 *
 *
 *     var letter = 'A'
 *
 *     while (letter <= 'Z'){
 *         print(letter)
 *         letter++
 *     }
 *
 * }
 *
 *
 *
 *
 *
 *fun main() {
 *     val scanner = Scanner(System.`in`)
 *     while (scanner.hasNext()) {
 *         val next = scanner.next()
 *         println(next)
 *     }
 * }
 *
 *
 *
 *
 * do {
 *         val n = readln().toInt()
 *         println(n)
 *     } while (n > 0)
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
 *     Choose the correct ones
 *  Report a typo
 * Select all loops with the correct syntax.
 *
 *
 * a)
 *
 * var i = 3
 * while (i > 0) {
 *     println(i)
 *     i--
 * }
 * println("Completed")
 *
 *
 * b)
 *
 * var i = 3
 * while (i > 0) {
 *     println(i)
 *     i--
 * } else {
 *     println("Completed")
 * }
 *
 *
 * c)
 *
 * var i = 3
 * do {
 *     println(i)
 *     i--
 * } while(i > 3)
 *
 *
 * d)
 *
 * var i = 3
 * while (i > 3) do {
 *     println(i)
 *     i--
 * }
 * println("Completed")
 *
 * sol1: a-c
 *
 *
 *
 *
 *
 *
 *
 *
 *
 * What does the code print?
 *  Report a typo
 * What does this code print?
 *
 * var i = 5
 *
 * do {
 *     i++
 *     print("$i ")
 *     i -= 2
 * } while (i > 1)
 *
 * Select one option from the list
 *
 * 5 4 3 2 1
 *
 * 6 5 4 3     true
 *
 * 5 4 3 2
 *
 * 6 5 4 3 2
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
 * What does the code print?
 *  Report a typo
 * What does this code print?
 *
 * var i = 0
 * while (i < 10) {
 *     i++
 *     if (i % 2 == 0) {
 *         print("$i ")
 *     }
 * }
 *
 * Select one option from the list
 *
 * 2 4 6 8 10    T
 *
 * 0 2 4 6 8 10
 *
 * 2 4 6 8
 *
 * 0 2 4 6 8
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
 * The largest element
 *  Report a typo
 * You have a sequence of integer numbers that ends with 0. Find the largest element of this sequence.
 *
 * 0 is not included in the sequence. It serves only as a sign of the sequence end.
 *
 * Sample Input 1:
 *
 * 1
 * 7
 * 9
 * 0
 *
 * Sample Output 1:
 *
 * 9
 *
 *
 * SOL1
 * fun main() {
 *     var maxElement = Int.MIN_VALUE
 *     var input: Int
 *
 *     do {
 *         input = readLine()!!.toInt()
 *         if (input != 0 && input > maxElement) {
 *             maxElement = input
 *         }
 *     } while (input != 0)
 *
 *     println(maxElement)
 * }
 *
 *
 * SOL2
 *fun main() {
 *     var a = 0
 *     do {
 *         val b = readln().toInt()
 *         if (b > a) a = b
 *     } while (b != 0)
 *     println(a)
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
 * The sum of elements
 *  Report a typo
 * Find the sum of all elements in a sequence, ending with 0.
 *
 * The number 0 itself is not included in the sequence and serves as a sign that the sequence ended. Although, if you add 0, nothing bad will happen :)
 *
 * Sample Input 1:
 *
 * 3
 * 6
 * 8
 * 0
 *
 * Sample Output 1:
 *
 * 17
 *
 *SOL1
 * val scanner = Scanner(System.`in`)
 *     var sum = 0
 *
 *     do {
 *         val num  = scanner.nextInt()
 *         sum += num
 *     }while (num != 0)
 *     println(sum)
 *
 *
 *SOL2
 *  fun main() {
 *     val sequence: MutableList<Int> = mutableListOf()
 *     do {
 *         sequence.add(readLine()!!.toInt())
 *     } while (sequence.last() != 0)
 *     println(sequence.sum())
 * }
 *
 * SOL3
 * import java.util.Scanner
 *
 * fun main() {
 *     val scanner = Scanner(System.`in`)
 *     val elements = scanner.readAllInt()
 *
 *     print(elements.sum())
 * }
 *
 * fun Scanner.readAllInt(): List<Int> = mutableListOf<Int>().apply {
 *     while (hasNextInt() && (isEmpty() || last() != 0)) {
 *         this += nextInt()
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
 * The length of the sequence
 *  Report a typo
 * The program gets a sequence of non-negative integers as input. Each integer is written on a separate line. The sequence contains an integer 0. After reading 0, the program should terminate and output the length of the sequence (do not count the final 0).
 *
 * Sample Input 1:
 *
 * 3
 * 2
 * 1
 * 0
 *
 * Sample Output 1:
 *
 * 3
 *
 * SOL1
 * fun main(args: Array<String>) {
 *     val scanner = Scanner(System.`in`)
 *     // put your code here
 *     var count = 0
 *     while (scanner.nextInt() != 0) count++
 *     println(count)
 * }
 *
 * SOL2
 * fun main() {
 *     var count = 0
 *     while (readLine()!!.toInt() > 0) { count++ }
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
 *
 *
 *
 *
 *
 *
 *
 * Squares of natural numbers
 *  Report a typo
 * You have an integer number N. Read it from the standard input and print all squares of natural numbers that do not exceed N in ascending order.
 *
 * Sample Input 1:
 *
 * 50
 *
 * Sample Output 1:
 *
 * 1
 * 4
 * 9
 * 16
 * 25
 * 36
 * 49
 *
 * Sample Input 2:
 *
 * 49
 *
 * Sample Output 2:
 *
 * 1
 * 4
 * 9
 * 16
 * 25
 * 36
 * 49
 *
 * SOL1
 * fun main(args: Array<String>) {
 *     val scanner = Scanner(System.`in`)
 *     var num = 1
 *     var num2 = 3
 *     val max = scanner.nextInt()
 *     while (num <= max) {
 *         println(num)
 *         num += num2
 *         num2 += 2
 *     }
 * }
 *
 * SOL2
 * fun main() {
 *     val N = readLine()!!.toInt()
 *     var i = 1 // Start with the first natural number
 *
 *     while (i * i <= N) {
 *         println(i * i)
 *         i++
 *     }
 * }
 *
 * SOL3
 * fun main() {
 *     val n = readln().toInt()
 *
 *     var square = 1
 *     while (square * square <= n) {
 *         println(square * square)
 *         square++
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
 * The sequence 1 2 2 3 3 3 ...
 *  Report a typo
 * Wow! This problem is kind of tricky. If you're ready to put your thinking cap on, brace yourself, and good luck! Otherwise, you can skip it for now and return any time later.
 *
 * Write a program that prints a part of the following sequence 1 2 2 3 3 3 4 4 4 4 5 5 5 5 5 ... (the number of repetitions is equal to the respective number). Input is a positive integer n – the number of the elements of the sequence that the program should print. Output the sequence of numbers, written in a single line, separated by spaces.
 *
 * For example, if n is 7, the program should output 1 2 2 3 3 3 4 (seven numbers).
 *
 * Note that a space at the end of the output line does not affect the result. Pay attention to the numbers.
 *
 * Sample Input 1:
 *
 * 7
 *
 * Sample Output 1:
 *
 * 1 2 2 3 3 3 4
 *
 * SOL1
 * fun main(args: Array<String>) {
 *     val scanner = Scanner(System.`in`)
 *     var n: Int = scanner.nextInt()
 *     var i: Int = 0
 *     while (n > 0) {
 *         i ++
 *         repeat(if (i > n) n else i) { print("$i ") }
 *         n -= i
 *     }
 * }
 *
 * SOL2
 * fun main() {
 *     val n = readLine()!!.toInt() // Read the number of elements from input
 *     var currentNumber = 1 // Initialize the current number as 1
 *     var count = 0 // Initialize a count to keep track of repetitions
 *
 *     while (count < n) {
 *         var repetitions = 0 // Initialize repetitions for the current number
 *         while (repetitions < currentNumber && count < n) {
 *             print("$currentNumber ")
 *             repetitions++
 *             count++
 *         }
 *         currentNumber++ // Increment the current number
 *     }
 * }
 *
 * SOL3
 * fun main() {
 *     // put your code here
 *     val n = readLine()!!.toInt()
 *     var count = 1
 *     var i = 1
 *
 *     while (count <= n) {
 *         repeat(i) {
 *             if (count <= n) {
 *                 print("$i ")
 *             }
 *             count++
 *         }
 *         i++
 *     }
 * }
 *
 * SOL4
 * fun main() {
 *     var n = readLine()!!.toInt()
 *     var num = 1
 *     while (n != 0) {
 *         repeat(num) {
 *             print("$num ")
 *             if (--n == 0) return
 *         }
 *         num++
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
 * Squares of natural numbers
 *  Report a typo
 * You have an integer number N. Read it from the standard input and print all squares of natural numbers that do not exceed N in ascending order.
 *
 * Sample Input 1:
 *
 * 50
 *
 * Sample Output 1:
 *
 * 1
 * 4
 * 9
 * 16
 * 25
 * 36
 * 49
 *
 * Sample Input 2:
 *
 * 49
 *
 * Sample Output 2:
 *
 * 1
 * 4
 * 9
 * 16
 * 25
 * 36
 * 49
 *
 *
 *SOL1
 * fun main(args: Array<String>) {
 *     val scanner = Scanner(System.`in`)
 *     var num = 1
 *     var num2 = 3
 *     val max = scanner.nextInt()
 *     while (num <= max) {
 *         println(num)
 *         num += num2
 *         num2 += 2
 *     }
 * }
 *
 * SOL2
 * fun main() {
 *     val N = readLine()!!.toInt()
 *     var i = 1 // Start with the first natural number
 *
 *     while (i * i <= N) {
 *         println(i * i)
 *         i++
 *     }
 * }
 *
 *
 * SOL3
 * fun main() {
 *     val n = readln().toInt()
 *
 *     var square = 1
 *     while (square * square <= n) {
 *         println(square * square)
 *         square++
 *     }
 * }
 *
 *
 * SOL4
 *fun main(args: Array<String>) {
 *     val scanner = Scanner(System.`in`)
 *     val n = scanner.nextDouble()
 *     for (i in 1..Math.sqrt(n).toInt()) {
 *         println(i * i)
 *     }
 * }
 *
 * SOL5
 * fun main(args: Array<String>) {
 *     val scanner = Scanner(System.`in`)
 *
 *     fun square(x: Int) = x * x
 *
 *     val n = scanner.nextInt()
 *     var x = 1
 *
 *     while (square(x) <= n) {
 *         println(square(x))
 *         x++
 *     }
 *
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
 *
 * Bank interest calculation
 *  Report a typo
 * When a bank has financial problems, the government can return a client's deposit if it is less than 700,000. The interest rate for a particular deposit is 7.1% a year. Interest is added to the same deposit at the end of the year, and then a new value of the interest is calculated. Find out how many years it will take for the sum of the deposit to exceed the value protected by the government.
 *
 * The input format: the initial sum of the deposit.
 *
 * It is guaranteed that the value will be between 50,000 and 700,000.
 *
 * Please note that the deposit amount increases by a value proportional to the interest rate each year – in this case, 1.071 (7.1%). Thus, the formula for calculating the deposit amount will look like this: deposit = deposit * 1.071.
 *
 * Sample Input 1:
 *
 * 650000
 *
 * Sample Output 1:
 *
 * 2
 *
 * SOL1
 * fun findYears(depo: Double): Int{
 *     var deposit = depo
 *     val interestRate = 1.071
 *     val max = 700000
 *     var years = 0
 *
 *     while (deposit <= max) {
 *         deposit *= interestRate
 *         years++
 *     }
 *
 *     return years
 * }
 *
 * SOL2
 * @SuppressWarnings("MagicNumber")
 * fun findYears(depo: Double): Int {
 *     var deposit = depo
 *     val interestRate = 1.071
 *     val max = 700000
 *     var years = 0
 *     while (deposit < max) {
 *         deposit *= interestRate
 *         years++
 *     }
 *     return years
 * }
 *
 *
 *SOL3
 * const val MAX = 700000
 * const val RATE = 1.071
 *
 * fun findYears(depo: Double): Int {
 *     var deposit = depo
 *     var years = 0
 *
 *     while (deposit < MAX) {
 *         deposit *= RATE
 *         years++
 *     }
 *     return years
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
 * Descending digits dance
 *  Report a typo
 * Hey there! This problem might be a bit unpredictable, but give it a go and let us know how you do!
 * Create a program that prints a countdown from a given number to 1 using a while loop. The program should take a single positive integer as input and print each number in the countdown on a separate line.
 * Sample Input 1:
 *
 * 5
 *
 * Sample Output 1:
 *
 * 5
 * 4
 * 3
 * 2
 * 1
 *
 * Sample Input 2:
 *
 * 3
 *
 * Sample Output 2:
 *
 * 3
 * 2
 * 1
 *
 * SOL1
 * import java.util.Scanner
 *
 * fun main() {
 *     val scanner = Scanner(System.`in`)
 *     var number = scanner.nextInt()
 *
 *     // Countdown from number to 1 using a while loop
 *     while (number >= 1) {
 *         println(number)
 *         number-- // bir azalt
 *     }
 * }
 *
 * SOL2
 * fun main() {
 *     readln().toInt().let {
 *         (it downTo 1).forEach { n -> println(n) }
 *     }
 * }
 *
 * SOL3
 * fun main() {
 *     var n = readln().toInt()
 *     while (n > 0) {
 *         println(n)
 *         n--
 *     }
 * }
 *
 * SOL4
 * fun main() {
 *     var number = readln().toInt()
 *     while (number > 0) println(number--)
 * }
 *
 * SOL5
 * fun main() {
 *     val scanner = Scanner(System.`in`)
 *     val number = scanner.nextInt()
 *     var count = number
 *     while (count > 0) {
 *         println(count)
 *         count--
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
 * Collatz conjecture
 *  Report a typo
 * You have a natural number n. Generate a sequence of integers, described in the Collatz conjecture (Wikipedia):
 *
 * if n is an even number, divide it in half;
 * if it is odd, multiply it by 3 and add 1 ;
 * Repeat this operation until you get 1 as a result.
 *
 * For example, if n is 17, then the sequence would look like this:
 *
 * 17 52 26 13 40 20 10 5 16 8 4 2 1
 *
 * This sequence should stop at 1 for any primary natural number n.
 *
 * Output format:
 * A sequence of integers in a single line, separated by spaces.
 *
 * Sample Input 1:
 *
 * 17
 *
 * Sample Output 1:
 *
 * 17 52 26 13 40 20 10 5 16 8 4 2 1
 *
 * Sample Input 2:
 *
 * 1
 *
 * Sample Output 2:
 *
 * 1
 *
 *
 *
 * SOL1
 * fun main() {
 *     val scanner = Scanner(System.`in`)
 *     var n = scanner.nextInt()  // Kullanıcıdan sayı alınır
 *
 *     while (n != 1) {
 *         print("$n ")           // Sayıyı yazdır (sonunda boşlukla)
 *         n = if (n % 2 == 0) {
 *             n / 2              // Çiftse 2'ye böl
 *         } else {
 *             n * 3 + 1          // Tekse 3n + 1 yap
 *         }
 *     }
 *     print("1")                 // En sonunda 1 yazdır
 * }
 *
 *
 * SOL2
 * fun main() {
 *
 *     val scanner = Scanner(System.`in`)
 *     var n = scanner.nextInt()
 *     println(n)
 *
 *     while (n != 1){
 *         n = if (n % 2 == 0) n / 2  else n * 3 + 1
 *         println(n)
 *     }
 * }
 *
 * SOL3
 * @SuppressWarnings("MagicNumber")
 * fun main() {
 *     var n = readln().toInt()
 *     val result = mutableListOf(n)
 *     while (n != 1) {
 *         n = if (n % 2 == 0) n / 2 else n * 3 + 1
 *         result.add(n)
 *     }
 *     print(result.joinToString(" "))
 * }
 *
 * SOL4
 * fun main(args: Array<String>) {
 *     val scanner = Scanner(System.`in`)
 *     collatzSequence(scanner.nextInt()).takeWhile { it != 1 }.forEach { print("$it ") }.also { print("1") }
 * }
 *
 * private fun collatzSequence(initial: Int) = sequence {
 *     var number = initial
 *     while (true) {
 *         yield(number)
 *         number = if (number.isEven()) number / 2 else (3 * number).inc()
 *     }
 * }
 *
 * private fun Int.isEven() = this and 1 == 0
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
 * Loop Scoops: Var Ventures Inside
 *  Report a typo
 * In Kotlin, given the following code snippet:
 *
 *
 * var y = 10
 * while (y > 0) {
 *     var x = 5
 *     x += y
 *     y--
 * }
 *
 * What are the correct statements about the scope and lifecycle of variables 'x' and 'y'?
 * 'y', declared outside the loop, accumulates changes made within the loop across iterations. T
 *
 * The final value of 'x' after the loop terminates affects 'x' outside the loop scope.
 *
 * 'x' is recreated and reinitialized to 5 at the beginning of each iteration of the loop. T
 *
 * The final value of 'y' can be used outside the loop since it retains its value and scope after the loop. T
 *
 * 'x' is accessible outside the while loop because it is initialized within the loop.
 *
 *
 * 1. y değişkeni:
 * Döngü dışında tanımlandığı için:
 *
 * Döngü içinde ve dışında erişilebilir
 *
 * Değeri döngüde değişse bile, bu değişiklik döngü bitince korunur
 *
 * Yani: global / dış scope
 *
 * 📌 2. x değişkeni:
 * Döngü içinde tanımlandığı için:
 *
 * Sadece o döngü turunda yaşar
 *
 * Her seferinde yeniden tanımlanır (x = 5)
 *
 * Döngü dışından erişmeye çalışırsan: ❌ Hata alırsın
 *
 * Yani: lokal / iç scope
 *
 * 📌 Konunun Gerçek Hayattaki Anlamı:
 * Dışarıda tanımladığın değişkenler uygulamanın birçok yerinden erişilebilir → dikkatli kullanmalısın.
 *
 * İçeride tanımladığın değişkenler sadece o işlem için yaşar → bellek açısından daha verimli ve güvenlidir.
 *
 * fun main() {
 *
 *     var y = 10
 *     while (y > 0) {
 *         var x = 5
 *         x += y
 *         println("x: $x") // x her seferinde yeniden hesaplanır
 *         y--
 *     }
 *
 *     // Döngü bittikten sonra y'nin değeri:
 *     println("Son y değeri: $y")
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
 * Creating a loop that prints a statement ten times in Kotlin
 *  Report a typo
 * Given the scrambled Kotlin code snippets below which when arranged correctly print a statement ten times sequentially. Your task is to reorder the lines of code so that it runs without errors and achieves the specified goal. Note: The program you form should leverage a key concept of 'Control Structures' in Kotlin.
 *
 * sol1
 * fun main() {
 *
 *     var counter = 1
 *
 *     while (counter <= 10){
 *         println("This is repetition number: $counter")
 *         counter++
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
 * Balance checker
 *  Report a typo
 * Create an algorithm that prevents an e-wallet account from going into negative balance. The account should be debited for each purchase sequentially while the balance allows it.
 *
 * The input should include:
 *
 * On the first line, a single integer number representing the available balance.
 * On the second line, a sequence of integers representing purchase payments, which should be processed one after another.
 * The output should contain:
 *
 * If there is not enough money for a purchase, output Error, insufficient funds for the purchase. Your balance is N, but you need M., where N is the remaining balance on the account and M is the cost of the items you cannot afford.
 * If there is enough money for all the purchases, output Thank you for choosing us to manage your account! Your balance is N., where N is the amount of money left after the purchases.
 * Sample Input 1:
 *
 * 10000
 * 5000 3000
 *
 * Sample Output 1:
 *
 * Thank you for choosing us to manage your account! Your balance is 2000.
 *
 * Sample Input 2:
 *
 * 1000
 * 500 500
 *
 * Sample Output 2:
 *
 * Thank you for choosing us to manage your account! Your balance is 0.
 *
 * Sample Input 3:
 *
 * 5000
 * 500 2000 3000
 *
 * Sample Output 3:
 *
 * Error, insufficient funds for the purchase. Your balance is 2500, but you need 3000
 *
 * SOL1
 * import java.util.Scanner
 *
 *
 * fun main() {
 *     val scanner = Scanner(System.`in`)
 *     var balance = scanner.nextInt() // ilk satır: başlangıç bakiyesi
 *     while (scanner.hasNextInt()) {
 *         val payment = scanner.nextInt() // sıradaki ödeme
 *
 *         if (payment <= balance) {
 *             balance -= payment // ödeme yapılabiliyorsa çıkar
 *         } else {
 *             println("Error, insufficient funds for the purchase. Your balance is $balance, but you need $payment.")
 *             return // işlemi bitir
 *         }
 *     }
 *
 *     println("Thank you for choosing us to manage your account! Your balance is $balance.")
 * }
 *
 *
 * SOL2
 * fun main() {
 *     val scanner = Scanner(System.`in`)
 *
 *     var balance = scanner.nextInt()
 *
 *     while (scanner.hasNextInt()) {
 *         val amount = scanner.nextInt()
 *
 *         if (balance - amount < 0) {
 *             println("Error, insufficient funds for the purchase. Your balance is $balance, but you need $amount.")
 *             return
 *         }
 *
 *         balance -= amount
 *     }
 *
 *     println("Thank you for choosing us to manage your account! Your balance is $balance.")
 * }
 *
 * SOL3
 * fun main() {
 *     val scanner = Scanner(System.`in`)
 *     var balance = readln().toInt()
 *     while (scanner.hasNextInt()) {
 *         val purchase = scanner.nextInt()
 *         if (balance - purchase < 0) {
 *             println("Error, insufficient funds for the purchase. Your balance is $balance, but you need $purchase.")
 *             return
 *         } else {
 *             balance -= purchase
 *         }
 *     }
 *     println("Thank you for choosing us to manage your account! Your balance is $balance.")
 * }
 *
 *
 * SOL4
 * fun main() {
 *     var amount = readLine()!!.toInt()
 *     val list = readLine()!!.split(" ").map { it.toInt() }
 *     for (i in list.indices) {
 *         if (amount - list[i] >= 0) {
 *             amount -= list[i]
 *         } else {
 *             println("Error, insufficient funds for the purchase. Your balance is $amount, but you need ${list[i]}.")
 *             System.exit(0)
 *         }
 *     }
 *     println("Thank you for choosing us to manage your account! Your balance is $amount.")
 * }
 *
 * SOL5
 * data class Account(var balance: Int) {
 *     fun deductBalance(amount: Int) = if (amount > balance) {
 *         throw InsufficientFundsException(balance, amount)
 *     } else {
 *         balance -= amount
 *     }
 *
 *     fun processTransactions(transactions: List<Int>): String = runCatching {
 *         transactions.forEach(::deductBalance)
 *         balance
 *     }.fold(
 *         onSuccess = { "Thank you for choosing us to manage your account! Your balance is $it." },
 *         onFailure = { it.localizedMessage }
 *     )
 * }
 *
 * class InsufficientFundsException(balance: Int, amount: Int) :
 *     Exception("Error, insufficient funds for the purchase. Your balance is $balance, but you need $amount.")
 *
 * fun main() = Account(readAccountBalance()).run {
 *     processTransactions(readTransactions())
 * }.let(::println)
 *
 * private fun readAccountBalance() = readln().toInt()
 *
 * private fun readTransactions() = readln().split(" ").map(String::toInt)
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
 * Generate the Fibonacci sequence upto nth term
 *  Report a typo
 * Given a positive integer number, print a list of Fibonacci sequence up to the nth term. The Fibonacci sequence is a series of numbers in which each number is the sum of the two preceding ones, often starting with 0 and 1. For example, the Fibonacci sequence up to 7th term is: 0,1,1,2,3,5,8. The input is the term n and the output should be the sequential integers of Fibonacci as a string, separated by a comma and space.
 *
 * Sample Input 1:
 *
 * 5
 *
 * Sample Output 1:
 *
 * 0, 1, 1, 2, 3
 *
 * Sample Input 2:
 *
 * 7
 *
 * Sample Output 2:
 *
 * 0, 1, 1, 2, 3, 5, 8
 *
 *
 * SOL1
 * import java.util.*
 *
 * fun main(args: Array<String>) {
 *     val scanner = Scanner(System.`in`)
 *     val n = scanner.nextInt()
 *
 *     var t1 = 0
 *     var t2 = 1
 *     var count = 0
 *
 *     while (count < n) {
 *         // sayıyı yazdır, sonuncu değilse ", " koy
 *         print(if (count == n - 1) "$t1" else "$t1, ")
 *
 *         val next = t1 + t2
 *         t1 = t2
 *         t2 = next
 *         count++
 *     }
 * }
 *
 * SOL2
 * fun main() = generateSequence({ 0 to 1 }) { it.second to it.first + it.second }
 *     .take(readln().toInt())
 *     .joinToString { it.first.toString() }
 *     .let(::print)
 *
 * // using while:
 * // fun main() = readln().toInt().let {
 * //     var (a, b, n) = listOf(0, 1, 2)
 * //     print("$a, $b")
 * //     while (n++ < it) {
 * //         (a + b).let { sum -> print(", $sum").also { a = b; b = sum } }
 * //     }
 * // }
 *
 * SOL3
 * fun main() {
 *     val n = readln().toInt()
 *     val fibSequence = mutableListOf<Int>()
 *
 *     for (i in 0 until n) {
 *         when (i) {
 *             0 -> fibSequence.add(0)
 *             1 -> fibSequence.add(1)
 *             else -> fibSequence.add(fibSequence[i - 1] + fibSequence[i - 2])
 *         }
 *     }
 *     println(fibSequence.joinToString(", "))
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
 * Asterisk patterns for positive integers
 *  Report a typo
 * Write a program that reads integers from the standard input. For each positive integer, print the corresponding number of asterisks ('*') on a new line. The program should keep reading integers until it encounters a non-positive integer, which signals the end of the input.
 *
 * Sample Input 1:
 *
 * 5
 * 3
 * 0
 *
 * Sample Output 1:
 *
 * *****
 * ***
 *
 * Sample Input 2:
 *
 * 1
 * 2
 * -1
 *
 * Sample Output 2:
 *
 * *
 * **
 *
 * SOL1
 * fun main() {
 *     val scanner = Scanner(System.`in`)
 *
 *     // Sürekli sayı al
 *     while (true) {
 *         val number = scanner.nextInt()
 *
 *         // Eğer sayı pozitifse
 *         if (number > 0) {
 *             println("*".repeat(number))  // number kadar yıldız yaz
 *         } else {
 *             break // sayı 0 veya negatifse döngü biter
 *         }
 *     }
 * }
 *
 *
 * SOL2
 * fun main() = generateSequence(::readln)
 *     .map(String::toInt)
 *     .takeWhile { it > 0 }
 *     .map { "*".repeat(it) }
 *     .forEach(::println)
 *
 *
 * SOL3
 * fun main() {
 *     val scanner = Scanner(System.`in`)
 *
 *     // Read integers from the standard input
 *     while (true) {
 *         val number = scanner.nextInt()
 *
 *         // Check if the number is positive
 *         if (number > 0) {
 *             repeat(number) {
 *                 print("*")
 *             }
 *             println()
 *         } else return
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
 * The first position of the largest element
 *  Report a typo
 * Write a program that reads a sequence of numbers of undefined size and prints the largest number and the position of its first occurrence. The position starts from 1.
 *
 * Note that numbers can be negative.
 *
 * You can stop typing in the console in IDEA by pressing Ctrl+D after you have entered the last number and hit Enter.
 *
 * Sample Input 1:
 *
 * 5
 * 1
 * 2
 * 3
 * 4
 * 5
 *
 * Sample Output 1:
 *
 * 5 1
 *
 * Sample Input 2:
 *
 * -100000
 * -100000
 * -100000
 *
 * Sample Output 2:
 *
 * -100000 1
 *
 *
 * SOL1
 * import java.util.*
 *
 * fun main() {
 *     val scanner = Scanner(System.`in`)
 *     var max = Int.MIN_VALUE  // başlangıç için en küçük int değeri
 *     var position = 0         // max değer ilk hangi pozisyonda görüldü
 *     var index = 1            // 1’den başlayan sayaç
 *
 *     while (scanner.hasNextInt()) {
 *         val num = scanner.nextInt()
 *
 *         if (num > max) {
 *             max = num
 *             position = index
 *         }
 *
 *         index++
 *     }
 *
 *     println("$max $position")
 * }
 *
 *
 * SOL2
 * fun main() {
 *     var max = readln().toInt()
 *     var index = 1
 *     var count = 1
 *
 *     while (true) {
 *         val next = readLine()?.toInt() ?: break
 *
 *         count++
 *         if (next > max) {
 *             max = next
 *             index = count
 *         }
 *     }
 *
 *     println("$max $index")
 * }
 *
 *
 * SOL3
 * fun main() {
 *     var max = Int.MIN_VALUE to 0
 *     var count = 1
 *     val scanner = Scanner(System.`in`)
 *
 *     while (scanner.hasNext()) {
 *         val n = scanner.nextInt()
 *         if (n > max.first) max = n to count
 *         count++
 *     }
 *
 *     print("${max.first} ${max.second}")
 * }
 *
 */


import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var max = Int.MIN_VALUE  // başlangıç için en küçük int değeri
    var position = 0         // max değer ilk hangi pozisyonda görüldü
    var index = 1            // 1’den başlayan sayaç

    while (scanner.hasNextInt()) {
        val num = scanner.nextInt()

        if (num > max) {
            max = num
            position = index
        }

        index++
    }

    println("$max $position")
}
