package tests

import java.util.*

fun main(args: Array<String>) {
    val birthday = getBirthday()
    println("Your fortune is: ${getFortuneCookie(birthday)}")

    repeat(5) {
        println("Your random fortune is: ${getFortuneCookie(Random().nextInt(31))}")
    }
}

fun getFortuneCookie(birthday: Int): String {
    val messages = arrayOf("You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune.")

    return when(birthday) {
        in 1..7 -> "Special fortune"
        28, 31 -> "super special fortune"
        else -> messages[birthday.rem(messages.size)]
    }
}

fun getBirthday(): Int {
    print("Enter your birthday: ")
    return readLine()?.toIntOrNull() ?: 1
}
