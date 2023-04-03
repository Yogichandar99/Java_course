package com.careerit.day17;
//Declaring a class with final keyword
final class One
{
    void m1()
    {
        System.out.println("one-m1");
    }

    void m2()
    {
        System.out.println("one-m2");
    }

}
//Class Two cannot inherit class one due to final
class Two
{
    Two()
    {
        System.out.println("Two");
    }

}

class T1
{
    void m1()
    {
        System.out.println("T1-m1");
    }
    //Declaring a method m2 in class T1 with final keyword
    final void m2()
    {
        System.out.println("T1-m2");
    }
}

//T2 Extends T1
class T2 extends T1 {
    @Override
    void m1()
    {
        System.out.println("T2 M1");
    }
    //We cannot override m2() (constructor overriding) is not allowed with final.
    /*
    void m2()
    {

    }

     */
}

public class FinalExample{
    public static void main(String[] args)
    {
        //Creating an object to access class one
        One obj1=new One();
        //Accessing the methods of class one
        obj1.m1();
        obj1.m2();
        T1 obj=new T2();
        obj.m1();
        obj.m2();
    }

}


