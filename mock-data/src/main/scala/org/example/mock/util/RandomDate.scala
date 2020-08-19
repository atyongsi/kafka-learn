package org.example.mock.util

import java.util.Date

import scala.util.Random

/**
 * Created by atyongsi@163.com on 2020/8/19
 * Description:用来生成随机的时间
 */

object RandomDate {

  def apply(startDate: Date, endDate: Date, step: Int): RandomDate = {
    val randomDate = new RandomDate()
    val avgStepTime = (endDate.getTime - startDate.getTime) / step
    randomDate.maxTimeStep = avgStepTime * 2
    randomDate.lastDateTime = startDate.getTime
    randomDate
  }

  class RandomDate {
    var lastDateTime = 0L
    var maxTimeStep = 0L

    def getRandomDate() = {
      val timeStep = new Random().nextInt(maxTimeStep.toInt)
      lastDateTime = lastDateTime + timeStep

      new Date(lastDateTime)
    }
  }


  //测试随机生成时间
  def main(args: Array[String]): Unit = {
    println(apply(new Date(1980, 1, 1), new Date(2020, 8, 8), 100))
  }

}
