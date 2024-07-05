package com.example.kotlin.Practice

fun main() {
    println("For Each Loop in Kotlin")

    val data = arrayOf(1, 22, 31, 42, 15)

    data.forEach({
        println(it)   // we use for getting all elements
    })

    data.indices.forEach({
        println("Index $it")   // we use for getting all elemets and index also
    })
}