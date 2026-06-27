package homeTask1

fun main() {
    val list = listOf<Product>(
        Electronics(50000.0),
        Clothing(6000.0),
        Food(700.0)
    )
    list.forEach { product ->
        product.getFinalPrice()
    }
}