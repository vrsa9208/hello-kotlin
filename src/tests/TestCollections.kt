package tests

fun main(args: Array<String>) {
    // orderLists()
    sumLists()
}

fun sumLists() {
    val list = listOf(1, 2, 3, 4, 5, 6)

    println("sum result: ${list.sum()}")
    println("sublist result: ${list.subList(3, list.size)}")
    println("contains result: ${list.contains(4)}")

    val pairList = list.map(::makePowPair)

    println("sum pairList first result: ${pairList.sumBy { it.first }}")
    println("sum pairList second result: ${pairList.sumBy { it.second }}")
}

fun orderLists() {
    val testList = listOf(11,12,13,14,15,16,17,18,19,20)

    println("list.reversed(): ${testList.reversed()}")
    println("reverseList(list): ${reverseList(testList)}")
}

fun reverseList(list: List<Int>): List<Int> {
    val result = mutableListOf<Int>()
    for(i in list.size - 1 downTo 0){
        result.add(list.get(i))
    }

    return result
}

fun makePowPair(i: Int) = i to (i * i)