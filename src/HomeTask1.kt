//Напишите программу, которая находит и выводит максимальное и
//минимальное значение в массиве целых чисел. Также вычислите индекс
//этих элементов

fun main() {
    val ar: Array<Int> = arrayOf(3, 2, 3, 4, 5, 6, 7, 8, 9, 2)
    var maxNum = ar[0]
    var minNum = ar[0]
    var maxIndex = 0
    var minIndex = 0

    for (i in 1..<ar.size) {
        when{
            ar[i] > maxNum -> { maxNum = ar[i]
                maxIndex = i
            }

            ar[i] < minNum -> { minNum = ar[i]
                minIndex = i
            }
        }
    }

    println("Максимальное число: $maxNum с индексом: $maxIndex")
    println("Минимальное число: $minNum с индексом: $minIndex")
}