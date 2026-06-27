package homeTask1

class Electronics(override var price: Double) : Product {

    override fun getFinalPrice() {
        price *= 0.9
        println(price)
    }
}