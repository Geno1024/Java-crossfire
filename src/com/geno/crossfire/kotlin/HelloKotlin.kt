package com.geno.crossfire.kotlin

import com.geno.crossfire.java.HelloJava

object HelloKotlin
{
    @JvmStatic
    fun hello()
    {
        println("Hello Kotlin!")
    }

    @JvmStatic
    fun main(args: Array<String>)
    {
        HelloJava.hello()
        HelloKotlin.hello()
    }
}