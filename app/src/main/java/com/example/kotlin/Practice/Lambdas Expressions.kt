package com.example.kotlin.Practice

fun main() {
    println("Lambdas Expressions")

    var fn: (a: Int, b: Int) -> Int = ::sum

    val lambda1: (Int, Int) -> Int = { x: Int, y: Int -> x + y }
    val multiLineLambda = {
        println("Hello Lambda")
        val a = 2 + 4
        "hello Swapnil"
        2
    }

    println(multiLineLambda())

    val singleParamLambda = { x: Int -> x * x }
    val lamb2: (Int) -> Int = { x -> x * x }

    val sayHi = { msg: String ->
        println("Hello $msg" + "")
    }


}

fun sum(a: Int, b: Int): Int = a + b

fun calculate(a: Int, b: Int, op: (Int, Int) -> Int): Int {
    return op(a, b)
}