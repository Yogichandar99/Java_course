package com.careerit.AdditionalExamples.MultipleChoice;

public class ForExample8
{
    public static void main(String[] args)
    {
        for(int i=1;i<=2;i++)
        {
            for(int j=1;j<=5;j++)
            {
                if(i%2==0 && j%2==0)
                    System.out.println(i+" "+j);
            }
        }
    }
}
