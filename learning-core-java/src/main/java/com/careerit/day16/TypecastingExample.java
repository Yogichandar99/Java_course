package com.careerit.day16;

public class TypecastingExample
{
    public static void main(String[] args)
    {
        //taking an object array arr which can hold any type of values i.e String or integer.
        Object [] arr=new Object[]{"Hi","Hello","Yogi",456,"John"};
        //looping over the arr array
        for(Object obj:arr)
        {
            //Only is element is of String type we are performing the operation.
           if(obj instanceof String)
           {
               String name=(String)obj;
               System.out.println(name.toUpperCase());
           }
        }

    }
}
