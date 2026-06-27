package task2

class Library(
    val library: MutableList<Book> = mutableListOf(),
) {
    fun add(book: Book) {
        library.add(book)
    }

    fun showAll() {
        library.forEach { it.displayInfo() }
    }
}
