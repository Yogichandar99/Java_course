package com.careerit.AdditionalExamples.MultipleChoice;

public class WhileExample1
{
    public static void main(String[] args)
    {
        int i=1,sum=0;
        while(true)
        {
            sum+=i;
            if(sum>14)
                break;
            if(i==5)
                break;
            i=sum+sum;
        }
        //output 27.
        System.out.println("Sum is :"+sum);
    }
}
