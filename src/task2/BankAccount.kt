package task2

class BankAccount(
    private val accountNumber: Int,
    private var balance: Double
) {
    fun getBalance() = println(balance)

    fun deposit(amount: Double) {
        balance += amount
    }

    fun withdraw(amount: Double) {
        if (balance >= amount) {
            balance -= amount
        }
        else {
            println("На балансе $balance - Средств недостаточно")
        }
    }

}