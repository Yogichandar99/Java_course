package com.careerit.AdditionalExamples.MultipleChoice;

public class ForExample6
{
    public static void main(String[] args)
    {
        int i=0,j=1;
        System.out.print(i+" "+j);
        for(int k=1;k<=3;k++)
        {
            int sum=i+j;
            System.out.print(" "+sum);
            i=j;
            j=sum;
        }
    }
}
