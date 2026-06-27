package homeTask1

class Food(override var price: Double) : Product {
    override fun getFinalPrice() {
        println(price)
    }
}