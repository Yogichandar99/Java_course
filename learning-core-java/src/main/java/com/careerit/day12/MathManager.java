package com.careerit.day12;

class MyMath{
    private MyMath(){

    }
    public static int biggest(int a,int b)
    {
        return a>b?a:b;
    }
}

public class MathManager
{
    public static void main(String[] args)
    {
        //we can access a static method without creating an object by using the class name.
        int big=MyMath.biggest(10,20);
        //here biggest is static method and MyMath is class.
        System.out.println(big);
    }
}
