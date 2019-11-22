package spices

class SimpleSpice {
    var name: String = "curry"
    var spiciness: String = "mild"
    val heat: Int
        get() = when(spiciness) {
            "mild" -> 5
            else -> 0
        }
}

fun main(args: Array<String>) {
    val spice = SimpleSpice()
    println("Name: ${spice.name}\n" +
            "Heat: ${spice.heat}")
}