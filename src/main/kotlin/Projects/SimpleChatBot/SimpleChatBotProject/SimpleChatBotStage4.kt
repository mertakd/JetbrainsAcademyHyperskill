package Projects.SimpleChatBot.SimpleChatBotProject

/**
 *
 * Learning numbers
 *  Report a typo
 * Description
 * Now you will teach your bot to count. It's going to become an expert in numbers!
 *
 * Objective
 * In this stage, you will program the bot to count from 0 to any positive number users enter.
 *
 * Example
 * The greater-than symbol followed by a space (> ) represents the user input. Note that it's not part of the input.
 *
 * Example 1: a dialogue with the new version of the bot
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
 * Your age is 22; that's a good time to start programming!
 * Now I will prove to you that I can count to any number you want.
 * > 5
 * 0!
 * 1!
 * 2!
 * 3!
 * 4!
 * 5!
 * Completed, have a nice day!
 *
 * Note: each number starts with a new line, and after a number, the bot should print the exclamation mark.
 *
 * Use the provided template to simplify your work. You can change the text if you want, but be especially careful when counting numbers.
 *
 * Write a program

 */


/**
 * ---
 *
 * ## **Türkçe Çeviri**
 *
 * **Açıklama**
 * Şimdi botunuza saymayı öğreteceksiniz. O, sayı konusunda uzman olacak!
 *
 * **Amaç**
 * Bu aşamada, kullanıcı tarafından girilen herhangi bir pozitif sayıya kadar **0’dan başlayarak** sayacak bir program yazacaksınız.
 *
 * **Örnek**
 * Büyük “>” işareti ve ardından gelen boşluk (`> `) kullanıcı girdisini temsil eder. Bu sembol girişin bir parçası değildir.
 *
 * **Örnek 1: Bot ile yeni versiyon bir diyalog**
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
 * Your age is 22; that's a good time to start programming!
 * Now I will prove to you that I can count to any number you want.
 * > 5
 * 0!
 * 1!
 * 2!
 * 3!
 * 4!
 * 5!
 * Completed, have a nice day!
 * ```
 *
 * Not: Her sayı **yeni satırdan** başlar ve sayının sonunda ünlem işareti olur.
 *
 * Verilen şablonu kullanarak çalışmanı basitleştirebilirsin. Metni değiştirebilirsin, fakat sayma kısmında özellikle dikkatli ol.
 *
 * ---
 *
 * ## **Ne Anlatmak İstiyor?**
 *
 * * Program, önce botun adını, oluşturulma yılını, kullanıcıdan adını almayı, yaşı tahmin etmeyi içeren önceki adımları yapıyor.
 * * Ardından yeni eklenen özellik: **kullanıcıdan bir sayı alıp 0’dan başlayarak o sayıya kadar** (dahil) saymak.
 * * Her sayının sonunda **"!"** olacak ve her sayı **yeni satıra** yazılacak.
 * * En sonunda `"Completed, have a nice day!"` yazacak.
 *
 * ---
 *
 * Bu aslında **döngü kullanma** alıştırması.
 * `for (i in 0..n)` şeklinde bir döngü ile yapılabilir.
 *
 *
 *
 */






import java.util.Scanner


fun main() {
    val scanner = Scanner(System.`in`)

    println("Hello! My name is Aid.")
    println("I was created in 2020.")
    println("Please, remind me your name.")

    val name = scanner.nextLine()

    println("What a great name you have, " + name + "!")
    println("Let me guess your age.")
    println("Enter remainders of dividing your age by 3, 5 and 7.")

    val rem3 = scanner.nextInt()
    val rem5 = scanner.nextInt()
    val rem7 = scanner.nextInt()
    val age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105

    println("Your age is " + age + "; that's a good time to start programming!")
    println("Now I will prove to you that I can count to any number you want.")


    //Stage 4
    // read a number and count to it here
    val num = scanner.nextInt()

    for(i in 0..num){
        println("$i!")
    }

    println("Completed, have a nice day!")


    /*
    * sol2
    *
    val limit = scanner.nextInt()
    (0..limit).forEach { println("$it!") }

    println("Completed, have a nice day!")
    *
     */
}
