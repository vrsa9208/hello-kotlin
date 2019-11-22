package tests

import aquarium.Fish

fun main(args: Array<String>) {
    val intList: MyList<Int> = MyList()
    val fishList: MyList<Fish>
    intList.get(0)
}

class MyList<T> {

    fun get(pos: Int): T {
        TODO("implement")
    }
    fun addItem(item: T) {}
}