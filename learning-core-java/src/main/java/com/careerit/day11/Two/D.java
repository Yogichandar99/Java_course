package com.careerit.day11.Two;

import com.careerit.day11.One.A;

public class D
{
    //creating an object to Access class A
    A obj=new A();
    //This is different package with different class using HAS-A relationship
    //Except the public members all the elements are not accessible.
    public void ShowDetails()
    {
        //System.out.println(obj.pri_a);
        //System.out.println(obj.def_a);
        //System.out.println(obj.pro_a);
        System.out.println(obj.pub_a);
    }

}
