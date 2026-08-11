package task3

/*
Задача 3: Проверка анаграмм
Определить, являются ли две строки анаграммами
 */

fun main() {
    val word1 = "anar"
    val word2 = "rana"

    if (word1.length != word2.length) {
        println("Строки не являются анаграммами")
        return
    }

    word1.lowercase()
    word2.lowercase()
}