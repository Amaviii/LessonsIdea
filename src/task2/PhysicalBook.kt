package task2

class PhysicalBook(
    override val title: String,
    override val author: String,
    override val year: Int,
    val pages: Int,
) : Book() {
    override fun displayInfo() {
        println("Название: $title, Автор $author, год издания: $year, кол-во страниц: $pages")
    }
}