package com.careerit.day8;

public class StringExample3
{
    public static void main(String[] args)
    {
        String name1="core";
        String name2="core java";
        name1.concat(" java");
        //output false as both refer to different references.
        System.out.println(name1==name2);
        //output returns false as java is appended for time being but it was not changed in the variable.
        System.out.println(name1.equals(name2));

    }
}
