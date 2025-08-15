fun main() {

    val southernCross = mutableListOf("Acrux", "Gacrux", "Imai", "Mimosa")
    val stars = mutableListOf("Ginan", "Mu Crucis")
    val names = mutableListOf("Jack", "John", "Katie")
    val food = mutableListOf("Bread", "Cheese", "Meat")
    val fruits = mutableListOf("Apple", "Banana", "Grape", "Mango")

    southernCross.removeAt(0)
    southernCross.remove("Mimosa")

    stars.add("New star")
    stars.add(0, "First star")

    names.clear()

    food.addAll(fruits)

    println(names)                // []
    println(southernCross)        // [Gacrux, Imai]
    println(stars)                // [First star, Ginan, Mu Crucis, New star]
    println(food)                 // [Bread, Cheese, Meat, Apple, Banana, Grape, Mango]


}