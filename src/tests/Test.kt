package tests

import java.util.*

fun main(args: Array<String>) {
    dayOfWeek()
}

fun dayOfWeek() {
    val dayInt = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
    var dayStr: String = ""

    when(dayInt) {
        1 -> dayStr = "Sunday"
        2 -> dayStr = "Monday"
        3 -> dayStr = "Tuesday"
        4 -> dayStr = "Wednesday"
        5 -> dayStr = "Thursday"
        6 -> dayStr = "Friday"
        else -> dayStr = "Saturday"
    }
    println("What day is it today? $dayStr")

}