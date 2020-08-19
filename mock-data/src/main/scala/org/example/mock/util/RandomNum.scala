package org.example.mock.util

import scala.collection.mutable
import scala.collection.mutable.ListBuffer
import scala.util.Random

/**
 * Created by atyongsi@163.com on 2020/8/19
 * Description:用来随机产生自然数
 */
object RandomNum {

  def apply(fromNum: Int, toNum: Int): Int = {
    fromNum + new Random().nextInt(toNum - fromNum + 1)
  }

  //在fromNum和toNum之间,随机产生amount个数,用delimiter符号分割,并且可以指定输出的数是否重复
  def multi(fromNum: Int, toNum: Int, amount: Int, delimiter: String, canRepeat: Boolean): String = {
    var str = ""
    if (canRepeat) {
      val buffer = new ListBuffer[Int] //ListBuffer来缓存输出的数,这里的数可以重复
      while (buffer.size < amount) {
        val randomNum: Int = fromNum + new Random().nextInt(toNum - fromNum + 1)
        buffer += randomNum
      }
      str = buffer.mkString(delimiter)
    } else {
      val set = new mutable.HashSet[Int] //用HashSet来缓存输出的数,这里的数不可以重复
      while (set.size < amount) {
        val randomNum: Int = fromNum + new Random().nextInt(toNum - fromNum + 1)
        set += randomNum
      }
      str = set.mkString(delimiter)
    }
    str
  }

  //测试multi()方法
  def main(args: Array[String]): Unit = {
    println(multi(1, 100, 5, ",", false))
  }

}
