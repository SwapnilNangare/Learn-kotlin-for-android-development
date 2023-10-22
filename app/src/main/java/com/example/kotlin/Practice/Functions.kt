package com.example.kotlin.Practice

fun main() {
    println(addition(20, 50))
    printCount(5)
}

fun addition(num1: Int, num2: Int): Int {

    val sum = num1 + num2
    return sum
}

fun printCount(count: Int = 2) {
    for (i in 1..count) {
        println("Hello Swapnil")
    }
}