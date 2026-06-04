//Запросите у пользователя 5 чисел, сохраните их в массив и выведите
//сумму всех элементов

fun main() {
    println("Введите 5 чисел. Каждое на новой строке: ")
    val ar: Array<Int> = Array(5) { 0 }

    var sum: Int = 0
    for (i in 0..4) {
        ar[i] = readln().toInt()
        sum += ar[i]
    }
    println(sum)
}