package com.careerit.day15;
class M1{
    void m1()
    {
        System.out.println("m1");
    }
}
class M2 extends M1{
    void m1()
    {
        System.out.println("m2-m1");
    }
    void m1(int a)
    {
        System.out.println("m2-"+a);
    }
    void m2(){
        System.out.println("m2-m2");
    }
}

public class ExampleManager2
{
    public static void main(String[] args)
    {
        M1 obj=new M1();
        //the above object can only access the methods of M1 class i.e m1()
        M1 obj1=new M2();
        obj1.m1();
        //The object type of M1 can hold the type of M2, Here only the Inherited methods are accessible
        //i.e m1() is only accessible in order to access m2 methods type casting must be done.
        //obj.m2();
        //obj1.m1(10);
        //Typecasting
        if(obj1 instanceof M2 m2 )
        {
            m2.m1();
            m2.m1(10);
            m2.m2();
    }
    }
}
