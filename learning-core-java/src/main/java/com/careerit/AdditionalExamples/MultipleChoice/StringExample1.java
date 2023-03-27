package com.careerit.AdditionalExamples.MultipleChoice;

public class StringExample1
{
    public static void main(String[] args)
    {
        String name="Krish how are you";
        String info1=name.substring(0,5).toUpperCase();
        String info2=name.substring(0,6).trim().toUpperCase();
        System.out.println(info1.length());
        System.out.println(info2.length());
        System.out.println(info1==info2);


    }
}
