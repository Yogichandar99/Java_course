package com.careerit.AdditionalExamples;
import java.util.Scanner;

public class OddEvenSumCalculator
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter a number to fix the range: ");
        int n=in.nextInt();
        int evenSum=0,oddSum=0;
        //We are accepting the last number in the range as well.
        for(int i=0;i<=n;i++)
        {
            if(i%2==0)
            {
                evenSum=evenSum+i;
            }
            else
            {
                oddSum=oddSum+i;
            }
        }
        System.out.println("Sum of even numbers in given range "+n+" is "+evenSum);
        System.out.println("Sum of odd numbers in given range "+n+" is "+oddSum);
    }
}
