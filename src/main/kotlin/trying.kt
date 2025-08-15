fun solution(products: List<String>, product: String) {

    val positions = mutableListOf<Int>()

    for (i in products.indices) {
        if (products[i] == product) {
            positions.add(i)
        }
    }
    println(positions.joinToString(" "))
}


fun main() {

    //cevaba yazma
    val products = listOf("Mustard", "Cheese", "Eggs", "Cola", "Eggs")
    val productToFind = "Eggs"
    solution(products, productToFind)
}
