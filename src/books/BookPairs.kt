package books

data class SimpleBook(val title: String, val author: String, val year: Int)

fun getBookPair(book: SimpleBook): Pair<String, String> {
    return book.title to book.author
}

fun getBookTriple(book: SimpleBook): Triple<String, String, Int> {
    return Triple(book.title, book.author, book.year)
}

fun main(args: Array<String>) {
    val book = SimpleBook("Into the wild", "Jon Krakauer", 1996)
    val (title, author, year) = getBookTriple(book)

    println("Here is your book \"$title\" written by $author in $year")
}