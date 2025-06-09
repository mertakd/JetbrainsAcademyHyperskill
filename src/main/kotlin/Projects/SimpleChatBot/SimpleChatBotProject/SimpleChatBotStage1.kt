package Projects.SimpleChatBot.SimpleChatBotProject

import java.time.Year

/*
 *Chatty Bot welcomes you
 Report a typo
Description
Digital personal assistants help people to drive cars, plan their day, and buy things online. In a sense, they are simplified versions of artificial intelligence with whom you can talk.

In this project, you will develop step by step a simple bot that will help you study programming.

Objective
For the first stage, you will write a bot that displays a greeting, its name, and the year it was created. First impressions count!

Your program should print the following lines:

Hello! My name is {botName}.
I was created in {birthYear}.

Instead of {botName}, print any name you choose and replace {birthYear} with the current year (four digits). You don't need to take any input in this stage.

Example
Output:

Hello! My name is Aid.
I was created in 2023.

Here's the result with your bot named Aid, and 2023 as its birth year. Feel free to modify the values, but make sure to print exactly two lines.
 */



/**
 * SOL1
 *     val name = "Aid"
 *     val birth = "2020"
 *
 *     println("hello My name is $name")
 *     println("I was created in $birth")
 *
 *
 *
 * SOL2
 * object Constants {
 *     const val BOT_NAME = "A.I.S"
 *     const val CREATION_YEAR = 2020
 * }
 *
 * fun main() {
 *     println("Hello! My name is ${Constants.BOT_NAME}.")
 *     print("Hello! My name is ${Constants.CREATION_YEAR}.")
 * }
 *
 *
 * SOL3
 *  print("Hello! My name is Bot.\nI was created in ${java.time.LocalDate.now().year}.")
 *
 *
 * SOL4
 * import java.time.Year
 *
 * fun main() {
 *     val name = "Vanda"
 *     val currentYear = Year.now().value
 *
 *     println("Hello! My name is $name.")
 *     println("I was created in $currentYear.")
 * }
 *
 *
 * SOL5
 * fun main() {
 *     val botName = "Aid"
 *     val birthYear = 2020
 *
 *     fun welcomeMessage(name: String, birthday: Int) {
 *         println("Hello! My name is ${name}.")
 *         println("I was created in ${birthday}.")
 *     }
 *
 *     welcomeMessage(botName, birthYear)
 * }
 *

 */


fun main() {

    val botName = "Aid"
    val birthYear = Year.now().value

    fun welcomeMessage(name: String, birthYear: Int){
        println("Hello! My name is ${name}.")
        println("I was created in ${birthYear}")
    }

    welcomeMessage(botName,birthYear)

}