package com.careerit.day11.One;

public class A
{
    private int pri_a=10;
    int def_a=10;
    protected int pro_a=10;
    public int pub_a=10;
    //It is same class and same package all the elements are accessible.
    public void ShowDetails()
    {
        System.out.println(pri_a);
        System.out.println(def_a);
        System.out.println(pro_a);
        System.out.println(pub_a);
    }
}
