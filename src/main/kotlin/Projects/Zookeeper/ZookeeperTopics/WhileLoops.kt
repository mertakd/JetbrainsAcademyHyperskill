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
 */


fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    var count = 0
    while (scanner.nextInt() != 0) count++
    println(count)
}