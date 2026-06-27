package task2

class EBook(
    override val title: String,
    override val author: String,
    override val year: Int,
    val format: Formats,
) : Book() {
    override fun displayInfo() {
        println("Название: $title, Автор $author, год издания: $year, формат: $format")
    }
}