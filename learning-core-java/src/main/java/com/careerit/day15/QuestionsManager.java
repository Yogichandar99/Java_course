package com.careerit.day15;
class A1{
    int a=100;
    void show()
    {
        System.out.println(a);
    }
}
class A2 extends A1
{
    int a=999;
    void show()
    {
        System.out.println(a);
        System.out.println(super.a);
    }
    void display()
    {
        show();
        super.show();
    }

}

public class QuestionsManager
{
    public static void main(String[] args)
    {
        A2 obj=new A2();
        //Here we created an object of class A2 which holds a value of A2 type
        //When display method is called, it goes to A2.display at that point we have show()
        //and super.show() first show() in a2 is executed
        //which prints a which is 999 and super.a which is 100
        //later super.show() is accessed in which only the value of a is printed which is 100.
        //so overall output is 999,100,100;
        obj.display();
    }
}
