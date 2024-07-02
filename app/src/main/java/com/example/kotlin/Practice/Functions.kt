package com.example.kotlin.Practice

fun main() {
    println(addition(20, 50))
    println("Hello Swapnil".formattedString1())
    println("The sum is: ${calculateSum(3, 5)}")


}


// this sample function
fun addition(a: Int, b: Int): Int {
    return a + b
}


/* Extension functions
* Extension functions in Kotlin allow you to add new functions to existing classes
* without modifying their source code. This is particularly useful when working with
* classes from external libraries or classes that you don't have control over.
* */

fun String.formattedString1(): String {
    return "Swapnil-----------------------------"

}

// Infix functions


inline fun calculateSum(a: Int, b: Int): Int {
    return a + b
}





