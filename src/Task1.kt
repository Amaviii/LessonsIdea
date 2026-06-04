//Напишите программу, которая проверяет, является ли введённое
//пользователем число палиндромом (читается одинаково слева направо и
//справа налево). Используйте цикл для разбиения числа и сравнения цифр.

fun main() {
    val number = readlnOrNull()

    var revNum = ""
    if (number != null && number != "") {
        for ( i in number.length-1 downTo 0 ) {
            revNum += number[i]
            println("$i: $revNum")
        }
        if (number == revNum) {println("Введенное число является палиндромом")}
        else{
            println("Введенное число не является палиндромом")
        }
    } else {
        println("Вы ничего не ввели")
    }
}

