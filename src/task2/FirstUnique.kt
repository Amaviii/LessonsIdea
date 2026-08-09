package task2

/*
Задача 2: Найти первый неповторяющийся символ в строке

Найти первый уникальный символ.
 */


fun main() {
    val line: String = "лваоыджлаоыжлояараыйапра"
    for (l in line) {
        if (line.count { it == l } == 1) {
            println(l)
            return
        }
    }
}