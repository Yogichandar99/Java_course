package com.careerit.AdditionalExamples;
import java.util.Scanner;
import java.lang.Math;
public class SumOfSeries2
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the number to fix the range: ");
        int n= in.nextInt();
        double sum=0;
        for(int i=2;i<=n;i++)
        {
            sum=sum+(1/Math.pow(i,3));
        }
        System.out.println("sum of series "+sum);
    }
}
