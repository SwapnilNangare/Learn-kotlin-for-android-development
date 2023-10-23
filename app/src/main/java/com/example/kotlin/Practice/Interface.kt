package com.example.kotlin.Practice

fun main() {
    println("Interface ")

    dragObjects(arrayOf(Circle2(4.0), Square2(4.0), Triangle2(4.0, 4.9),Player("Swapnil")))
}

fun dragObjects(objects: Array<Draggable>) {

    for (obj in objects) {
        obj.drag()

    }

}

interface Draggable {
    fun drag()

}


abstract class Shape2 : Draggable {
    abstract fun area(): Double

}

class Circle2(val radius: Double) : Shape2() {
    override fun area(): Double {
        return Math.PI * radius * radius
    }

    override fun drag() {
        println("Circle is dragging")
    }
}

class Square2(val side: Double) : Shape2() {
    override fun area(): Double {
        return side * side

    }

    override fun drag() {
        println("Square is dragging")
    }
}

class Triangle2(val base: Double, val height: Double) : Shape2() {
    override fun area(): Double {
        return 0.5 * base * height
    }

    override fun drag() {
        println("Triangle is dragging")
    }
}

class Player(val namee: String):Draggable {
    override fun drag() = println("$namee is dragging  ")

}