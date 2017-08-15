package com.sbt

/**
  * Tuple
  */
object TupleTest {

    def main(args: Array[String]): Unit = {
        val t = (1,2,3,8)
        t.productIterator.foreach(println)

        // 可以使用下标访问
        val sum = t._1 + t._2 + t._3 + t._4
        println( "元素之和为: "  + sum )
    }
}
