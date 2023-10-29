package com.example.kotlin.Practice

fun main() {

    val tile = Title.Red("Mushroom", 25)
    val title2 = Title.Red("Fire", 30)
    println("{${tile.points}-${tile.type}}")




}

sealed class Title {

    class Red(val type: String, val points: Int) : Title()

    class Blue(val points: Int) : Title()


}