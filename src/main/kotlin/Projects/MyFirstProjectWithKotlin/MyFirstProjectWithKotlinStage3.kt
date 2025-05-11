package Projects.MyFirstProjectWithKotlin

fun main() {


    val products = mapOf(
        "Bubblegum" to 202,
        "Toffee" to 118,
        "Ice Cream" to 2250,
        "Milk Chocolate" to 1680,
        "Doughnut" to 1075,
        "Pancake" to 80
    )

    println("Earned Amount")


    var totalEarning = 0

    for ((item, earnedAmount) in products){
        println("$item: $$earnedAmount")
        totalEarning += earnedAmount
    }

    println("\nIncome: $$totalEarning")


    println("Staff expenses:")
    val staffExpenses = readLine()!!.toInt()

    println("Other Expenses")
    val otherExpenses = readLine()!!.toInt()



    val netIncome = totalEarning - staffExpenses - otherExpenses
    println("Net income: $$netIncome")
}