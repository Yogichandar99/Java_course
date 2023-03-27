package com.careerit.AdditionalExamples.MultipleChoice;

public class IfExample7
{
    public static void main(String[] args)
    {
        for(int i=1,j=5;i<=4;i++,j--)
        {
            if(i%j==0)
                System.out.println(i+" "+j);
        }
    }
}
