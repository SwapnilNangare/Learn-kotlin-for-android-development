package com.example.kotlin.Practice

fun main() {
    println("Overriding in Kotlin ")

    val onePlus = onePlus()
    onePlus.display()
    onePlus.name3

}

open class Mobile {
    open val name3: String = ""
    val size: Int = 5
    fun makeCall() = println("calling from mobile")
    fun powerOff() = println("shutting down")
    open fun display() = println("simple mobile display")

}

class onePlus : Mobile() {



    override fun display() = println("one plus display")
}