package com.example.kotlin.Practice

fun main() {
    println("For Loop, Ranges & String Templating")

    println("simple for")
    for (i in 1..10) {
        println(i)
    }
    // until
    println("until")

    for (j in 1 until 5) {
        println(j)
    }

    //step
    println("step")
    for (k in 1..5 step 2) {
        println(k)
    }

    // downTO

    println("DownTo")
    for (i in 10 downTo 3) {
        println(i)
    }

    // Table printing

    println("Table printing")
    val number = 2
    for (i in 1..10) {
        println("2 X $i =" + number * i)
    }
}