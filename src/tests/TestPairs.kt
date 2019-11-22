package tests

fun main(args: Array<String>) {
    var pair1 = "Hello" to "World"
    println("${pair1.first} ${pair1.second}")

    // Destructuring
    var (first, second) = pair1
    println("$first $second")
}