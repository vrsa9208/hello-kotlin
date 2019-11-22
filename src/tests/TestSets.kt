package tests

fun main(args: Array<String>) {
    val allBooks = setOf("Hamlet", "Macbeth", "Macbeth")
    println(allBooks)

    val library = mapOf("Hamlet" to "Shakespeare", "Lolita" to "Vladimir Nabokov")
    println(library)

    println(library.any() { it.key == "Hamlet" })

    val moreBooks = mutableMapOf<String,  String>()
    moreBooks.put("To kill a mocking bird", "Harper Lee")
    moreBooks.getOrPut("To kill a mocking bird") {
        "Other author"
    }
    moreBooks.getOrPut("It") {
        "Stephen King"
    }
    println(moreBooks)
}