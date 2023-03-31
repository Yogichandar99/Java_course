package com.careerit.day15;

class C1{
    int a=100;
    int sub(int a,int b)
    {
        return a-b;
    }
    public int showA()
    {
        System.out.println(a);
        return 0;
    }
}
class C2 extends C1{
    int a=999;
    int sub(int a,int b)
    {
        //checking which is greater if a>b prints a-b else b-a
        return (a>b)?a-b:b-a;
    }
    public int  showA()
    {
        System.out.println(a);
        System.out.println(super.a);
        return 0;
    }
}

public class MathOperations
{
    public static void main(String[] args)
    {
        //C1 is parent and c2 is child
        //creating an obj of type c1 to hold the value type of c1
        C1 obj=new C1();
        //Here it will access the c1.sub() method
        System.out.println(obj.sub(5,10));

        //Creating a new object obj1
        //C1 type object can hold the value of c2 type
        C1 obj1=new C2();
        //This case is called as run time polymorphism where compiler will get an
        // ambiguity for accessing the sub method, at this moment object value type it is holding will be executed
        // here the c1 type object is holding the c2 type value hence c2.sub() will be executed.
        //overriding of parent properties had taken place(method overriding)
        System.out.println(obj1.sub(5,10));
        //the above concept is only for methods, for variables super class variables are executed
        // hence the value of a is 100.
        System.out.println(obj1.a);
        //again show is a method so c2.show will be executed,
        // however the value of a from super class is passed to child class
        // but it will be hidden, to access it we need to write super.a
        System.out.println(obj1.showA());
    }

}
