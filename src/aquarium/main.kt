package aquarium

fun main(args: Array<String>) {
    buildAquarium()
    makeFish()
}

fun buildAquarium() {
    var aquarium = Aquarium()

    println("Length: ${aquarium.length}\n" +
            "Width: ${aquarium.width}\n" +
            "Height: ${aquarium.height}")

    aquarium.height = 80

    println("New height: ${aquarium.height}")
    println("Volume: ${aquarium.volume}")

    var smallAquarium = Aquarium(length = 20, width = 15, height = 30)
    println("Small aquarium volume: ${smallAquarium.volume}")

    var aquarium2 = Aquarium(numberOfFish = 2)
    println("Aquarium 2 volume: ${aquarium2.volume}")

}

fun feedFish(fish: FishAction) {
    fish.eat()
}

fun makeFish() {
    val shark = Shark()
    val pleco = Plecostomus()

    println("Shark: ${shark.color}\nPlecostomus: ${pleco.color}")
    feedFish(shark)
    feedFish(pleco)
}

