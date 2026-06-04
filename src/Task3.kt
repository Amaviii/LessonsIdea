//Запросите у пользователя матрицу 2x3 и найдите сумму всех элементов

fun main() {
    println("Введите 6 чисел. Каждый на новой строке: ")
    val ar: Array<Array<Int>> = arrayOf(
        arrayOf(0, 0, 0),
        arrayOf(0, 0, 0),
    )
    var sum: Int = 0

    for (i in 0..1) {
        for (j in 0..2) {
            ar[i][j] = readln().toInt()
            sum += ar[i][j]
        }
    }
    println(sum)
}