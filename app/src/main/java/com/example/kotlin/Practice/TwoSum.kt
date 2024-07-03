package com.example.kotlin.Practice

fun main() {
    println("Two Sum ")

    val array = arrayOf(2, 7, 11, 15)

    val targer = 26
    val ans = IntArray(2) { 0 }

    for (i in 0 until array.size - 1) {
        //println(i) // its will print array index of 0 to array.size-1 -> 0,1,2
        //   println(array[i]) // it will print array element of index o to size -1 -> 2,7,11

        for (j in i + 1 until array.size) {

            if (array[i] + array[j] == targer) {
                ans[0] = i
                ans[1] = j
            }

        }
    }

    for (k in ans) {
        println(k)
    }


    // rang and  for loop
    println("rang and  for loop")
    for (i in 1..5 step 2) {
        println(i)
    }
    println("until")
    for (i in 1 until 5) {
        println(i)
    }

    println("downTo")

    for (i in 10 downTo 0 step 2) {
        println(i)
    }


}