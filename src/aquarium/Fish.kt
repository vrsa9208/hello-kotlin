package aquarium

class Fish(val friendly: Boolean, volumeNeeded: Int) {
    val size: Int

    init {
        println("First init block ")
    }

    constructor(): this(friendly = true, volumeNeeded = 9) {
        println("Running secondary constructor")
    }

    init {
        if(friendly) {
            size = volumeNeeded
        } else {
            size = volumeNeeded * 2
        }
    }
}

fun main(args: Array<String>) {
    val fish = Fish(friendly = true, volumeNeeded = 20)
    println("Is the fish friendly? ${fish.friendly}. It need volume ${fish.size}")
}