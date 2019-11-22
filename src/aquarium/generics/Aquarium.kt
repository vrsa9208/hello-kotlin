package aquarium.generics

fun main(args: Array<String>) {
    genericExample()
}

open class WaterSupply(var needsProcessed: Boolean)

class TapWater : WaterSupply(true) {
    fun addChemicalCleaners() {
        needsProcessed = false
    }
}

class FishStoreWater: WaterSupply(false)

class LakeWater: WaterSupply(true) {
    fun filter() {
        needsProcessed = false
    }
}

class Aquarium<T: WaterSupply>(val waterSupply: T) {

    fun addWater() {
        check(!waterSupply.needsProcessed) { "water supply needs processed" }

        println("adding water from $waterSupply")
    }
}

fun genericExample() {

    val aquarium = Aquarium(TapWater())
    aquarium.waterSupply.addChemicalCleaners()
    aquarium.addWater()

    val aquarium2 = Aquarium(FishStoreWater())
    aquarium2.addWater()
}
