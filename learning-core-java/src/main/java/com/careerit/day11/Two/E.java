package com.careerit.day11.Two;

import com.careerit.day11.One.A;

public class E extends A
{
    //Here we are implementing IS-A relationship
    //different package with different class with IS-A relationship
    //public and protected members are accessible.
    public void ShowDetails()
    {
        //System.out.println(pri_a);
        //System.out.println(def_a);
        System.out.println(pro_a);
        System.out.println(pub_a);
    }
}
