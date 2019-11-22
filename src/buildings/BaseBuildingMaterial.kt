package buildings

open class BaseBuildingMaterial(val numberNeeded: Int = 1)

class Wood: BaseBuildingMaterial(4)

class Brick: BaseBuildingMaterial(8)

class Building<T: BaseBuildingMaterial>(val buildingMaterial: T) {
    val baseMaterialsNeeded = 100
    val actualMaterialsNeeded: Int
        get() = (baseMaterialsNeeded * buildingMaterial.numberNeeded)

    fun build() {
        println("The building requires ${actualMaterialsNeeded} units of ${buildingMaterial::class.simpleName}")
    }
}

fun main(args: Array<String>) {
    val building = Building(Wood())
    val building2: Building<BaseBuildingMaterial> = Building(Brick())

    building.build()
    building2.build()
}