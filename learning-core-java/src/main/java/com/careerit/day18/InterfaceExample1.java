package com.careerit.day18;
interface One{
    //This is abstract class declared in interface one
    void m1();
}
interface Two{
    //These are two abstract classes declared in interface two
    void m1();
    void m2();
}
//An interface can extend other interfaces
interface Three extends One,Two{
    void m3();
}
class Four implements One,Two{
    //Inorder to make this functional we need to define the abstract methods m1,m2
    @Override
    public void m1()
    {
        System.out.println("This is m1 function definition");

    }
    @Override
    public void m2()
    {
        System.out.println("This is m2 function definition");

    }
}

public class InterfaceExample1
{
    public static void main(String[] args)
    {
        Four obj=new Four();
        obj.m1();
        obj.m2();

    }
}
