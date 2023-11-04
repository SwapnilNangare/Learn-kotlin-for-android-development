package com.example.kotlin.Practice

fun main() {
    println("Extension Functions & Inline Functions".formattedString())
    calculateTimeAndRun {
        Loop(100000)
    }
    calculateTimeAndRun {
        Loop(100000)
    }
    calculateTimeAndRun {
        Loop(100000)
    }

}

fun String.formattedString(): String {


    return "----------------Swapnil---------------"

}

fun Loop(n: Long) {
    for (i in 1..n) {

    }
}


inline fun calculateTimeAndRun(fn: () -> Unit) {

    val start = System.currentTimeMillis()
    fn()
    val end = System.currentTimeMillis()
    println("Time taken${end - start}ms")

}