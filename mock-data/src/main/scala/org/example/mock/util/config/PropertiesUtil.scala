package org.example.mock.util.config

import java.io.InputStreamReader
import java.util.Properties

/**
 * Created by atyongsi@163.com on 2020/8/19
 * Description:Have Not Yet
 */
object PropertiesUtil {

  def main(args: Array[String]): Unit = {
    val properties: Properties = PropertiesUtil.load("config.properties")

    println(properties.getProperty("kafka.broker.list"))
  }

  def load(propertiesName: String): Properties = {
    val prop = new Properties();
    prop.load(new InputStreamReader(Thread.currentThread().getContextClassLoader.getResourceAsStream(propertiesName), "UTF-8"))
    prop
  }
}
