package com.geno.crossfire.java;

import com.geno.crossfire.groovy.HelloGroovy;
import com.geno.crossfire.kotlin.HelloKotlin;
import com.geno.crossfire.scala.HelloScala;

public class HelloJava
{
    public static void hello()
    {
        System.out.println("Hello Java!");
    }

    public static void main(String[] args)
    {
        HelloJava.hello();
        HelloKotlin.hello();
        HelloScala.hello();
        HelloGroovy.hello();
    }
}
