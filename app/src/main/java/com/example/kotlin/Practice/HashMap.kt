package com.example.kotlin.Practice

fun main() {
    println("Hash Map Key-value Pair ")


    // this Map in koltin
    var myMap = mapOf(1 to "Swapnil", 1 to "Soma", 2 to "Yogi", 4 to "vajpayee", 1 to "Ram")

    for (key in myMap.keys) {
        //  println(myMap[key])
     //   println("Element at key :$key = ${myMap.get(key)}")
    }


    // this HashMap in koltin

    val myHashMap = HashMap<Int, String>()

    myHashMap.put(11, "Kevy")
    myHashMap.put(12, "John")
    myHashMap.put(13, "Pascal")
    myHashMap.put(14, "Kivin")

    for (i in myHashMap.keys) {
        println("Element at key $i = ${myHashMap.get(i)}")
    }
}