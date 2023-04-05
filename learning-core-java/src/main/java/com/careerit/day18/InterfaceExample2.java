package com.careerit.day18;
interface Numope
{
    //An abstract method in the interface
    double add(double a,double b);
}
interface calc extends Numope
{
    //Two abstract methods declared in calc interface
    int add(int a,int b);
    //Same method signature need to be given if an interface extends other
    double add(double a,double b);
    //Assuming that we are adding a new function float add(int a,int b) as per our requirement
    //If we add this method all the working of class is disturbed and throws an error
    // in order to make this functional use default
    //based on the need default methods can be used or can be neglected.
     default float add(float a,float b)
     {
         return a+b;
     }

}
class Calculator implements calc{
    //Inorder to make the class working we need to define the abstract methods add
    @Override
    public int add(int a,int b)
    {
        return a+b;
    }
    public double add(double a,double b)
    {
        return a+b;
    }
}

public class InterfaceExample2
{
    public static void main(String[] args) {
        Calculator obj=new Calculator();
        double result=obj.add(10.50,30.00);
        System.out.println(result);
    }

}
