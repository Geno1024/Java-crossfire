package com.geno.crossfire.scala

import _root_.com.geno.crossfire.java.HelloJava
import _root_.com.geno.crossfire.kotlin.HelloKotlin

object HelloScala
{
  def hello(): Unit =
  {
    println("Hello Scala!")
  }

  def main(args: Array[String]): Unit = {
    HelloJava.hello()
    HelloKotlin.hello()
    HelloScala.hello()
  }
}