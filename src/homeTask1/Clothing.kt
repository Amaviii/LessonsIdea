package homeTask1

class Clothing(override var price: Double) : Product {

    override fun getFinalPrice() {
        price *= 0.85
        println(price)
    }
}