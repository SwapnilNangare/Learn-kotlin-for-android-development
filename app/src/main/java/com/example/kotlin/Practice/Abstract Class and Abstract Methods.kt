package com.example.kotlin.Practice

fun main() {
    println("Abstract Class and Abstract Methods")

    val circle1 = Circle1(4.0)
    println(circle1.area())
    circle1.display()
}

abstract class Shape1 {
    var name3: String = ""
    abstract fun area():Double
    abstract fun display()
}

class Circle1(val radius: Double) : Shape1() {
    override fun area(): Double = Math.PI * radius * radius


    override fun display() {
        println("Circle 1 is getting display")
    }
}