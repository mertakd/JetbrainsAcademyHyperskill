package Projects.Zookeeper.ZookeeperTopics

import kotlin.math.sqrt


/**
 * Invoking a greeting function and printing its output
 * Kullanıcıları selamlayacak bir Kotlin uygulaması oluşturuyorsunuz. Bunu gerçekleştirmek için, kullanıcının adını bir dize olarak alan ve bir selamlama döndüren sayHello adlı bir yardımcı işleviniz var. Ana fonksiyonunuzda, kullanıcı adını userName değişkeninde saklanan 'John' olarak alırsınız. Selamlama mesajını yazdırmanız gerekiyor. Lütfen sayHello fonksiyonunu doğru şekilde çağırmak ve çıktıyı konsola yazdırmak için aşağıdaki koddaki boşlukları doldurun.
 */
fun mainInvoke() {

    val userName = " John"
    println(sayHello(userName))
}

fun sayHello(name: String): String {
    return "Hello, $name"
}







/**
 * The magic of println
 * Suppose, you see the following code:
 *  val result = println("text")
 *
 *  The value of result is Unit.
 */






/**
 * Invoking functions
 * This code calls the Math.log10 function with one argument.
 *
 * Correct the line containing an error.
 */
fun mainInFun(){
    val number = readln().toDouble()
    val logNumber = Math.log10(number)
    println(logNumber)
}


/**
 * How to invoke a function
 *  Report a typo
 * There is a function named foo that takes one argument. How to invoke this function?
 *
 * Select one option from the list
 *
 * foo[arg]
 *
 * arg.foo
 *
 * foo
 *
 * foo(arg) - True
 */


/**
 * Absolute value
 *  Report a typo
 * Choose the correct option to initialize the second declaration with the absolute value of -5.
 *
 * a)
 *
 * fun main() {
 *     val negativeFive = -5
 *     val positiveFive = Math.abs.-5
 * }
 *
 * b) true
 *
 * fun main() {
 *     val negativeFive = -5
 *     val positiveFive = Math.abs(negativeFive)
 * }
 *
 * c)
 *
 * fun main() {
 *     val negativeFive = -5
 *     val positiveFive = negativeFive(Math.abs)
 * }
 */








/**
 * Lembas
 *
 * Sam and Frodo decided to count how much bread they had. To do this, they created a function totalLembas that counts how much bread they have in total.
 *
 * Your task is to invoke the function totalLembas; pass breadFromFrodo and breadFromSam as arguments.
 */
fun totalLembas(first: String, second: String){
    return print(first.toInt() + second.toInt())
}
//fun totalLembas(first: String, second: String) = print(first.toInt() + second.toInt())

fun mainLembas(){
    val breadFromFrodo = readln()
    val breadFromSam = readln()

    totalLembas(breadFromFrodo, breadFromSam)
}








/**
 *Square root
 *  Report a typo
 * Now you know that kotlin.math groups multiple functions; one of them is sqrt, that calculates the square root of passed value.
 *
 * Call sqrt function in the same way as we called the abs, calculate the square root of the number and print the resulting value.
 *
 * Sample Input 1:
 *
 * 4
 *
 * Sample Output 1:
 *
 * 2.0
 *
 * Sample Input 2:
 *
 * 16
 *
 * Sample Output 2:
 *
 * 4.0
 */
fun mainSquare () {
    val number = readln().toDouble()

    val result = sqrt(number)
    println(result)
}








/**
 * Your task is to fill the blanks in the Kotlin code, which is designed to create a greeting message. You will need to define a function that takes a string parameter (name) and returns another string. This function is then invoked in the main function, and the result is printed. The returned string from the function and the print statement in the main function are the blanks you need to fill.
 */
fun hello(name: String): String{
    return "Hello, $name"
}

fun mainHello() {
    val greeting = hello("World")
    println(greeting)
}












/**
 * rafting Welcomes: A Personalized Hello
 *  Report a typo
 * Write a program that reads a name from the input, generates a simple greeting by appending 'Hello, ' to the name, and prints out the complete greeting.
 *
 * Sample Input 1:
 *
 * John
 *
 * Sample Output 1:
 *
 * Hello, John
 *
 * Sample Input 2:
 *
 * Alice
 *
 * Sample Output 2:
 *
 * Hello, Alice
 */
fun mainGenerateGreeting() {
    val input = readLine() ?: ""

    fun generateGreeting(name: String): String{
        return "Hello, $name"
    }

    println(generateGreeting(input.trim()))
}










/**
 * Brewing code for the perfect cup
 *
 * Create a function that orders a coffee and call it in the main function to display the order details. Fill the blanks in the code to make it work correctly.
 *
 */
fun orderCoffee(type: String, size: String): String{
    return "You ordered a $size $type"
}

fun mainOrderCoffee() {
    val order = orderCoffee("latte","large")
    println(order)
}

