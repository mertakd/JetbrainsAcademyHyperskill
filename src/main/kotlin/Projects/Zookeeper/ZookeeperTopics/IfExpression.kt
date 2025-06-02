package Projects.Zookeeper.ZookeeperTopics

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
 *
 *
 */


fun main() {

}






















