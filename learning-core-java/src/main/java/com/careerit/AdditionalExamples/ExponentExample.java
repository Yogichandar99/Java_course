package com.careerit.AdditionalExamples;
import java.util.Scanner;
import java.lang.Math;

public class ExponentExample
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the number");
        int n=in.nextInt();
        System.out.println("enter the second number: ");
        int m=in.nextInt();
        double result=Math.pow(n,m);
        int result1=1;
        System.out.println("result: "+result);
        for(int i=1;i<=m;i++)
        {
            result1=result1*n;
        }
        System.out.println("result without using math function: "+result1);

    }
}
