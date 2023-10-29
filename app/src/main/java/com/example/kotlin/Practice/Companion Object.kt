package com.example.kotlin.Practice

fun main() {
    println("Companion Object")

    MyClass.f()
    MyClass.AnotherObject.f2()  // Only one companion object is allowed per class
}


class MyClass {

    companion object MyObject {


        fun f() {
            println("Hello i am f from Object")
        }

    }

    //

    object AnotherObject {

        fun f2() {
            println("Hello i am f from Another Object")
        }
    }
}