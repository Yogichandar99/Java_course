package com.careerit.day9;

public class AddConstructor
{
    public static void main(String[] args)
    {
        int n1=10;
        int n2=20;
        float n4=40.0f;
        System.out.println("result:"+AddConstructor(n1,n2));
        System.out.println("result:"+AddConstructor(n4,n2));
        System.out.println("result:"+AddConstructor(n1,n4));
    }
    private static int AddConstructor(int a,int b)
    {
        int sum=a+b;
        System.out.println("constructor 1 used ");
        return sum;
    }
    private static float AddConstructor(float a,int b)
    {
        float sum=a+b;
        System.out.println("constructor 3 used ");
        return sum;
    }
    private static float AddConstructor(int a,float b)
    {
        float sum=a+b;
        System.out.println("constructor 3 used ");
        return sum;
    }
}
