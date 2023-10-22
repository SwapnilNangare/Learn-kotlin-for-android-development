package com.example.kotlin.Practice

fun main() {
    println("Constructors in Kotlin")

    // this Constructors
    val cn = Automobile("Car", "Petrol")
    val car2 = Automobile("car", "CNG")

    val car3 = Automobile("car 3", "Diesel")


}


class Automobile(val name: String, val tyres: Int, val maxSeating: Int, engineType: String) {

    init {
        println("$name is Created")
    }


    init {

        println("2nd initializer Block")
    }

    //secondary constructor
    constructor(nameParam: String, engineParam: String) :
            this(nameParam, 4, 5, engineParam)

    fun drive() {}
    fun applyBreaks() {}
}

class Empty() {

}

class Person(nameParam: String, ageParam: Int) {
    val name: String = nameParam
    val age: Int = ageParam

}