package com.careerit.day15;
class X1
{
    void show()
    {
        System.out.println("X1");
    }
}
class X2 extends X1{
    void show()
    {
        super.show();
        System.out.println("X2");
    }
}
class X3 extends X2{
    void show()
    {
        System.out.println("X3");
    }
    void display()
    {
        show();
        super.show();
    }
}

public class ExampleManager1
{
    public static void main(String[] args)
    {
        X3 obj=new X3();
        obj.display();
    }
}
