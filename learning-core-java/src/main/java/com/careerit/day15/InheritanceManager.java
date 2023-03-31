package com.careerit.day15;
class One{
    One(int a,int b)
    {
        System.out.println("One");
    }
}
class Two extends One{
    Two(int a)
    {
        super(a,20);
        System.out.println("Two");
    }
}
class Three extends Two{
    Three()
    {
        //as parameters are specified we need to call super method explicitly.
        super(10);
        System.out.println("Three");
    }
}
public class InheritanceManager
{
    public static void main(String[] args)
    {
        //output will be one,two,three
        Three obj=new Three();

    }

}
