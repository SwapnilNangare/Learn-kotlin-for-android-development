package com.example.kotlin.Practice

fun main() {
    println("Merge Sorted Array")

    var nums1 = arrayOf(1, 2, 3, 0, 0, 0)
    var nums2 = arrayOf(2, 5, 6)
    var m = 3
    var n = 3

    /*  var ans = IntArray(m + n)

      for (i in 0 until m) {
          ans[i] = num1[i]

      }

      for (j in 0 until n) {

          ans[m + j] = num2[j]

      }

      ans.sort()

      for (i in ans.indices) {
          num1[i] = ans[i]
      }

      for (ansArray in ans) {
          println("ansArray $ansArray")
      }

     */

    // second solution

    var index = m
    nums2.forEach {
        nums1[index++] = it
    }
    nums1.sort()

    for(i in nums1){
        println(i)
    }
}


