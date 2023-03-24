package com.careerit.day11.One;

public class C extends A
{
    //Here we are implementing IS-A relationship
    //Same package different class with IS-A relationship
    //All the members are accessible except private members.
    public void ShowDetails()
    {
        //System.out.println(obj.pri_a);
        System.out.println(def_a);
        System.out.println(pro_a);
        System.out.println(pub_a);
    }
}
