package com.careerit.day13;
class one
{
    private static int count=0;
    //updates the value of count by creating an object.
    //constructor overloading (with different signatures)
    public one(int a)
    {
        count++;
    }
    public one(int a,int b)
    {
        count++;
    }
    public one(int a,int b,int c)
    {
        count++;
    }
    public static int getCount()
    {
        return count;
    }
}
public class Manager
{
    public static void main(String[] args)
    {
        //initially it prints as zero as there is no object created.
        System.out.println(one.getCount());
        one obj1=new one(10);
        one obj2=new one(10,20);
        one obj3=new one(10,20,30);
        one obj4=new one(20);
        //4 objects are created for class one.
        System.out.println(one.getCount());
    }

}
