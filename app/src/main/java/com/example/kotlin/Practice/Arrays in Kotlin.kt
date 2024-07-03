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
    println("until in arrays")
    val array12 = arrayOf(2,7,11,15)
    val ans= IntArray(2) {0}
    val target = 18

    for (i2 in 1 until array12.size-1){

        for (j in i2+1 until array12.size){
            if(array12[i2]+array12[j]==target){
                ans[0]=i2
                ans[1]=j
            }
        }



    }

    for (ii in ans){

    }



}