package tests

fun main(args: Array<String>) {
    val decorations = listOf("rock", "pagoda", "plastic plant", "alligator", "flowerpot")

    println("Before eager filter instruction")
    val eagerList = decorations.filter {
        println("Eager filter is called for $it")
        it[0] == 'p'
    }
    println("After eager filter instruction")
    println(eagerList)

    println("Before lazy filter instruction")
    val lazyList = decorations.asSequence().filter {
        println("Eager filter is called for $it")
        it[0] == 'p'
    }
    println("After lazy filter instruction")
    println(lazyList.toList())

}
