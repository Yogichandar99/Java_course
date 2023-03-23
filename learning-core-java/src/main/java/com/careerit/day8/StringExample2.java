package com.careerit.day8;
import java.util.Scanner;

public class StringExample2
{
    public static void main(String[] args)
    {
        String name1="krish";
        String name2="krish";
        String name3="krish";
        //Here we are appending ! but not changing it in the memory
        System.out.println(name1.concat("!")); //output krish!
        System.out.println(name1); //output: krish
        String name4=new String("krish");
        String name5=new String("krish");
        //As the reference of the objects id different comparision of them returns false.
        System.out.println(name4==name5);
        //As the value in both name 4 and 5 is same the result will be true
        System.out.println(name4.equals(name5));
        String name6=new String(new char[]{'k','r','i','s','h'});
        System.out.println(name5==name6); //output:false as both are of different reference
        System.out.println(name1.equals(name6));// output is true as both posses same value in them.

    }
}
