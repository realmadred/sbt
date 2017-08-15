package com.sbt

import Array._
/**
  * 数组
  */
object ArrayTest {

    def main(args: Array[String]): Unit = {
        val arr = Array(1,2,35,4,8,9,6)
        for (elem <- arr) {
            println(elem)
        }
        println("---------------------------")
        arr.foreach(println)
        println("---------------------------")

        var total = 0;
        arr.foreach(e => total += e )
        println(total)

        println("-------------合并--------------")

        val myList1 = range(10, 20, 2)
        val myList2 = range(10,20)
        val myList3 =  concat( myList1, myList2)

        // 输出所有数组元素
        for ( x <- myList1 ) {
            print( " " + x )
        }
        println()
        for ( x <- myList2 ) {
            print( " " + x )
        }
        println("---------------------------")
        myList3.foreach(println)

    }
}
