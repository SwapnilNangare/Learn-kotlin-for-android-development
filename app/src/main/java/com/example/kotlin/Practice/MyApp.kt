package com.example.kotlin.Practice

fun main() {
    println("Welcome to the kotlin")
    println(1 + 2)
    println(false)

    val one = 10
    var two = 12
    var Str = "Swapnil"
    var fl = 2.23

    two = 15
    // one =12  Val cannot be reassigned
    println(one)
    println(two)


    // different Type of Data types

    var scrore: Int = 12;
    var temp: Double = 89.23
    var isRaining: Boolean = false
    val alphabet: Char = 'A'
    var message: String = "Hello Word"

    // kotlin Operators

    var i = 13
    var j = 2
    println("kotlin Operators")
    println(i + j)
    println(i - j)
    println(i * j)
    println(i / j.toFloat())

    // Modulus operator
    println(i % j)
    // Relational operators


    println(i > j)
    println(i < j)
    println(i >= j)
    println(i <= j)
    println(i == j)
    println(i != j)

    // increment and decrement operators
    // post and preIncrement
    var a = 11
    //preIncrement
    ++a
    //PostIncrement
    a++
    println(a)

    // Logical Operators & Short Circuiting
    val above70 = false
    val knowsProgramming = true

    //&&
    var calledForInterView = above70 && knowsProgramming
    println("Called For InterView " + calledForInterView)

    // ||
    calledForInterView = above70 || knowsProgramming
    println("Called For InterView Using or "+ calledForInterView)

    // !

    val not=false
    println(!not)

}