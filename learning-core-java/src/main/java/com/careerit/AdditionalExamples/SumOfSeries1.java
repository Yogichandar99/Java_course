package com.careerit.AdditionalExamples;
import java.util.Scanner;

public class SumOfSeries1
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("This program calculates sum of series 1/1+1/2+1/3+......1/n");
        System.out.println("Enter a number: ");
        int n=in.nextInt();
        float sum=0;
        for(float i=1;i<=n;i++)
        {
            sum=sum+(1/i);
        }
        System.out.println("sum of the series with given number "+n+" is "+sum);
    }

}
