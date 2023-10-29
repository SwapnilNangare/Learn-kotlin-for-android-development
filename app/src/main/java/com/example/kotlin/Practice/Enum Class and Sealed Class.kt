package com.example.kotlin.Practice

fun main() {
    println("Enum Class and Sealed Class ")

    val day = Day.SUNDAY
//    println(day)
//    println(day.number)
//
//    for (i in Day.values()) {
//        println(i)
//    }

    day.printFormattedDays()


}

enum class Day(val number: Int) {
    SUNDAY(1),
    MONDAY(2),
    TUESDAY(3),
    WEDNESDAY(4),
    THURSDAY(5),
    FRIDAY(6),
    SATURDAY(7);


    fun printFormattedDays() {

        println("Day is $this")

    }

}