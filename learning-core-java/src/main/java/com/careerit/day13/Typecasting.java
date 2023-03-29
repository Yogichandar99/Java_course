package com.careerit.day13;

import com.sun.jdi.IntegerValue;

public class Typecasting
{
    public static void main(String[] args)
    {
        int a=10;
        //this is upcasting can be implicitly done by compiler
        float b=a;
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        //this is down casting which need to be done explicitly by user.
        //it is possible that there is a chance of loss of data.
        float c=10.05f;
        int d=(int)c;
        System.out.println("c:"+c);
        System.out.println("d: "+d);
        //Parsing
        //The concept of parsing is much useful in Array lists
        String ageStr="37";
        int age=Integer.parseInt(ageStr);
        System.out.println("age :"+age);
        //conversion of primitive data types to object data type is called boxing
        Integer obj = Integer.valueOf(12);
        //conversion of object data type to primitive data type is called unboxing
        int value=obj;
        obj=200;
        System.out.println("obj: "+obj);
        System.out.println("value: "+value);

    }
}
