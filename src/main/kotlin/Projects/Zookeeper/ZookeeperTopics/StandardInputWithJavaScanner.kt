package Projects.Zookeeper.ZookeeperTopics

import java.util.Scanner


fun mainScanner1() {

    val scanner = Scanner(System.`in`)



    val line = scanner.nextLine() // read a whole line, e.g., "Hello, Kotlin"
    val num = scanner.nextInt()   // read a number, e.g., 123
    val string = scanner.next()   // read a string, e.g., "Hello"





    println("Line: $line")
    println("Number: $num")
    println("String: $string")


    scanner.close()

}


fun mainScanner2() {

    val scanner = Scanner("123_456")
    scanner.useDelimiter("_") // Scanner’a “ayırıcı artık _” diyoruz

    println(scanner.nextInt()) // 123
    println(scanner.nextInt()) // 456
}


fun mainScanner3() {

    val scanner = Scanner("Hello, Kotlin!")

    val word1 = scanner.next()
    val word2 = scanner.next()
    val word3 = scanner.next()
    //bu şekilde uygulama çöker, hasNext kullan scanner.hasNext()
    // yani Girdinin kaç kelimeden oluştuğunu bilmiyorsanız hasNext() yöntemini kullanın.




}


/**
 *
 * Statements
 *  Report a typo
 * We have the following object:
 *
 * val scanner = Scanner(System.`in`)
 *
 * Find the false statement.
 *
 * Select one option from the list
 *
 * scanner.nextInt() reads an integer number
 *
 * scanner.next() reads a whole string line, for example "Hello, World!"  Answer
 *
 * scanner is used to read values
 *
 * System.`in` represents the standard input
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
 * The suitable inputs
 *  Report a typo
 * Here is a snippet of code using the Scanner class:
 *
 * val scanner = Scanner(System.`in`)
 *
 * val s1 = scanner.nextLine()
 * val s2 = scanner.nextLine()
 *
 * Which input is suitable for the snippet?
 *
 * After reading the input, each both s1 and s2 should have a value.
 *
 * Select one or more options from the list
 *
 * a t
 *
 * b
 *
 * c  t
 *
 * d  t
 *
 * e
 *
 *
 *
 *
 *
 *
 *
 *
 *
 * Which input suits?
 *  Report a typo
 * Here is the code that uses the Scanner class:
 *
 * val scanner = Scanner(System.`in`)
 * val s1 = scanner.nextLine()
 * val s2 = scanner.nextLine()
 * val num = scanner.nextInt()
 *
 * Which input suits this snippet? After reading the input each variable must have a value.
 *
 * a)
 *
 * abc def
 * 123
 *
 * b)
 *
 * abc
 * def 123
 *
 * c)
 *
 * 1000
 * abc
 * 3
 *
 * d)
 *
 * abc def 123
 *
 * Select one option from the list
 *
 * a
 *
 * b
 *
 * c    true
 *
 * d
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
 *A function for reading data
 *  Report a typo
 * You have an object Scanner("Hello-Kotlin"). How can you read each word separately?
 *
 * Select one option from the list
 *
 * next().useDelimiter("-")
 *
 * useDelimiter("-")   true
 *
 * next("-")
 *
 * setDelimiter("-")
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
 * Scanner
 *  Report a typo
 * Select the correct way to create a scanner:
 *
 * Select one option from the list
 *
 * val scanner = Scanner(System)
 *
 * val scanner = Scanner()
 *
 * val scanner = Scanner(System.`in`)  true
 *
 * val scanner = Scanner(in)
 */


/**
 * Four numbers
 *  Report a typo
 * Write a program that reads four integer numbers from one line and prints them each on a new line. Input numbers should be separated by one or more spaces.
 *
 * Use nextInt() to read numbers ignoring extra spaces.
 * Sample Input 1:
 *
 * 101    102 103  104
 *
 * Sample Output 1:
 *
 * 101
 * 102
 * 103
 * 104
 *
 *
 *
 * import java.util.Scanner
 *
 * fun main() {
 *     val scanner = Scanner(System.`in`)
 *     /*
 *     // first solution
 *     val num1 = scanner.nextInt() // reads the first number
 *     val num2 = scanner.nextInt() // reads the second number
 *     val num3 = scanner.nextInt() // reads the third number
 *     val num4 = scanner.nextInt() // reads the fourth number
 *     println(num1) // prints the second number
 *     println(num2) // prints the first number
 *     println(num3) // prints the second number
 *     println(num4) // prints the first number
 *     */
 *     /*
 *     // second solution
 *     for (x in scanner) { println(x) }
 *     */
 *     /*
 *     // third solution
 *     while (scanner.hasNext()) println(scanner.next())
 *     */
 *     /*
 *     // fourth solution
 *     repeat(4) { println(scanner.next()) }
 *     */
 *     scanner.forEach { println(it) }
 * }
 *
 *
 *
 *
 *
 *  fun main(args: Array<String>) {
 *     val scanner = Scanner(System.`in`)
 *     while (scanner.hasNextInt()) println(scanner.nextInt())
 * }
 */


/**
 *
 * Read and print
 *  Report a typo
 * Write a program that reads two lines and then two numbers from one line and outputs them in the same order, each on a new line.
 *
 * Sample Input 1:
 *
 * Hello
 * Kotlin
 * 500 600
 *
 * Sample Output 1:
 *
 * Hello
 * Kotlin
 * 500
 * 600
 *
 *
 *
 * import java.util.Scanner
 *
 * fun main() {
 *     val scanner = Scanner(System.`in`)
 *     val line1 = scanner.nextLine()
 *     val line2 = scanner.nextLine()
 *     val num1 = scanner.nextInt()
 *     val num2 = scanner.nextInt()
 *     println(line1)
 *     println(line2)
 *     println(num1)
 *     println(num2)
 * }
 *
 *
 *
 *
 * import java.util.Scanner
 *
 * fun main(args: Array<String>) {
 *     val scanner = Scanner(System.`in`)
 *     repeat(2) {
 *         println(scanner.nextLine())
 *     }
 *     repeat(2) {
 *         println(scanner.nextInt())
 *     }
 * }
 */


/**
 *
 * Printing each word in a new line
 *  Report a typo
 * Write a program that reads five words from the standard input and outputs each word on a new line.
 *
 * Words can be ordered differently in the input stream.
 *
 * To solve the problem, use Scanner .
 *
 * Sample Input 1:
 *
 * This course
 * teaches you Kotlin
 *
 * Sample Output 1:
 *
 * This
 * course
 * teaches
 * you
 * Kotlin
 *
 * Sample Input 2:
 *
 * one two three four five
 *
 * Sample Output 2:
 *
 * one
 * two
 * three
 * four
 * five
 *
 *
 *
 *
 * import java.util.Scanner
 *
 * fun main() {
 *     val scanner = Scanner(System.`in`)
 *     while (scanner.hasNext()) {
 *         println(scanner.next())
 *     }
 * }
 *
 *
 *
 *
 * import java.util.Scanner
 *
 * fun main(args: Array<String>) {
 *     val scanner = Scanner(System.`in`)
 *     repeat(5) {
 *         println(scanner.next())
 *     }
 * }
 *
 *
 *
 *
 *
 *
 *
 * All definitions
 *  Report a typo
 * Match the methods and their definitions:
 *
 * Match the items from left and right columns
 * scanner.nextLine()
 * scanner.nextInt()
 * scanner.next()
 * readln()
 * Reads a whole line
 * Reads a number
 * Reads a string
 * Reads a whole non-nullable line
 */


/**
 *
 *
 */


fun mainScanner() {

    val scanner = Scanner(System.`in`)

    println("Please enter your name:")
    val name = scanner.nextLine()

    greetUserScanner(name)
}

fun greetUserScanner(name: String){

    println("Hello, $name")
}





fun greetUser(){

    val reader = Scanner(System.`in`)
    println("Please enter your name:")
    val  name = reader.nextLine()
    println("Hello, $name!")
}


fun mainGu() {
    greetUser()
}



fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    val result = (n + 5) * 2
    println(result)
}


/**
 *
 * Successful reading
 *  Report a typo
 * Here is the code that uses the Scanner class:
 *
 * val scanner = Scanner(System.`in`)
 * val s1 = scanner.nextLine()
 * val n = scanner.nextInt()
 * val s2 = scanner.next()
 *
 * Which inputs suit this snippet? After reading the input, each variable should have a value. Note, Input: is not a part of input!
 *
 * Be careful when choosing, remember the difference between methods .nextLine(), .nextInt(), and .next().
 * Select one or more options from the list
 *
 * Input:
 * Hello 100 Hello
 *
 * Input:                  T
 * Hello
 * 100 Hello
 *
 * Input:                  T
 * Hello
 * 100
 * Hello
 *
 * Input:
 * Hello 100
 * Hello
 *
 * Input:                  T
 * Hello Hello Hello
 * 100 Hello
 */








