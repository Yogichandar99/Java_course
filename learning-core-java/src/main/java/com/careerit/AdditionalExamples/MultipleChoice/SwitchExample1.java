package com.careerit.AdditionalExamples.MultipleChoice;

public class SwitchExample1
{
    public static void main(String[] args)
    {
        int num=5;
        switch(num++)
        {
            case 6:System.out.println("Num = "+6);
            case 5:System.out.println("Num = "+5);
            case 7:System.out.println("Num = "+7);
                break;
            default: System.out.println("Num = "+num);
            //Doubt: Why 7 is also printed?
        }
    }
}
