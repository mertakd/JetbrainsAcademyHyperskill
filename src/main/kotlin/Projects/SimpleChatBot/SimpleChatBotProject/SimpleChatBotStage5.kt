package Projects.SimpleChatBot.SimpleChatBotProject

/**
 * Multiple choice
 *  Report a typo
 * Description
 * At the final stage, you will improve your simple bot so that it can give you a test and check your answers. The test should be a multiple-choice quiz about programming with any number of options. Your bot has to repeat the test until you answer correctly and congratulate you upon completion.
 *
 * Objective
 * Your bot can ask anything you want, but there are two rules for your output:
 *
 * the line with the test should end with the question mark character;
 * an option starts with a digit followed by the dot (1., 2., 3., 4.)
 * If a user enters an incorrect answer, the bot may print a message:
 *
 * Please, try again.
 *
 * The program should stop on the correct answer and print Congratulations, have a nice day! at the end.
 *
 * Example
 * The greater-than symbol followed by a space (> ) represents the user input. Note that it's not part of the input.
 *
 * Example 1: a dialogue with the final version of your bot
 *
 * Hello! My name is Aid.
 * I was created in 2023.
 * Please, remind me your name.
 * > Max
 * What a great name you have, Max!
 * Let me guess your age.
 * Enter remainders of dividing your age by 3, 5 and 7.
 * > 1
 * > 2
 * > 1
 * Your age is 22: that's a good time to start programming!
 * Now I will prove to you that I can count to any number you want.
 * > 3
 * 0!
 * 1!
 * 2!
 * 3!
 * Let's test your programming knowledge.
 * Why do we use methods?
 * 1. To repeat a statement multiple times.
 * 2. To decompose a program into several small subroutines.
 * 3. To determine the execution time of a program.
 * 4. To interrupt the execution of a program.
 * > 4
 * Please, try again.
 * > 2
 * Congratulations, have a nice day!
 *
 * The program must end with the Congratulations, have a nice day! message.
 *
 * Use the provided template to simplify your work. You can change the text if you want. Please note that we use functions to make it easy to understand the program and add new code to it or edit later.
 *
 *-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 *
 *
 *
 * Tamam, sana metnin birebir Türkçe çevirisini yapayım, ancak içindeki **kod örnekleri ve format** aynen kalacak.
 *
 * ---
 *
 * **Açıklama**
 * Son aşamada, basit botunuzu geliştirecek ve size bir test yapıp cevaplarınızı kontrol edebileceksiniz. Test, istediğiniz sayıda seçeneğe sahip çoktan seçmeli bir programlama sınavı olmalıdır. Botunuz, siz doğru cevabı verene kadar testi tekrar etmeli ve tamamlandığında sizi tebrik etmelidir.
 *
 * **Amaç**
 * Botunuz istediğiniz her şeyi sorabilir, ancak çıktı için iki kural vardır:
 *
 * * Testin bulunduğu satır **soru işareti** ile bitmelidir.
 * * Bir seçenek, rakam ve ardından nokta ile başlamalıdır (**1.**, **2.**, **3.**, **4.**).
 *
 * Kullanıcı yanlış cevap girerse, bot şu mesajı yazabilir:
 *
 * ```
 * Please, try again.
 * ```
 *
 * Program doğru cevapta durmalı ve sonunda şu mesajı yazdırmalıdır:
 *
 * ```
 * Congratulations, have a nice day!
 * ```
 *
 * ---
 *
 * **Örnek**
 * Büyüktür işareti ve ardından bir boşluk (`> `), kullanıcı girişini temsil eder. Bunun girişin bir parçası olmadığını unutmayın.
 *
 * **Örnek 1**: Botunuzun son sürümü ile diyalog
 *
 * ```
 * Hello! My name is Aid.
 * I was created in 2023.
 * Please, remind me your name.
 * > Max
 * What a great name you have, Max!
 * Let me guess your age.
 * Enter remainders of dividing your age by 3, 5 and 7.
 * > 1
 * > 2
 * > 1
 * Your age is 22: that's a good time to start programming!
 * Now I will prove to you that I can count to any number you want.
 * > 3
 * 0!
 * 1!
 * 2!
 * 3!
 * Let's test your programming knowledge.
 * Why do we use methods?
 * 1. To repeat a statement multiple times.
 * 2. To decompose a program into several small subroutines.
 * 3. To determine the execution time of a program.
 * 4. To interrupt the execution of a program.
 * > 4
 * Please, try again.
 * > 2
 * Congratulations, have a nice day!
 * ```
 *
 * ---
 *
 * **Program şu mesajla bitmelidir:**
 *
 * ```
 * Congratulations, have a nice day!
 * ```
 *
 * **Verilen şablonu kullanarak çalışmanızı basitleştirin.** İsterseniz metni değiştirebilirsiniz. Lütfen, programı anlamayı kolaylaştırmak ve daha sonra yeni kod eklemeyi veya düzenlemeyi kolaylaştırmak için fonksiyonlar kullandığımızı unutmayın.
 *
 * ---
 *
 *
 *
 */



import java.util.Scanner

val scanner = Scanner(System.`in`)

fun main() {
    greet("Aid", "2020")
    remindName()
    guessAge()
    count()
    test()
    end()
}

fun greet(assistantName: String, birthYear: String) {
    println("Hello! My name is $assistantName.")
    println("I was created in $birthYear.")
    println("Please, remind me your name.")
}

fun remindName() {
    val name = scanner.nextLine()
    println("What a great name you have, $name!")
}

fun guessAge() {
    println("Let me guess your age.")
    println("Enter remainders of dividing your age by 3, 5 and 7.")
    val rem3 = scanner.nextInt()
    val rem5 = scanner.nextInt()
    val rem7 = scanner.nextInt()
    val age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105
    println("Your age is $age; that's a good time to start programming!")
}

fun count() {
    println("Now I will prove to you that I can count to any number you want.")
    val num = scanner.nextInt()
    for (i in 0..num) {
        print("$i!")
        println()
    }
}

fun test() {
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

/*
//sol2

fun checkTest() {
    var isAnswerWrong: Boolean

    do {
        isAnswerWrong = if (scanner.nextInt() != 2) {
            println("Please. try again.")
            true
        } else false
    } while (isAnswerWrong)
}
 */


fun end() {
    println("Congratulations, have a nice day!")
}




