package com.careerit.AdditionalExamples.MultipleChoice;

public class SwitchExample2
{
    public static void main(String[] args)
    {
        int num=6;
        switch(++num){
            case 6:System.out.println("Num = "+num);
                break;
            case 5:System.out.println("Num = "+num);
                break;
            case 7: System.out.println("Num = "+num);
            default: System.out.println("Num = "+num);
            //output is 7 and 7, as pre increment is given, case 7 is executed
                // and break is not given so default will also be executed.
        }
    }
}
