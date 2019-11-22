package tests

import java.util.*

fun main(args: Array<String>) {
    val waterFilter: (Int) -> Int = { dirty -> dirty / 2}
    fun feedFish(dirty: Int): Int = dirty + 10

    // Higher order function
    fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
        return operation(dirty)
    }

    println(updateDirty(10, waterFilter))
    println(updateDirty(10, ::feedFish))
    println(updateDirty(10) {dirty ->
        dirty * 5
    })

    val rollDice: (Int) -> Int = { sides ->
        if(sides == 0) 0 else Random().nextInt(12) + 1
    }

    fun rollDice2(sides: Int): Int {
        return if(sides == 0) 0 else Random().nextInt(12) + 1
    }

    println(rollDice(12))
    println(rollDice(12))
    println(rollDice(12))
    println(rollDice(0))

    println(rollDice2(12))
    println(rollDice2(12))
    println(rollDice2(12))
    println(rollDice2(0))
}