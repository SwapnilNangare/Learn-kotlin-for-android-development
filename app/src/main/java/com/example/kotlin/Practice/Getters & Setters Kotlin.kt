package com.example.kotlin.Practice

fun main() {
    println("Getters & Setters Kotlin")

    val ob = Calculator()
    println(ob.add(22, 2))

    var p1 = Person2("swap", 21)
    println(p1.name)
    p1.age = -55
    println(p1.name)

}

class Calculator {
    fun add(a: Int, b: Int): Int {
        return a + b

    }

    fun multiply(a: Int, b: Int): Int {
        return a * b
    }
}

class Person2(nameParam: String, ageParams: Int) {

    var name: String = nameParam
        get() {
            println("Name getter is called")
            return field.uppercase()
        }
    var age = ageParams
        set(value) {
            if (value > 0) {
                field = value
            } else {
                println("age cant ne negative")
            }
        }

}