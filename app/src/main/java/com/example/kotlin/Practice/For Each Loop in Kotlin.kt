package com.example.kotlin.Practice

import kotlin.math.max

fun main() {
//    println("For Each Loop in Kotlin")
//
//    val data = arrayOf(1, 22, 31, 42, 15)
//
//    data.forEach({
//        println(it)   // we use for getting all elements
//    })
//
//    data.indices.forEach({
//        println("Index $it")   // we use for getting all elemets and index also
//    })

    // Best Time to Buy and Sell Stock
    println("Best Time to Buy and Sell Stock")

    var array1 = arrayOf(7, 1, 5, 3, 6, 4)

    var buy = 0
    var ans = 0
    array1.indices.forEach {

        ans = max(ans, array1[it] - array1[buy])

        if (array1[it] < array1[buy]) {
            buy = it
        }
    }
    println(ans)

    var array2 = arrayOf(7, 1, 5, 3, 6, 4)
    val min = array2.minOrNull()
    val max = array2.maxOrNull()

   println(min)
   println(max)
}