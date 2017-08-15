package com.sbt

/**
  * test
  */
object Test {
    def main(args: Array[String]) {
        delayed(time());

        println()

        val buf = new StringBuilder
        buf += 'a'
        buf ++= "bcdef"
        println( "buf is : " + buf.toString )
    }

    def time() = {
        println("获取时间，单位为纳秒")
        System.nanoTime
    }
    def delayed( t: => Long ) = {
        println("在 delayed 方法内")
        println("参数： " + t)
        t
    }

}
