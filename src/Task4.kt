    //Создайте куб размером 2x2x2, заполните числами от 1 до 8 и выведите
    //все элементы.

fun main() {
    val ar: Array<Array<Array<Int>>> = arrayOf(
        arrayOf(
            arrayOf(1, 2), arrayOf(3,4)
        ),
        arrayOf(
            arrayOf(5, 6), arrayOf(7,8)
        ),
    )

    for (i in 0..1) {
        for (j in 0..1) {
            for (k in 0..1) {
                print(ar[i][j][k])
            }
            println()
        }
        println()
    }
}