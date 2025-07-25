package Projects.Zookeeper.ZookeeperProjects

/**
 *
 * Sustainable care <3
 *  Report a typo
 * Description
 * Now it's time to make our project user-friendly. In this final stage, you'll make your software ready for the zoo staff to use. Your program should understand the habitat numbers, show the animals, and be able to work continuously without having to be restarted.
 *
 * Objectives
 * Your tasks at this point:
 *
 * Your program should repeat the behavior from the previous stage, but now in a loop.
 *
 * Do not forget to include an exit opportunity: inputting exit should end the program.
 *
 * When the program is done running, it should print: See you later!
 *
 * Examples
 * The greater-than symbol followed by a space (> ) represents the user input. Note that it's not part of the input.
 *
 * The final version of the program should run like this:
 *
 * Example 1
 *
 * Please enter the number of the habitat you would like to view: > 3
 *
 * Switching on the camera in the goose habitat...
 *
 *                                     _
 *                                 ,-"" "".
 *                               ,'  ____  `.
 *                             ,'  ,'    `.  `._
 *    (`.         _..--.._   ,'  ,'        \    \
 *   (`-.\    .-""        ""'   /          (  d _b
 *  (`._  `-"" ,._             (            `-(   \
 *  <_  `     (  <`<            \              `-._\
 *   <`-       (__< <           :
 *    (__        (_<_<          ;
 *     `------------------------------------------
 * The goose is staring intently at you... Maybe it's time to change the channel?
 * Please enter the number of the habitat you would like to view: > 1
 *
 * Switching on the camera in the lion habitat...
 *                                                ,w.
 *                                              ,YWMMw  ,M  ,
 *                         _.---.._   __..---._.'MMMMMw,wMWmW,
 *                    _.-""        '''           YP"WMMMMMMMMMb,
 *                 .-' __.'                   .'     MMMMW^WMMMM;
 *     _,        .'.-'"; `,       /`     .--""      :MMM[==MWMW^;
 *  ,mM^"     ,-'.'   /   ;      ;      /   ,       MMMMb_wMW"  @\
 * ,MM:.    .'.-'   .'     ;     `\    ;     `,     MMMMMMMW `"=./`-,
 * WMMm__,-'.'     /      _.\      F'''-+,,   ;_,_.dMMMMMMMM[,_ / `=_}
 * "^MP__.-'    ,-' _.--""   `-,   ;       \  ; ;MMMMMMMMMMW^``; __|
 *            /   .'            ; ;         )  )`{  \ `"^W^`,   \  :
 *           /  .'             /  (       .'  /     Ww._     `.  `"
 *          /  Y,              `,  `-,=,_{   ;      MMMP`""-,  `-._.-,
 *         (--, )                `,_ / `) \/"")      ^"      `-, -;"\:
 * The lion is roaring!
 * Please enter the number of the habitat you would like to view: > exit
 * See you later!
 *
 *
 *
 */


import java.io.File
import java.util.*

const val camel4 = """Switching on the camera in the camel habitat...
 ___.-''''-.
/___  @    |
',,,,.     |         _.'''''''._
     '     |        /           \
     |     \    _.-'             \
     |      '.-'                  '-.
     |                               ',
     |                                '',
      ',,-,                           ':;
           ',,| ;,,                 ,' ;;
              ! ; !'',,,',',,,,'!  ;   ;:
             : ;  ! !       ! ! ;  ;   :;
             ; ;   ! !      ! !  ; ;   ;,
            ; ;    ! !     ! !   ; ;
            ; ;    ! !    ! !     ; ;
           ;,,      !,!   !,!     ;,;
           /_I      L_I   L_I     /_I
Look at that! Our little camel is sunbathing!"""

const val lion4 = """Switching on the camera in the lion habitat...
                                               ,w.
                                             ,YWMMw  ,M  ,
                        _.---.._   __..---._.'MMMMMw,wMWmW,
                   _.-""        '''           YP"WMMMMMMMMMb,
                .-' __.'                   .'     MMMMW^WMMMM;
    _,        .'.-'"; `,       /`     .--""      :MMM[==MWMW^;
 ,mM^"     ,-'.'   /   ;      ;      /   ,       MMMMb_wMW"  @\
,MM:.    .'.-'   .'     ;     `\    ;     `,     MMMMMMMW `"=./`-,
WMMm__,-'.'     /      _.\      F'''-+,,   ;_,_.dMMMMMMMM[,_ / `=_}
"^MP__.-'    ,-' _.--""   `-,   ;       \  ; ;MMMMMMMMMMW^``; __|
           /   .'            ; ;         )  )`{  \ `"^W^`,   \  :
          /  .'             /  (       .'  /     Ww._     `.  `"
         /  Y,              `,  `-,=,_{   ;      MMMP`""-,  `-._.-,
        (--, )                `,_ / `) \/"")      ^"      `-, -;"\:
The lion is roaring!"""

const val deer4 = """Switching on the camera in the deer habitat...
   /|       |\
`__\\       //__'
   ||      ||
 \__`\     |'__/
   `_\\   //_'
   _.,:---;,._
   \_:     :_/
     |@. .@|
     |     |
     ,\.-./ \
     ;;`-'   `---__________-----.-.
     ;;;                         \_\
     ';;;                         |
      ;    |                      ;
       \   \     \        |      /
        \_, \    /        \     |\
          |';|  |,,,,,,,,/ \    \ \_
          |  |  |           \   /   |
          \  \  |           |  / \  |
           | || |           | |   | |
           | || |           | |   | |
           | || |           | |   | |
           |_||_|           |_|   |_|
          /_//_/           /_/   /_/
Our 'Bambi' looks hungry. Let's go to feed it!"""

const val goose4 = """Switching on the camera in the goose habitat...

                                    _
                                ,-"" "".
                              ,'  ____  `.
                            ,'  ,'    `.  `._
   (`.         _..--.._   ,'  ,'        \    \
  (`-.\    .-""        ""'   /          (  d _b
 (`._  `-"" ,._             (            `-(   \
 <_  `     (  <`<            \              `-._\
  <`-       (__< <           :
   (__        (_<_<          ;
    `------------------------------------------
The goose is staring intently at you... Maybe it's time to change the channel?"""

const val bat4 = """Switching on the camera in the bat habitat...
_________________               _________________
 ~-.              \  |\___/|  /              .-~
     ~-.           \ / o o \ /           .-~
        >           \\  W  //           <
       /             /~---~\             \
      /_            |       |            _\
         ~-.        |       |        .-~
            ;        \     /        i
           /___      /\   /\      ___\
                ~-. /  \_/  \ .-~
                   V         V
This bat looks like it's doing fine."""

const val rabbit4 = """Switching on the camera in the rabbit habitat...
         ,
        /|      __
       / |   ,-~ /
      Y :|  //  /
      | jj /( .^
      >-"~"-v"
     /       Y
    jo  o    |
   ( ~T~     j
    >._-' _./
   /   "~"  |
  Y     _,  |
 /| ;-"~ _  l
/ l/ ,-"~    \
\//\/      .- \
 Y        /    Y
 l       I     !
 ]\      _\    /"\
(" ~----( ~   Y.  )
It looks like we will soon have more rabbits!"""

const val INPUT: String = "exit"
val animals = arrayOf(camel4, lion4, deer4, goose4, bat4, rabbit4)



fun main() {
    // prompt message for the user
    val prompt = "Please enter the number of the habitat you would like to view: "

    do {
        val userInput = readLine()!!

        if (userInput != INPUT){
            println(animals[userInput.toInt()])
            println(prompt)
        }

    }while (userInput != INPUT)
    println("See you later!")



}


/**
 * SOL2
*val animals = arrayOf(camel, lion, deer, goose, bat, rabbit)
 *
 * fun main() {
 *     do {
 *         println("Please enter the number of the habitat you would like to view:")
 *         val answer = readln()
 *         if (answer != "exit") {
 *             println("\n${animals[answer.toInt()]}")
 *         } else println("See you later!")
 *     } while (answer != "exit")
 * }




 *sol3
 *val animals = arrayOf(camel, lion, deer, goose, bat, rabbit)
 *
 * fun main() {
 *     do {
 *         print("Please enter the number of the habitat you would like to view: > ")
 *         val inputNumberOfHabitat = readln()
 *         when (inputNumberOfHabitat) {
 *             "0" -> println(animals[0])
 *             "1" -> println(animals[1])
 *             "2" -> println(animals[2])
 *             "3" -> println(animals[3])
 *             "4" -> println(animals[4])
 *             "5" -> println(animals[5])
 *             "exit" -> println("See you later!")
 *             else -> println("Habitat doesn't exist")
 *         }
 *     }while (inputNumberOfHabitat != "exit")
 * }
 *
 *
 *
 *
 * sol4
 * fun main() {
 *     while (true) {
 *         print("Please enter the number of the habitat you would like to view: ")
 *             .runCatching { readln().toInt() }
 *             .onSuccess { println(arrayOf(camel, lion, deer, goose, bat, rabbit)[it]) }
 *             .onFailure { print("See you later!").also { return } }
 *     }
 * }

 */