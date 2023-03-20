package com.careerit.AdditionalExamples;
import java.util.Scanner;

public class SumofOddNumbersSeries
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter a number to fix the range: ");
        int n=in.nextInt();
        int oddSum=0;
        for(int i=1;i<=n;i++)
        {
            if(i%2!=0)
            {
                oddSum=oddSum+i;
            }
        }
        System.out.println("In the given range 1-"+n+" sum of odd numbers is "+oddSum);

    }
}
