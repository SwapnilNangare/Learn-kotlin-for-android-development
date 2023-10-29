package com.example.kotlin.Practice

fun main() {
    println("Data Classes ")

    val v1 = Personal(1, "Swap")
    val v2 = Personal(2, "Komal")

    println(v1)
    println(v2)
    println(v1.hashCode())
    println(v1 == v2)

    // copy


}

class Personal(val id: Int, val name: String) {

}