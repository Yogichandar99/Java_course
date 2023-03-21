package com.careerit.AdditionalExamples;
import java.util.Scanner;
import java.lang.Math;

public class IncrementDigitsOfNumber
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=in.nextInt();
        double temp=n;
        int count=0;
        int temp2=0;
        double temp3=0;
        double r1=0;
        while(n>0)
        {
            int r=n%10;
            temp2=temp2*10+(r+1);
            n=n/10;
            count=count+1;
        }
        //System.out.println("Entered number is "+temp+ "and updated number is "+temp2);
        while(temp2>0)
        {
            int r2=temp2%10;
            temp3=temp3*10+r2;
            temp2=temp2/10;
        }
        System.out.println("updated number is "+temp3);
    }
}
