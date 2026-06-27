package task2

fun main() {
    val book1 = PhysicalBook(title = "affert", author = "civibus", year = 1990, pages = 3452)
    val book2 = EBook(title = "nostrum", author = "quaestio", year = 2016, format = Formats.TXT)
    val book3 = PhysicalBook(title = "prompta", author = "praesent", year = 1984, pages = 8657)
    val book4 = EBook(title = "fames", author = "nullam", year = 1986, format = Formats.PDF)

    val list = Library()
    list.add(book1)
    list.add(book2)

    list.showAll()
    println()
    list.add(book3)
    list.add(book4)

    list.showAll()

    println(book2.author)
}