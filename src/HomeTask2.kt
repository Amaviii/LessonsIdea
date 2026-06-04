//Напишите программу, которая принимает массив целых чисел
//и подсчитывает, сколько четных и сколько нечетных чисел в
//нем содержится

fun main() {
    val ar: Array<Int> = arrayOf(3, 2, 3, 4, 5, 6, 7, 8, 9, 2, 2)

    var oddNums = 0
    var evenNums = 0

    for (i in ar) {
        when {
            i % 2 == 0 -> oddNums++
            i % 2 == 1 -> evenNums++
        }
    }

    println("Четных чисел: $oddNums")
    println("Нечетных чисел: $evenNums")
}