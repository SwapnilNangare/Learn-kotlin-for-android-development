package com.example.kotlin.Practice

fun main() {
    println("Kotlin Generics")

    val obj = IntContainer(3)
    obj.getValue()

    val intContainer = Container<Int>(12)
    println(intContainer.getValue())

    val sContainer = Container<String>("Swwap")
    println(sContainer.getValue())


    add(1,2,3,4,5)
    add(5,5,5,5,5,5,5,5)

}

class Container<T>(var data: T) {

    fun setValue(value: T) {
        data = value
    }

    fun getValue(): T {
        return data
    }
}

class IntContainer(var data: Int) {

    fun setValue(value: Int) {
        data = value
    }

    fun getValue(): Int {
        return data
    }
}

class StringContainer(var data: String) {

    fun setValue(value: String) {
        data = value
    }

    fun getValue(): String {
        return data
    }
}

fun add(vararg value: Int) {
    var sum = 0
    for (i in value) {

        sum += i
    }
    println(sum)
}