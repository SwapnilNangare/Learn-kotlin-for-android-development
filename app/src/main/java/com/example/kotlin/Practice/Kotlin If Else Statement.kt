package com.example.kotlin.Practice

fun main() {
    println("Kotlin If Else Statement")

    val isRaining = true

    if (isRaining == true) {
        println("Take Umbrella")
    } else {
        println("No Rains-Enjoy your days")
    }


    val x = 10
    val y = 10

    val result = if (x > y) {
        "X is Not greater then Y"
    } else if (x < y) {
        "X is Not Less then Y"
    } else {
        "X is equal then Y"
    }

    println(result)

    // When Statement & Expression
    val number = 5
    val num = number in 1 until 5 // 1 2 3 4 5
    // we we use until upeer bound is not included

    println(num)

    val animal = "Dog"
//    when (animal) {
//        "Horse" -> println("Animal is Horse")
//        "Cat" -> println("Animal is Cat")
//        "Dog" -> println("Animal is Dog")
//        else -> println("Animal not found")
//    }

    // when in Expression
    val result2 = when (animal) {
        "Horse" -> "Animal is Horse"
        "Cat" -> "Animal is Cat"
        "Dog" -> "Animal is Dog"
        else -> "Animal not found"
    }
    println(result2)

}