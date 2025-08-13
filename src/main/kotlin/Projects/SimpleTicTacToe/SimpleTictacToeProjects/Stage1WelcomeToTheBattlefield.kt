package Projects.SimpleTicTacToe.SimpleTictacToeProjects

import kotlin.random.Random

/**
 * Welcome to the battlefield!
 *  Report a typo
 * Description
 * Tic-tac-toe is a game known all over the world. Each country may have its own version of the name, sometimes the rules are different, but the essence of the game remains the same. Below are the main rules that may be familiar to you since childhood.
 *
 * Tic-tac-toe is played by two players on a 3x3 grid. One of the players is 'X', and the other player is 'O'. X plays first, then O takes the next turn, and so on.
 *
 * The players write 'X' and 'O' on a 3x3 field.
 *
 * The first player that puts 3 X's or 3 O's in a straight line (including diagonals) wins the game.
 *
 * Objectives
 * Your first task in this project is to print the game grid in the console output. Use what you’ve learned about the print() function to print three lines, each containing three characters (X’s and O’s) to represent a game of tic-tac-toe where all fields of the grid have been filled in. Mind the case of the characters.
 *
 * Example
 * The example below shows how your output might look.
 *
 * X O X
 * O X O
 * X X O
 *
 * Write a program
 *------------------------------------------------------------------------------------
 *
 * **Savaşa hoş geldiniz!**
 *
 * **Açıklama**
 * Tic-tac-toe (X-O) dünyaca bilinen bir oyundur. Her ülkenin ismi farklı olabilir, bazen kurallar değişir, ancak oyunun özü aynı kalır. Aşağıda, çocukluktan beri aşina olabileceğiniz temel kurallar yer almaktadır.
 *
 * Tic-tac-toe, 3x3’lük bir ızgara üzerinde iki oyuncu tarafından oynanır. Oyunculardan biri ‘X’, diğeri ‘O’dur. X ilk hamleyi yapar, ardından O hamle yapar ve bu şekilde sıra dönüşümlü devam eder.
 *
 * Oyuncular 3x3’lük alana ‘X’ ve ‘O’ yazar.
 *
 * Aynı düz çizgi üzerinde (köşegenler dahil) 3 tane X veya 3 tane O yerleştiren ilk oyuncu oyunu kazanır.
 *
 * **Hedefler**
 * Bu projedeki ilk görevin, oyun ızgarasını konsol çıktısına yazdırmaktır. `print()` fonksiyonu hakkında öğrendiklerini kullanarak, 3 satır yazdır: Her satırda, tüm hücreleri doldurulmuş bir tic-tac-toe oyununu temsil edecek şekilde üçer karakter (X ve O) bulunsun. Karakterlerin büyük/küçük harf kullanımına dikkat et.
 *
 * **Örnek**
 * Aşağıdaki örnek, çıktının nasıl görünebileceğine dair bir örnek gösterir.
 *
 * ```
 * X O X
 * O X O
 * X X O
 * ```
 *
 * **Bir program yazın**
 *

 */


fun main1() {
    println("XOX")
    println("OXO")
    println("XXO")
}

fun main2() {
    repeat(3) {
        println(Array(3) { listOf('X', 'O').random() }.joinToString(" "))
    }
}





fun main3() {
    battleField()
}

fun battleField() {
    val field = List(3) {
        Array(3) {
            if (Random.nextBoolean()) "X" else "O"
        }
    }
    for (i in field.indices)
        println(field[i].joinToString(" "))
}





fun main4() {
    val list = mutableListOf(
        mutableListOf("X", "O", "X"),
        mutableListOf("O", "X", "O"),
        mutableListOf("X", "X", "O")
    )
    for (i in 0 until list.size) {
        for (j in 0 until list.size) {
            print("${list[i][j]} ")
        }
        print("\n")
    }
}


fun main5() {
    println("""
        X O X
        O X O
        X X O 
    """.trimIndent()
    )
}