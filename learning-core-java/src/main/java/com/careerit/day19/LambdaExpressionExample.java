package com.careerit.day19;
interface operations{
    double perform(double a,double b);
}
public class LambdaExpressionExample
{
    public static void main(String[] args)
    {
        //In order to make the interface work we need to create a class
        //We will be creating an anonymous class
        //Instead of creating an anonymous class we can also make use of lamda function
        //This is only for functional interface
        operations obj=new operations()
        {
            @Override
            public double perform(double a, double b)
            {
                double res=a*b;
                return res;
            }
        };
        //instead of the above anonymous implementation we can do lambda function
        operations obj1=(a,b)->a+b;
        System.out.println(obj.perform(4,5));
        System.out.println(obj1.perform(4,5));
    }
}
