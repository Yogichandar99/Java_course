package com.careerit.AdditionalExamples;
import java.util.Scanner;

public class NumberOfDigits
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=in.nextInt();
        int countDigits=0;
        int temp=n;
        while(n>0)
        {
            countDigits++;
            n=n/10;
        }
        System.out.println("number of digits in given number "+temp+" are "+countDigits);
    }
}
