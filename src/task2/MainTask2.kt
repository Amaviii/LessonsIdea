package task2

fun main() {
    val account = BankAccount(32131, 231.32)


    account.withdraw(1000.0)
    account.deposit(1000.0)
    account.getBalance()
    account.withdraw(1000.0)
    account.getBalance()

}