package com.careerit.day4;
import java.util.Scanner;

public class NumberReversal
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the number");
        int n= in.nextInt();
        int rev=0,r=0;
        int temp=n;
        while(n>0)
        {
           r=n%10;
           rev=rev*10+r;
           n=n/10;
        }
        System.out.println("reverese of given number "+n+" is "+rev);
    }
}
