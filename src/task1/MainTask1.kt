package task1

fun main() {

    val payList = arrayOf<Payment>(
        CreditCardPayment(102.2, Currency.EURO),
        PayPalPayment(204.3, Currency.DOLLAR)
    )

    payList.forEach {
        it.processPayment()
        println()
    }


}
