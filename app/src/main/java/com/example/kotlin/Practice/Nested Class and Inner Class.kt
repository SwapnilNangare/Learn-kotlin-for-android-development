package com.example.kotlin.Practice

fun main() {
    println("Nested Class and Inner Class")


    val outer = Outer()
    val inner = outer.Inner()
    inner.test()

}

class Outer {
    var i = 12

    inner class Inner {
        fun test() {
            println("i am in Inner class $i")
        }
    }
}