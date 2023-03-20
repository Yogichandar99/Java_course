package com.careerit.AdditionalExamples;
import java.util.Scanner;

public class SingleDigitSumGenerator
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter a number: ");
        int n= in.nextInt();
        int i=0;
        int sumOfDigits=SumDigits(n);
        //This loop iterates until we get sum as single digit
        while(sumOfDigits>9)
        {
            System.out.println("partial sum "+sumOfDigits);
            //calls the function sumDigits
            sumOfDigits=SumDigits(sumOfDigits);
            i++;
        }
        System.out.println("Final sum "+sumOfDigits+" iterated "+i+" times");
    }
    public static int SumDigits(int n)
    {
        int sum=0,r;
        while(n>0)
        {
            r=n%10;
            sum=sum+r;
            n=n/10;
        }
        return sum;
    }
}
