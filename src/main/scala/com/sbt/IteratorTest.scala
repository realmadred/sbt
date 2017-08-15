package com.sbt

/**
  * Iterator
  */
object IteratorTest {

    def main(args: Array[String]): Unit = {
        val it1 = Iterator("Baidu", "Google", "fb", "Taobao")
        it1.foreach(println)
        println("------------------------------")
        val ita = Iterator(20,40,2,50,69, 90)
        val itb = Iterator(1,5,2,50,8, 0)
        println(ita.max)
        println(itb.min)

    }
}
