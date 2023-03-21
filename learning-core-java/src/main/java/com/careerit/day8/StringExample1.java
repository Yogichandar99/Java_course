package com.careerit.day8;
import java.sql.SQLOutput;
import java.util.Scanner;
public class StringExample1
{
    public static void main(String[] args)
    {
        //String literal declartaion
        String name1="krish";
        //String declartaion using objects
        String name2=new String("krish");
        //converting a character array into string
        char[] arr=new char[]{'k','r','i','s','h'};
        String name3=new String(arr);
        String name5=name1.concat("!");
        System.out.println(name5);
        //Reference of the below variables is same as they are assigned using string literals
        String name6="core java";
        String name7="core java";
        String name8="core java";
        //Reference of these variables is different as we are creating a new space by using new class
        String name9=new String("Java ");
        String name10=new String("Java");
        System.out.println("name1:" +name1);
        System.out.println("name2:" +name2);
        System.out.println("name3:" +name3);
        System.out.println("name5:" +name5);
        System.out.println("name6 "+name6);
        System.out.println("name7:" +name7);
        System.out.println("name8:" +name8);
        System.out.println("name9:" +name9);
        System.out.println("name10:" +name10);

    }
}
