package com.example.kotlin.Practice

fun main() {
    println("Kotlin Object Declaration & Expressions  Singleton Pattern")
//
//    println(ObjA.num)
//    ObjB.testABC()


    SharingWidget.incrementFbLike()
    SharingWidget.incrementFbLike()
    SharingWidget.incrementFbLike()
    SharingWidget.incrementFbLike()
    SharingWidget.incrementFbLike()
    SharingWidget.incrementFbLike()
    SharingWidget.incrementFbLike()
    SharingWidget.incrementFbLike()
    SharingWidget.incrementFbLike()
    SharingWidget.incrementTwitterLike()
    SharingWidget.incrementTwitterLike()
    SharingWidget.incrementTwitterLike()
    SharingWidget.display()
}

object ObjA {

    val num = 10


}

object ObjB {

    val p: Int = 20

    fun testABC() {
        println("I am object B")
    }
}


object SharingWidget {

    private var twitterLikes = 0
    private var fbLike = 0

    fun incrementTwitterLike() = twitterLikes++
    fun incrementFbLike() = fbLike++
    fun display() = println("fecebook -$fbLike --Twitter -$twitterLikes")


}