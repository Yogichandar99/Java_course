package com.careerit.AdditionalExamples.MultipleChoice;

public class WhileExample10
{
    public static void main(String[] args)
    {
        int i=3;
        do
        {
            if(i<2)
                break;
            System.out.print(i--+" ");
        }while(2<3);

    }
}
