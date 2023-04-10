package com.careerit.day19;

import org.w3c.dom.ls.LSOutput;

interface MathOperations{
    double perform(double a,double b);
}


public class AnonymousClassExample
{
    public static void main(String[] args)
    {
        //Lambda function to implement functionality
        MathOperations obj=(a,b)->a+b;
        System.out.println(obj.perform(10,20));
        //incase of multistatement we can write Lambda function as
        MathOperations obj1=(a,b)->{
            double res=a+b;
            System.out.println(String.format("addition of %s %s is %s ",a,b,res));
            return res;
        };
    }

}
