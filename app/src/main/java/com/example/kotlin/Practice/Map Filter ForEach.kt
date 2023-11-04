package com.example.kotlin.Practice

fun main() {
    println("Map, Filter, ForEach")


    val nums = listOf(1, 2, 3, 4, 5)
    val list = nums.filter { it % 2 != 0 }

    val userList = listOf(
        User(1, "A"),
        User(2, "B"),
        User(3, "C"),
        User(4, "D"),
    )

    println(userList.filter { it.id == 2 })
    println(list)

    // MAP

    val list2 = nums.map { it * it }
    println(list2)

    val paidUserList = userList.map {
        PaidUser(it.id, it.name, "Paid ")
    }

    println(paidUserList)

    val nums2= listOf(2,3,4,5,6,7,8)
    nums2.forEach { println(it) }
}

data class User(val id: Int, val name: String)
data class PaidUser(val id: Int, val name: String, val type: String)