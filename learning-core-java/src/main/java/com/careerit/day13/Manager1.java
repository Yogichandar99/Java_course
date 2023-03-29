package com.careerit.day13;

class one1
{
    public static int count=0;
    public one1(int a)
    {
        System.out.println("single parameter constructor: ");
    }
    public one1(int a,int b)
    {
        System.out.println("Two parameters passed: ");
    }
    public one1(int a,int b,int c)
    {
        System.out.println("Three parameters passed: ");
    }
    //rather than incrementing the counter in each constructor
    // we can implement by instance initializer
    {
        count++;
    }

    public static int getCount()
    {
        return count;
    }
}

public class Manager1
{
    public static void main(String[] args)
    {
        System.out.println(one1.getCount());
        one1 obj1=new one1(10);
        one1 obj2=new one1(10,20);
        one1 obj3=new one1(10,20,40);
        one1 obj4=new one1(15);
        one1 obj5=new one1(10,78);
        System.out.println(one1.getCount());
    }
}
