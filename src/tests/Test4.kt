package tests

fun main(args: Array<String>) {
    println(canAddFish(10.0, listOf(3, 3, 3)))
    println(canAddFish(8.0, listOf(2, 2, 2), hasDecorations = false))
    println(canAddFish(9.0, listOf(1, 1, 3), 3))
    println(canAddFish(10.0, listOf(), 7, true))
}

fun canAddFish(tankSize: Double, currentFish: List<Int>, fishSize: Int = 2, hasDecorations: Boolean = true): Boolean {
    val totalTankSize: Double = if(hasDecorations) tankSize * 0.8 else tankSize
    val totalfishSize: Int = currentFish.sum()

    return (totalfishSize + fishSize) <= totalTankSize
}
