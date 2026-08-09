package task1

/*
Задача 1: Подсчет количества слов в тексте

Подсчитать количество вхождений каждого слова в тексте.
 */

fun main() {
    val str = "word word word again again"
    val strArr = str.split(" ")

    val strMap: Map<String, Int> = strArr.associateBy(keySelector = { it }, { str -> strArr.count { str == it } })
    println(strMap)
}

