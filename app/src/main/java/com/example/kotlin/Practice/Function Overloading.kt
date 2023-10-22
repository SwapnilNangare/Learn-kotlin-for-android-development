package com.example.kotlin.Practice

fun main(){
    println("Function Overloading")
   println(add(2.3,5.2))
    println(add(11,5))
}


fun add(a:Int,b:Int):Int{
    return a+b;
}
fun add(a:Double,b:Double):Double{
return a+b;
}