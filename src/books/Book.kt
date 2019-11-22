package books

open class Book(val title: String, val author: String) {

    private var currentPage: Int = 1

    open fun readPage() {
        currentPage++
    }
}

class Ebook(title: String, author: String, var format: String = "text") : Book(title, author) {

    var wordsRead: Int = 0

    override fun readPage() {
        wordsRead = wordsRead + 250
    }

}


fun main(args: Array<String>) {
    var ebook = Ebook("Into the wild", "Jon Krakauer")
    println("Title: ${ebook.title}\nAuthor: ${ebook.author}\nWords Read: ${ebook.wordsRead}\n")
    ebook.readPage()
    println("Title: ${ebook.title}\nAuthor: ${ebook.author}\nWords Read: ${ebook.wordsRead}\n")
}