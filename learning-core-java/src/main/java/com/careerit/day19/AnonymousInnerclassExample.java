package com.careerit.day19;
//This a functional interface with only one abstract method
interface operation{
    double perform(double a,double b);
}
//Inorder to make the above interface working we need to have a class
class C1 implements operation{
    public double perform(double a,double b)
    {
        return a+b;
    }
}
//To perform a different operation we need a different class
class C2 implements operation{
    public double perform(double a,double b)
    {
        return a*b;
    }
}

public class AnonymousInnerclassExample
{
    public static void main(String[] args) {
        C1 obj=new C1();
        System.out.println(obj.perform(4,5));
        C2 obj1=new C2();
        System.out.println(obj1.perform(4,5));
        //Instead of writing a class for different implementations we can make use of anonymous class
        //Implementing anonymous class for subtracting
        operation obj3=new operation() {
            @Override
            public double perform(double a, double b)
            {
                System.out.println(a-b);
                return a-b;
            }
        };
        //If the interface is functional interface we can use lambda functions
        // which will be defined later in the other functions.
    }
}
