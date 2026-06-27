package task1

abstract class Payment {
    abstract var amount: Double
    abstract val currency: Currency

    abstract fun processPayment()
}

class CreditCardPayment(override var amount: Double, override val currency: Currency) : Payment() {

    override fun processPayment() {
        println("Task1.CreditCardPayment processPayment")
        amount -= 20
        println("Осталось на балансе $amount $currency")
    }
}

class PayPalPayment(override var amount: Double, override val currency: Currency) : Payment() {

    override fun processPayment() {
        println("Task1.PayPalPayment processPayment")
        amount -= 24
        println("Осталось на балансе $amount $currency")
    }
}