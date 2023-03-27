package com.careerit.AdditionalExamples.MultipleChoice;

public class ForExample5
{
    public static void main(String[] args)
    {
        int n=10,i,j;
        for(i=1;i<=n;i++)
        {
            int count=0;
            for( j=1;j<=i;j++)
            {
                if(i%j==0)
                    count++;
            }
            if(count==2)
                if(i%2!=0)
                    System.out.print(i+" ");
        }

    }
}
