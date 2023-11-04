package com.example.kotlin.Practice

fun main() {
    println("apply, let, with, run functions  Scoped Functions")

    val emp = Employee()
    emp.age = 10
    emp.name = "John"

    // apply

//    emp.apply {
//         age=11
//        name="Swapnil"
//    }


    // let
//    println(emp.age)
//    println(emp.name)
//    emp.let {
//
//        println(it.age)
//        println(it.name)
//
//    }

    // with

//   var x= with(emp) {
//        age = 40
//        name="XYZ"
//    }
//
    //run
    emp.run {

        age = 35
        name = "PQR"
    }

    println(emp)

}

data class Employee(var name: String = "", var age: Int = 19)