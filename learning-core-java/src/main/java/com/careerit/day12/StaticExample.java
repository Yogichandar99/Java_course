package com.careerit.day12;

class RandomData{
    public static double pow(double a,double b)
    {
        double res=a;
        for(int i=1;i<b;i++)
        {
            res=res*a;
        }
        return res;
    }
}

public class StaticExample
{
    public static void main(String[] args)
    {
        System.out.println(Math.sqrt(10));
        System.out.println(Math.pow(2,3));
        System.out.println(Math.PI);
    }
}
