package tests

fun main(args: Array<String>) {

    fun String.hasSpaces(): Boolean {
        return if(this.find { it == ' '} != null) true else false
    }

    println("Hello World".hasSpaces())
    println("Orlando".hasSpaces())

    staticExample()
}

open class AquariumPlant(val color: String, private val size: Int)
class GreenLeafyPlant(size: Int): AquariumPlant("Green", size)

fun AquariumPlant.isRed() = color == "Red"

fun AquariumPlant.print() = println("AquariumPlant")
fun GreenLeafyPlant.print() = println("GreenLeafyPlant")

fun staticExample() {
    val plant = GreenLeafyPlant(size = 50)
    plant.print()

    val aquariumPlant:AquariumPlant = plant
    aquariumPlant.print()
}


// Error at compile because size is a private member of the class
//fun AquariumPlant.isBig() = size > 50