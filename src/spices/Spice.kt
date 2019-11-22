package spices

abstract class Spice(val name: String, val spiciness: String = "mild", color: SpiceColor) : SpiceColor by color {
    abstract fun prepareSpice()
}

class Curry(name: String, spiciness: String,
            color: SpiceColor = YellowSpiceColor) : Spice(name, spiciness, color), Grinder {
    override fun grind() {
    }

    override fun prepareSpice() {
        grind()
    }
}

interface Grinder {
    fun grind()
}

interface SpiceColor {
    val color: String
}

object YellowSpiceColor : SpiceColor {
    override val color = "Yellow"
}

fun main(args: Array<String>) {
    val spice: Spice = Curry(name = "Secret Curry", spiciness = "Mild")
    println("Name: ${spice.name}\nSpiciness: ${spice.spiciness}\nColor: ${spice.color}")

}