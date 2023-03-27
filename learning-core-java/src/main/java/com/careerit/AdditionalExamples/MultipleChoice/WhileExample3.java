package com.careerit.AdditionalExamples.MultipleChoice;

public class WhileExample3
{
    public static void main(String[] args)
    {
        int num=9845;
        while(num>9){
            int sum=num%10+num/10;
            num=sum;
        }
        System.out.println(num);


    }
}
