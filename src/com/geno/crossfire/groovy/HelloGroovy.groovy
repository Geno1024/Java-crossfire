package com.geno.crossfire.groovy

import com.geno.crossfire.java.HelloJava
import com.geno.crossfire.kotlin.HelloKotlin
import com.geno.crossfire.scala.HelloScala

class HelloGroovy
{
    static void hello()
    {
        println "Hello Groovy!"
    }

    static void main(String[] array)
    {
        HelloJava.hello()
        HelloKotlin.hello()
        HelloScala.hello()
        HelloGroovy.hello()
    }
}