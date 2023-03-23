package com.careerit.day8;

public class SplitString
{
    public static void main(String[] args)
    {
        String data="1001-krish-23,1002-Manoj-32,1003-charan-35,1004-kiran-45";
        String arr[]=data.split(",");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        String inStr[];
        int small=Integer.MAX_VALUE;
        String name="null";

        for(String ele:arr)
        {
            inStr=ele.split("-");
            //System.out.println(inStr);
            long id = Long.parseLong(inStr[0]);
            name = inStr[1];
            int age = Integer.parseInt(inStr[2]);
            System.out.println("Id: " + id + ", Name: " + name + ", Age: " + age);
            if(age<small)
            {
                small=age;
                name=name;
            }
        }
        System.out.println(" Youngest person is " +name+" age "+small);
    }
}
