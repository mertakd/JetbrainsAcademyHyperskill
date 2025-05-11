package Projects.MyFirstProjectWithKotlin

fun main() {

    val products = mapOf(
        "Bubblegum" to 2.0,
        "Toffee" to 0.2,
        "Ice Cream" to 5.0,
        "Milk Chocolate" to 4.0,
        "Doughnut" to 2.5,
        "Pancake" to 3.2
    )

    println("Prices: ")


    for ((item, price) in products){
        println("$item: $$price")
    }
}