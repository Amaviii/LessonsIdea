//Напишите программу, которая находит второй по величине элемент
//в массиве.

fun main() {
    val ar: Array<Int> = arrayOf(2, 5, 1, 7, 9, 3)
    var max1 = ar[0]
    var max2 = 0

    for (i in 1..<ar.size) {
        if (max1 < ar[i]) {
            max2 = max1
            max1 = ar[i]
        }
        if (ar[i] != max1 && max2 < ar[i]) {
            max2 = ar[i]
        }
    }
    println("Второй максимум: $max2")
}