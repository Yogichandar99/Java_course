package com.careerit.AdditionalExamples.MultipleChoice;

public class ForExample11
{
    public static void main(String[] args)
    {
        int i,j,count=0;
        for(i=1;i<=3;i++)
        {
            for(j=1;j<=3;j++,count++);
        }
        System.out.println(count);
    }
}
