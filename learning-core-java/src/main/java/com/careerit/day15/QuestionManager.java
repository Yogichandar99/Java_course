package com.careerit.day15;
class T1
{
    //Static block of T1
    static
    {
        System.out.println("Static block T1");
    }
    //constructor of T1
    T1()
    {
        System.out.println("T1");
    }
    //Instance Initializer block of T1
    {
        System.out.println("IIb-T1");
    }
}

class T2 extends T1
{
    //Static block of T2
    static
    {
        System.out.println("Static block T2");
    }
    //constructor of T2
    T2()
    {
        System.out.println("T2");
    }
    //Instance Initializer block of T2
    {
        System.out.println("IIb-T2");
    }
}

public class QuestionManager
{
    public static void main(String[] args)
    {
        //T1 obj=new T1();  //op: Static from t1, IIB-T1, T1
        //System.out.println();
        //T1 class can have an object of T2 class
        T1 obj1=new T2();
        //op is Static from T1, Static from T2, IIB-T1, T1, IIB-T2,T2


    }
}
