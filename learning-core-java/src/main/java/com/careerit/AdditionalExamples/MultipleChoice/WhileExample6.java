package com.careerit.AdditionalExamples.MultipleChoice;

public class WhileExample6
{
    public static void main(String[] args)
    {
        int i=1,sum=0;               //i=1,sum=0
        while(i<10)                  //1<10-T
        {
            int j=1;                //j=1
            int count=0;            //count=0
            while(j<=i)             //1<=1-T    2<=2 T
            {
                if(i%j==0)          //1%1==0 T  2%2==0 T
                {
                    count++;        //count=1   count=2
                }
                j++;                //j=2       j=3
            }
            if(count==2)            //count==2-F t
            {
                if(i%2!=0)                       //
                    sum+=i;                      //
            }
            i++;                    //i=2
        }
        System.out.println(sum);
    }
}
