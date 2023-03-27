package com.careerit.AdditionalExamples.MultipleChoice;

public class IfExample3
{
    public static void main(String[] args)
    {
        int sum=0;
        for(int i=1;i<=20;i++) //i=1 1<20
        {
            if(i%4!=0)  //1%4!=0 continue
                continue;
            sum+=i;     //sum=sum+i
        }
        System.out.println(sum);
    }
}
