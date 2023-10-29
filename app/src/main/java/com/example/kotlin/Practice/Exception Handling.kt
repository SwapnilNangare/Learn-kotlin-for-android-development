package com.example.kotlin.Practice

import java.lang.IllegalArgumentException

fun main() {
    println("Exception Handling")

    val arr = arrayOf(1, 2, 3, 4)


    createUserList(5)
    createUserList(-2)



    try {
        println(arr[4])

    } catch (ex: NullPointerException) {

        println(ex)

    } catch (e: Exception) {
        println("please check array index")
    } finally {
        println("end of Exception")
    }


}

fun createUserList(count: Int) {
    if (count < 0) {
        // exception rise

        throw IllegalArgumentException("Count must be grater than 0")
    } else {

        println("User list created containing $count users")

    }

}