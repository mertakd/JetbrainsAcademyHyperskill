package Projects.Zookeeper.ZookeeperTopics

import java.util.Scanner

//Diğer bazı programlama dillerinin aksine, Kotlin'in if'i bir deyim değil, bir ifadedir. Bu, hesaplamaların sonucu olarak bir değer döndürebileceği anlamına gelir. Sonuç, gövdedeki son ifade olmalıdır.

/**
 * val max = if (a > b) {
 *     println("Choose a")
 *     a
 * } else {
 *     println("Choose b")
 *     b
 * }
 *
 * Yukarıdaki örnekte, max değişkenine gövdedeki son ifadenin değeri atanır. İfade tarzı bir if kullanıyorsanız, bunun bir else dalı olması gerektiğine dikkat etmeniz önemlidir.
 *
 *
 *
 * you can skip braces if all the bodies contain only a single statement:
 *
 * val max = if (a > b) a else b
 *
 *
 *
 *
 * Bir sonucu saklamak için yeni bir değişken bildirmenizin gerekmediği durumlar vardır. Örneğin, aşağıdaki örneği düşünün:
 * fun main() {
 *     val a = readln().toInt()
 *     val b = readln().toInt()
 *
 *     println(if (a == b) {
 *         "a equal b"
 *     } else if (a > b) {
 *         "a is greater than b"
 *     } else {
 *         "a is less than b"
 *     })
 * }
 * Yukarıdaki örnekte, if ifadesi bir değişken bildirilmeden doğrudan println() fonksiyonuna aktarılır ve println() sonucu yazdırır.
 */


/**
 * Quiz
 *Creating an application to determine the adulthood status
 * You are building a simple application in Kotlin that will display user's name and age and determine if they are an adult. You have a variable 'name' with a value 'John' and 'age' with a value 22. You need to print a statement like 'John is 22 years old. Adult? Yes'. To determine if the user is adult, you'll write an expression that tests if the age is greater or equal to 18 and output either 'Yes' when true, or 'No' when false. You should fill the blanks in code to create a resulting message using string templates.
 * Fill in the gaps with the relevant elements
 *
 * fun main() {
 *
 *     val name = "John"
 *
 *     val age = 22
 *
 *     val isAdult = if (age >= 18) "Yes" else "No"
 *     println("$name is ${age} years old. Adult? $isAdult")
 * }
 *
 *
 *
 *
 *
 *
 * Complete a function to compare two numbers
 *  Report a typo
 * You have a Kotlin function 'checkNumberRelations' that takes two integers as input and returns a string message comparing the inputs. However, some essential parts of this function are missing. Your task is to complete this function by replacing blank spots (marked with ▭) to make it work correctly. Function should return 'The number a is larger than b.' if a is greater than b, 'The number a is less than b.' if a is less than b and 'The numbers a and b are equal.' if a and b are equal."
 *
 * Fill in the gaps with the relevant elements
 * fun main() {
 *
 *     val result = checkNumberRelations(10, 5)
 *     println(result)
 * }
 *
 *
 *
 * fun checkNumberRelations(a: Int, b: Int): String {
 *
 *     if (a > b) {
 *         return "The number $a is larger than $b"
 *     }else if (a < b) {
 *         return "The number $a is less than $b"
 *     }else{
 *         return "The number $a and $b are equal."
 *     }
 * }
 *
 *
 *
 *
 *
 *
 *
 * Comparing two integers and displaying the greater one
 * You are given a program that compares two integers `numberA` and `numberB`. Your task is to fill the blanks in the code to print out whichever number is greater. Use an 'if' expression to compare the two numbers and string templates to display the result. Make sure your solution uses relational operators for comparison.
 *fun main() {
 *
 *     val numberA = 10
 *     val numberB = 20
 *     val result = if (numberA > numberB) "Number A ($numberA) is greater than Number B($numberB)"
 *                  else "Number B ($numberB) is greater than Number A ($numberA)"
 *     println(result)
 *
 * }
 *
 *
 *
 *
 *
 * Finding the maximum of two numbers
 *  Report a typo
 * Implement a simple program in Kotlin that finds the maximum of two numbers 'a' and 'b'. Use decision-making control structures to evaluate the larger number. Assign this larger value to the variable 'max'. Display a message to the console, using string templates, that indicates the maximum value between 'a' and 'b'. Fill the blanks in the code to accomplish this task.
 *
 * Fill in the gaps with the relevant elements
 *
 *fun main() {
 *
 *     val a = 5
 *     val b = 3
 *     val max: Int
 *
 *     if (a > b){
 *         max = a
 *     }else{
 *         max = b
 *     }
 *
 *     println("The maximum between $a and $b is $max")
 * }
 *
 *
 *
 *
 *
 * Positive, Negative or Zero
 *  Report a typo
 * Write a program that reads an integer from the console and prints:
 *
 * if the number < 0 - negative;
 * if the number > 0 - positive;
 * if the number = 0 - zero;
 * Sample Input 1:
 *
 * -5
 *
 * Sample Output 1:
 *
 * negative
 *
 * fun main() {
 *
 *     val number = readLine()!!.toInt()
 *
 *     val output : String
 *
 *     if (number < 0){
 *         output = "negative"
 *     }else if (number > 0){
 *         output = "positive"
 *     }else{
 *         output = "zero"
 *     }
 *
 *     println(output)
 *
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
 * Number dividers
 *  Report a typo
 * Write a program that reads an integer number and checks if it is divisible by 2, 3, 5, or 6.
 *
 * If the number is divisible by M, the program should output "Divided by M".
 *
 * The program should check all the divisors listed above. The order of divisors in the result can be any.
 *
 * Tip: Use the modulo operator % to check whether a number divided by another one.
 *
 * Sample Input 1:
 *
 * 6
 *
 * Sample Output 1:
 *
 * Divided by 2
 * Divided by 3
 * Divided by 6
 *
 *val two = 2
 *     val three = 3
 *     val five = 5
 *     val six = 6
 *     val st  = "Divided by"
 *     val num = readLine()!!.toInt()
 *
 *     if (num % two == 0){
 *         println("$st $two")
 *     }
 *     if (num % three == 0){
 *         println("$st $three")
 *     }
 *     if (num % five == 0){
 *         println("$st $five")
 *     }
 *     if (num % six == 0){
 *         println("$st $six")
 *     }
 *
 *
 *          solution2
 *
 *     val number = readLine()!!.toInt()
 *     listOf(2,3,5,6).forEach { if(number % it == 0) println("Divided by $it")}
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
 *     The max of two numbers without else-branch
 *  Report a typo
 * Write a program that uses if to find the max of two integer numbers. These numbers can be positive, negative or zero.
 *
 *
 * Be creative, solve the problem without else branch :)
 *
 *
 * Use the provided code template, print the max.
 *
 * Sample Input 1:
 *
 * 8
 * 11
 *
 * Sample Output 1:
 *
 * 11
 *
 * fun main(args: Array<String>) {
 *     val scanner = Scanner(System.`in`)
 *
 *     val a = scanner.nextInt()
 *     val b = scanner.nextInt()
 *
 *     // put your code here
 *     var max = a
 *     if (b > a) max = b
 *     println(max)
 * }
 *
 * SOL2
 * fun main() {
 *
 *     val a = readLine()!!.toInt()
 *     val b = readLine()!!.toInt()
 *
 *     if (a >= b) {
 *         return println(a)
 *     }
 *     println(b)
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
 *     The max of three numbers
 *  Report a typo
 * Write a program that uses the if expression to find the max of three integer numbers. These numbers can be positive, negative or zero.
 *
 *
 * Use the provided code template.
 *
 * Sample Input 1:
 *
 * 12
 * 15
 * 11
 *
 * Sample Output 1:
 *
 * 15
 *
 * fun main() {
 *
 *
 *
 *     val a = readLine()!!.toInt()
 *     val b = readLine()!!.toInt()
 *     val c = readLine()!!.toInt()
 *
 *
 *     println(
 *
 *         if (a > c){
 *             if (a > b) a else b
 *         }else{
 *             if (c > b) c else b
 *         }
 *
 *     )
 *
 * }
 *
 *sol2
 * fun main() {
 *
 *     val (a,b,c) = Array(3) {readLine()!!.toInt()}
 *
 *     println(if (a > c) {
 *         if (a > b) a else b
 *     } else {
 *         if (c > b) c else b
 *     })
 *
 * }
 *
 *SOL3
 *fun main() {
 *     val number1 = readLine()!!.toInt()
 *     val number2 = readLine()!!.toInt()
 *     val number3 = readLine()!!.toInt()
 *
 *     val maxNumber = if (number1 >= number2 && number1 >= number3) {
 *         number1
 *     } else if (number2 >= number1 && number2 >= number3) {
 *         number2
 *     } else {
 *         number3
 *     }
 *
 *     println(maxNumber)
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
 * Categorizing temperature in Fahrenheit
 *  Report a typo
 * Write a program that reads a temperature in Fahrenheit from the input and prints 'High temperature' if the temperature is above 85, 'Low temperature' if it's below 50, and 'Normal temperature' otherwise.
 *
 * Sample Input 1:
 *
 * 90
 *
 * Sample Output 1:
 *
 * High temperature
 *
 * Sample Input 2:
 *
 * 40
 *
 * Sample Output 2:
 *
 * Low temperature
 *
 * sol1
 * val scan = Scanner(System.`in`)
 *
 *     val temperature: Int = scan.nextLine().trim().toInt()
 *
 *     if (temperature > 85){
 *         println("Hight temperature")
 *     }else if (temperature < 50){
 *         println("Low temperature")
 *     }else{
 *         println("Normal temperature")
 *     }
 *
 * sol2
 * const val HIGH = 85
 * const val LOW = 50
 * fun main(args: Array<String>) {
 *     val scan = Scanner(System.`in`)
 *     val temperature: Int = scan.nextLine().trim().toInt()
 *     print(
 *         when {
 *             temperature > HIGH -> "High temperature"
 *             temperature < LOW -> "Low temperature"
 *             else -> "Normal temperature"
 *         }
 *     )
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
 * Find the output
 *  Report a typo
 * What is the result of this code?
 *
 * val x = 11
 *
 * if (x * 2 + 1 < 23 && x % 2 == 1) {
 *     print("1")
 *     print(if (x == 11) "2" else "3")
 * } else if (x != 0) {
 *     print("4")
 * }
 * print("5")
 * //45
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
 * Healthy sleep
 * Sample Input 1:
 *
 * 6
 * 10
 * 8
 *
 * Sample Output 1:
 *
 * Normal
 *
 * Sample Input 2:
 *
 * 7
 * 9
 * 10
 *
 * Sample Output 2:
 *
 * Excess
 *
 * Sample Input 3:
 *
 * 7
 * 9
 * 2
 *
 * Sample Output 3:
 *
 * Deficiency
 *
 * sol1
 * val minSleepHours = readln().toInt()
 *     val maxSleepHours = readln().toInt()
 *     val annSleepHours = readln().toInt()
 *
 *
 *     val output: String
 *
 *     if (annSleepHours < minSleepHours){
 *         output = "Deficiency"
 *     }else if (annSleepHours > maxSleepHours){
 *         output = "Excess"
 *     }else{
 *         output = "Normal"
 *     }
 *     println(output)
 *
 * sol2
 *     val a = readln().toInt()
 *     val b = readln().toInt()
 *     val c = readln().toInt()
 *
 *     val result = if (c < a) "Deficienty" else if (c > b) "Excess" else "Normal"
 *
 *     println(result)
 *
 *
 *
 *sol3
 * val (a,b,h) = List(3) {readln().toInt()}
 * print(if (h in a..b) "Normal" else if (h > b) "Excess" else "Deficiency")
 *
 *
 *sol4
 * fun main() {
 *     val a = readLine()!!.toInt()
 *     val b = readLine()!!.toInt()
 *     val h = readLine()!!.toInt()
 *
 *     println(
 *         when (h) {
 *             in a..b -> "Normal"
 *             in 0..a -> "Deficiency"
 *             else -> "Excess"
 *         }
 *     )
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
 * Leap year
 *  Report a typo
 * Is a year a leap year?
 *
 * Just a reminder: leap years are the years that are either divisible by 4 and not divisible by 100, or divisible by 400 (for example, the year 2000 is a leap year, but the year 2100 is not).
 *
 * The program should work for the years 1900 ≤ n ≤ 3000.
 *
 * Output "Leap" (case-sensitive) if the year is a leap, otherwise print "Regular".
 *
 * Sample Input 1:
 *
 * 2100
 *
 * Sample Output 1:
 *
 * Regular
 *
 * Sample Input 2:
 *
 * 2000
 *
 * Sample Output 2:
 *
 * Leap
 *
 *fun main() {
 *     val year = readLine()!!.toInt()
 *
 *     if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
 *         println("Leap")
 *     } else {
 *         println("Regular")
 *     }
 * }
 *
 * sol2
 * fun main(args: Array<String>) {
 *     val year = readLine()!!.toInt()
 *     println(if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) "Leap" else "Regular")
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
 * Check a number is positive
 *  Report a typo
 * Write a program that reads a number and prints YES if it is positive. Otherwise, the program should print NO.
 *
 * Do not forget that zero is not a positive number.
 *
 * Sample Input 1:
 *
 * 7
 *
 * Sample Output 1:
 *
 * YES
 *
 *
 * fun main() {
 *
 *     val number = readln().toInt()
 *
 *     val output = if (number > 0){
 *         "YES"
 *     }else{
 *         "NO"
 *     }
 *
 *     println(output)
 *
 * }
 *
 * sol2
 * print(if (readln().toInt() > 0) "YES" else "NO")
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
 * Odd or even
 *  Report a typo
 * Write a program that reads a number and prints EVEN if it is even. Otherwise, the program should print ODD.
 *
 * Sample Input 1:
 *
 * 5
 *
 * Sample Output 1:
 *
 * ODD
 *
 * Sample Input 2:
 *
 * -5
 *
 * Sample Output 2:
 *
 * ODD
 *
 *
 * SOL1
 * fun main() {
 *
 *
 *     val number = readln().toInt()
 *
 *     if (number % 2 == 0){
 *         println("EVEN")
 *     }else{
 *         println("ODD")
 *     }
 *
 * }
 *
 * SOL2
 *println(if (readln().toInt() % 2 == 0) "EVEN" else "ODD")
 * SOL3
 * fun main() {
 *
 *     println(
 *         when (readln().toInt() % 2 == 0) {
 *             true -> "EVEN"
 *             false -> "ODD"
 *         }
 *     )
 * }
 *
 *
 *
 *
 *
 *
 * Triangle
 *  Report a typo
 * Read three natural numbers a, b, c. Define if a triangle with such side lengths exists.
 *
 * If the triangle exists, output the YES string, otherwise output NO.
 * Note that a triangle is formed by three connected points that are not located on a single straight line.
 *
 * Sample Input 1:
 *
 * 3
 * 4
 * 5
 *
 * Sample Output 1:
 *
 * YES
 *
 * SOL1
 * fun main() {
 *     val a = readLine()!!.toInt()
 *     val b = readLine()!!.toInt()
 *     val c = readLine()!!.toInt()
 *
 *     if (a + b > c && a + c > b && b + c > a) {
 *         println("YES")
 *     } else {
 *         println("NO")
 *     }
 * }
 *
 * SOL2
 *fun main() {
 *     val (a, b, c) = List(3) { readLine()!!.toInt() }.sorted()
 *     println(if (a + b > c) "YES" else "NO")
 * }
 *
 * SOL3
 * fun main(args: Array<String>) {
 *     val scanner = Scanner(System.`in`)
 *     val a = scanner.nextInt()
 *     val b = scanner.nextInt()
 *     val c = scanner.nextInt()
 *     print(if (a + b > c && b + c > a && a + c > b) "YES" else "NO")
 * }
 *
 * SOL4
 * fun main() {
 *     val triangle = Array(1 + 1 + 1) { readLine()!!.toInt() }
 *     println(if (2 * triangle.maxOrNull()!! < triangle.sum()) "YES" else "NO")
 * }
 *
 *
 *
 *
 *
 *
 *
 * Interval
 * Sample Input 1:
 *
 * 20
 *
 * Sample Output 1:
 *
 * True
 *
 * Sample Input 2:
 *
 * -20
 *
 * Sample Output 2:
 *
 * False
 *
 * SOL1
 * fun main() {
 *     print(readln()!!.toInt().let { if (it in -14..12 || it in 15..16 || it >= 19) "True" else "False" } )
 * }
 *
 * SOL2
 * fun main() {
 *     val num = readln().toInt()
 *     println(if (num in -14..12 || num in 15..16 || num >= 19) "True" else "False")
 * }
 *
 * SOL3
 * fun main() {
 *     val a = readln().toInt()
 *     if (a in -14..12 || a in 15..16 || a in 19..Int.MAX_VALUE) println("True") else println("False")
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
 * Creating an application to determine the adulthood status
 * You are building a simple application in Kotlin that will display user's name and age and determine if they are an adult. You have a variable 'name' with a value 'John' and 'age' with a value 22. You need to print a statement like 'John is 22 years old. Adult? Yes'. To determine if the user is adult, you'll write an expression that tests if the age is greater or equal to 18 and output either 'Yes' when true, or 'No' when false. You should fill the blanks in code to create a resulting message using string templates.
 *
 * fun main() {
 *
 *     val name = "John"
 *
 *     val age = 22
 *
 *     val isAdult = if (age >= 18) "YES" else "No"
 *
 *     println("$name is $age years old. Adult $isAdult")
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
 * Statements about brackets in if
 *  Report a typo
 * What is true about brackets in if expression?
 * We must use curly braces if we have several statements inside if or else branch.
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
 * Knights
 *  Report a typo
 * You have the coordinates of two knights on a chessboard. Find out whether they can beat each other.
 *
 * Four integer numbers
 * x
 * 1
 * ,
 * y
 * 1
 * ,
 * x
 * 2
 * ,
 * y
 * 2
 *
 *
 * Output data format
 *
 * Type "YES" (uppercase) if they beat each other and "NO" if they don't.
 *
 * You may need a method that calculates the absolute value of a number:
 *
 * import kotlin.math.*
 *
 * println(abs(-5)) // 5
 *
 * Sample Input 1:
 *
 * 1 1
 * 2 3
 *
 * Sample Output 1:
 *
 * YES
 *
 * Sample Input 2:
 *
 * 1 1
 * 2 2
 *
 * Sample Output 2:
 *
 * NO
 *
 * Sample Input 3:
 *
 * 1 1
 * 1 4
 *
 * Sample Output 3:
 *
 * NO
 *
 * Sample Input 4:
 *
 * 4 3
 * 3 5
 *
 * Sample Output 4:
 *
 * YES
 *
 *
 * sol1
 * fun main() {
 *     val (x1, y1) = readLine()!!.split(" ").map { it.toInt() }
 *     val (x2, y2) = readLine()!!.split(" ").map { it.toInt() }
 *
 *     val dx = Math.abs(x1 - x2)
 *     val dy = Math.abs(y1 - y2)
 *
 *     if ((dx == 2 && dy == 1) || (dx == 1 && dy == 2)) {
 *         println("YES")
 *     } else {
 *         println("NO")
 *     }
 * }
 *
 *
 *sol2
 * import java.util.*
 * import kotlin.math.abs
 *
 * fun main() {
 *     val scanner = Scanner(System.`in`)
 *
 *     val x1 = scanner.nextInt()
 *     val y1 = scanner.nextInt()
 *     val x2 = scanner.nextInt()
 *     val y2 = scanner.nextInt()
 *
 *     print(if (abs((x1 - x2) * (y1 - y2)) == 2) "YES" else "NO")
 * }
 *
 * sol3
 * import kotlin.math.abs
 *
 * const val YES = "YES"
 * const val NO = "NO"
 *
 * fun main() {
 *     val (x1, y1) = readLine()!!.split(" ").map { it.toInt() }
 *     val (x2, y2) = readLine()!!.split(" ").map { it.toInt() }
 *
 *     println(if (abs(x1 - x2) * abs(y1 - y2) == 2) YES else NO)
 * }
 *
 *
 * sol4
 *import kotlin.math.abs
 *
 * fun main() {
 *     // Read input values
 *     val (x1, y1) = readLine()!!.trim().split("\\s+".toRegex()).map(String::toInt)
 *     val (x2, y2) = readLine()!!.trim().split("\\s+".toRegex()).map(String::toInt)
 *     println(
 *         // Check if opponents can beat each other
 *         if (canBeat(x1, y1, x2, y2)) {
 *             "YES"
 *         } else {
 *             "NO"
 *         }
 *     )
 * }
 *
 * /**
 *  * Checks whether knights can beat each other in a chess game.
 *  *
 *  * @param x1 X coordinate of the first knight.
 *  * @param y1 Y coordinate of the first knight.
 *  * @param x2 X coordinate of the second knight.
 *  * @param y2 Y coordinate of the second knight.
 *  *
 *  * @return True if knights can beat each other. Otherwise, false.
 *  */
 * fun canBeat(x1: Int, y1: Int, x2: Int, y2: Int): Boolean {
 *     // Check first condition.
 *     val c1 = abs(x1 - x2) == 1 && abs(y1 - y2) == 2
 *     // Check second condition.
 *     val c2 = abs(x1 - x2) == 2 && abs(y1 - y2) == 1
 *
 *     // If one of the conditions meets with the corresponding positions then return TRUE.
 *     return c1 || c2
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
 *
 * Queens
 *  Report a typo
 * Given are the coordinates of two queens on a chessboard. Find out whether they take each other. Taking in chess means attacking. The queen moves any number of vacant squares horizontally, vertically, or diagonally.
 *
 * chessboard with two queens
 *
 * Input data format
 *
 * Four integer numbers
 * x
 * 1
 * ,
 * y
 * 1
 * ,
 * x
 * 2
 * ,
 * y
 * 2
 * x
 * 1
 * ​
 *  ,y
 * 1
 * ​
 *  ,x
 * 2
 * ​
 *  ,y
 * 2
 * ​
 *
 * .
 *
 * Output data format
 *
 * Type "YES" (uppercase) if they take each other and "NO" if they don't.
 *
 * You may need to calculate the absolute value of the number. You can do it this way:
 *
 * import kotlin.math.*
 *
 * println(abs(-5)) // 5
 *
 * Sample Input 1:
 *
 * 1 1
 * 3 3
 *
 * Sample Output 1:
 *
 * YES
 *
 * Sample Input 2:
 *
 * 1 1
 * 4 3
 *
 * Sample Output 2:
 *
 * NO
 *
 * Sample Input 3:
 *
 * 2 2
 * 5 2
 *
 * Sample Output 3:
 *
 * YES
 *
 * SOL1
 * import kotlin.math.abs
 *
 * fun main() {
 *     val (x1, y1) = readLine()!!.split(" ").map { it.toInt() }
 *     val (x2, y2) = readLine()!!.split(" ").map { it.toInt() }
 *
 *     if (x1 == x2 || y1 == y2 || abs(x1 - x2) == abs(y1 - y2)) {
 *         println("YES")
 *     } else {
 *         println("NO")
 *     }
 * }
 *
 *
 * SOL2
 * import java.util.*
 * import kotlin.math.abs
 *
 * fun main(args: Array<String>) {
 *     val scanner = Scanner(System.`in`)
 *     val (x1, y1, x2, y2) = List(4) { scanner.nextInt() }
 *     print(if (x1 == x2 || y1 == y2 || abs(x1 - x2) == abs(y1 - y2)) "YES" else "NO")
 * }
 *
 * SOL3
 * import kotlin.math.abs
 *
 * fun main() {
 *     val (x1, y1) = readln().split(' ')
 *     val (x2, y2) = readln().split(' ')
 *
 *     val y = abs(y2.toInt() - y1.toInt())
 *     val x = abs(x2.toInt() - x1.toInt())
 *
 *     if (x1 == x2 || y1 == y2 || x == y) {
 *         println("YES")
 *     } else {
 *         println("NO")
 *     }
 * }
 *
 *
 * SOL4
 * import kotlin.math.abs
 *
 * fun main() {
 *     val firstQueen = readln().split(" ").map(String::toInt).zipWithNext().single()
 *     val secondQueen = readln().split(" ").map(String::toInt).zipWithNext().single()
 *
 *     println(if (canQueenTake(firstQueen, secondQueen)) "YES" else "NO")
 * }
 *
 * /**
 *  * @param queenPosition the position of the queen
 *  * @param otherPiecePosition the position of the other piece
 *  * @return if queen can take
 *  */
 * private fun canQueenTake(queenPosition: Pair<Int, Int>, otherPiecePosition: Pair<Int, Int>): Boolean {
 *     val horizontally = queenPosition.first == otherPiecePosition.first
 *     val vertically = queenPosition.second == otherPiecePosition.second
 *     val diagonally = abs(queenPosition.first - otherPiecePosition.first) ==
 *         abs(queenPosition.second - otherPiecePosition.second)
 *     return horizontally || vertically || diagonally
 * }
 *
 *SOL5
 * import java.util.Scanner
 *
 * const val YES = "YES"
 * const val NO = "NO"
 * const val EIGHT = 8
 *
 * fun main() {
 *     val scanner = Scanner(System.`in`)
 *     val x1 = scanner.nextInt()
 *     val y1 = scanner.nextInt()
 *     val x2 = scanner.nextInt()
 *     val y2 = scanner.nextInt()
 *     println(
 *         if (checkHorizontallyMove(x1, y1, x2, y2) ||
 *             checkVerticallyMove(x1, y1, x2, y2) ||
 *             checkDiagonallyMove(x1, y1, x2, y2)
 *         ) {
 *             YES
 *         } else {
 *             NO
 *         }
 *     )
 * }
 *
 * fun checkHorizontallyMove(x1: Int, y1: Int, x2: Int, y2: Int): Boolean {
 *     if (x1 == x2) {
 *         return true
 *     }
 *
 *     var xLower: Int
 *     var xUpper: Int
 *     if (x1 > x2) {
 *         xLower = x2
 *         xUpper = x1
 *     } else {
 *         xLower = x1
 *         xUpper = x2
 *     }
 *
 *     for (i in xLower..EIGHT) {
 *         if (i == xUpper && y1 == y2) {
 *             return true
 *         }
 *     }
 *     return false
 * }
 *
 * fun checkVerticallyMove(x1: Int, y1: Int, x2: Int, y2: Int): Boolean {
 *     if (y1 == y2) {
 *         return true
 *     }
 *
 *     var yLower: Int
 *     var yUpper: Int
 *     if (y1 > y2) {
 *         yLower = y2
 *         yUpper = y1
 *     } else {
 *         yLower = y1
 *         yUpper = y2
 *     }
 *
 *     for (i in yLower..EIGHT) {
 *         if (i == yUpper && x1 == x2) {
 *             return true
 *         }
 *     }
 *     return false
 * }
 *
 * fun checkDiagonallyMove(x1: Int, y1: Int, x2: Int, y2: Int): Boolean {
 *     var xLower: Int
 *     var xUpper: Int
 *     var yLower: Int
 *     var yUpper: Int
 *
 *     if (x1 > x2) {
 *         xLower = x2
 *         xUpper = x1
 *     } else {
 *         xLower = x1
 *         xUpper = x2
 *     }
 *
 *     if (y1 > y2) {
 *         yLower = y2
 *         yUpper = y1
 *     } else {
 *         yLower = y1
 *         yUpper = y2
 *     }
 *
 *     var x = xLower
 *     var y = yLower
 *     while (x <= EIGHT && y <= EIGHT) {
 *         if (x == xUpper && y == yUpper) {
 *             return true
 *         }
 *         x++
 *         y++
 *     }
 *     return false
 * }
 */


fun main() {


}






















