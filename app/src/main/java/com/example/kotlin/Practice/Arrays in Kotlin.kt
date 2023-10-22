package com.example.kotlin.Practice

fun main() {
    println("Arrays in Kotlin")

    var ar = arrayOf("one", "two", "three")
    var ar2 = arrayOf(1, 2, 3, 4, 5)
    for (i in ar) {
        println(i)
    }

    for (i in ar2) {
        println(i)
    }

    // we can print two arrays element in one for loop but condition is both array size is same

    val array1 = arrayOf(1, 2, 3, 4, 5)
    val array2 = arrayOf("A", "B", "C", "D", "E")

    if (array1.size == array2.size) {
        for (i in 0 until array1.size) {
            println("Array 1: ${array1[i]}, Array 2: ${array2[i]}")
        }
    } else {
        println("Arrays are of different sizes")
    }


}