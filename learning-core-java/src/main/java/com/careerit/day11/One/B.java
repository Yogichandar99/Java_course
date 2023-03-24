package com.careerit.day11.One;

public class B
{
    //creating an object to access A class(HAS-A relationship)
    A obj=new A();
    //This is same package different class using HAS-A relationship
    //Except the private members all the elements are accessible.
    public void ShowDetails()
    {
        //System.out.println(obj.pri_a);
        System.out.println(obj.def_a);
        System.out.println(obj.pro_a);
        System.out.println(obj.pub_a);
    }
}
