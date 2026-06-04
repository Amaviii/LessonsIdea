//Напишите программу, которая принимает массив целых чисел и изменяет
//его порядок на обратный. Выведите результат после изменения порядка.

fun main() {
    val ar: Array<Int> = arrayOf(1, 2, 3, 4, 5, 4, 6, 7, 8, 9)
    val newAr = Array(ar.size) { 0 }

    for (i in ar[ar.size - 1] downTo 0) {
        newAr[ar.size - i - 1] = ar[i]
    }
    newAr.forEach { println(it) }
}