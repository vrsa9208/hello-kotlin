package tests

fun main(args: Array<String>) {
    val hour: Int = args[0].split(":")[0].toInt()

    if(hour < 12) println("Good morning, Kotlin")
    else println("Good night, Kotlin")
}