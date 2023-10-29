package com.example.kotlin.Practice

fun main() {
    println("Kotlin Null Safety | Safe Call and Elvis Operator")

    var gender: String = "Male"
    var gender2: String? = null
    val isAdult: Boolean? = true


    if (gender2 != null) {
        println(gender2.uppercase())
    }


    println(gender2?.uppercase())     // ? safe call operator


    // safe call with let

    gender2?.let {
        println("Line 1")
        println("Line 2  $gender2")
        println("line 3 $it")
    }

    // ?: elvis operator
    var selectedValue = gender2 ?: "NA "
    println(selectedValue)

    // !! not null assertion operator Operation will always fail as operand is always null

    val value = gender2!!.uppercase()
    println(value)

    println()

}



