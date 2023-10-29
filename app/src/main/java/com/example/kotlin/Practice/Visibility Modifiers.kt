package com.example.kotlin.Practice

fun main() {
    println("Visibility Modifiers")

    val obj = B()
    println(obj.a11)
    println(obj.a3)
//    obj.test()
}

open class A {

    /* 1.public -> Redundant visibility modifier
   2.internal -> only module visibility its behaviour like public but within module
   3.private -> only within class access
   4.protected ->top level declaration is not available on protected

 */

    public var a11 = 101
    private var a2 = 102
    internal var a3 = 103
    protected var a4 = 104


}

class B : A() {

    fun test() {
        println(a11)
        //  println(a2) // Cannot access 'a2': it is invisible (private in a supertype) in 'B'
        println(a3)
        println(a4)
    }

}


