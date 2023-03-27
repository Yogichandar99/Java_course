package com.careerit.AdditionalExamples.MultipleChoice;

public class SwitchExample3
{
    public static void main(String[] args)
    {
        int num=9;
        switch(++num)
        {
            default: System.out.println("Num = "+num);
            case 4+3:System.out.println("Num = "+num);
                break;
            case 4+5:System.out.println("Num = "+num);
                break;
            case 4+4: System.out.println("Num = "+num);
                break;
        }
    }
}
