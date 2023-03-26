package com.careerit.day12;
class Demo
{
    static
    {
        System.out.println("static Block");
    }
    public static int count=10;
    public Demo()
    {
        System.out.println("Constructor");
    }
}

public class StaticBlockExample
{
    public static void main(String[] args)
    {
        System.out.println("Hello");
        //Initially hello is called, later after calling the function static block will be called first.
        Demo d1=new Demo();
        Demo d2=new Demo();
        System.out.println(d1.count);
    }

}
