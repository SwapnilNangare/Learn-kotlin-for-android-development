package com.example.kotlin.Practice

fun main() {

    val mustang = Car("mustang", "petrol", 100)
    val beetle = Car("beetle", "diesel", 100)

    println(mustang.name)
    println(mustang.type)
    println(beetle.name)
    println(beetle.type)
    mustang.driveCar()
    beetle.driveCar()




}

class Car(val name: String, val type: String, var kmRan: Int) {


    fun driveCar() {
        println("$name car is driving")
    }

    fun applyBreaks() {
        println("Applied Brakes")
    }

}