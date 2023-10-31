package com.example.kotlin.Practice

fun main() {
    println("Higher Order Functions") // Function that accepts functions as argument or return functions or both

    var result: (a: Double, b: Double) -> Double = ::sum

    calculator(2.0, 4.0, ::sum)

}

fun sum(a: Double, b: Double): Double {
    return a + b;

}

fun calculator(a: Double, b: Double, gn: (Double, Double) -> Double) {

    val result = gn(a, b)
    println(result)

}