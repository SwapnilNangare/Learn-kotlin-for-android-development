package com.example.kotlin.Practice

fun main() {
    println("Inheritance")

    val objChild = Child()
    objChild.myMethod()
    objChild.myMethod2()
}

open class Parent {


    init {
        println("Parent constructor is called")
    }


    val name1: String = ""
    fun myMethod() {
        println("I am in Parent class")
    }
}

class Child : Parent() {

    init {
        println("child constructor is called")
    }

    val name2: String = ""
    fun myMethod2() {
        println("i am in Child class")
    }


}

