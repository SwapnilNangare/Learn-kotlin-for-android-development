package com.example.kotlin.Practice

fun main() {
    println("Kotlin Collections")

    val nums = mutableListOf(1, 2, 3)
    println(nums.indexOf(3))
    println(nums.contains(1))
    nums.add(3, 143)
    for (i in nums) {
        println(i)
    }

    nums.remove(1)

    println("After removing element ")
    for (i in nums) {
        println(i)
    }


    // Map

    val studentInfo = mutableMapOf<Int, String>()

    studentInfo.put(1, "Ram")
    studentInfo.put(2, "John")
    studentInfo.put(1, "Katie")
}
