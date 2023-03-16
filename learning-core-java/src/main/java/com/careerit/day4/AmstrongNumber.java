package com.careerit.day4;
import java.util.Scanner;

public class AmstrongNumber
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the number");
        int n=in.nextInt();
        int temp=n;
        int n1=n,n2=n,r,count=0;
        double sum=0;
        while(n>0)
        {
            n=n/10;
            count++;
        }
        while(n1>0)
        {
            r=n1%10;
            sum=sum+Math.pow(r,count);
            n1=n1/10;
        }
        if(temp==sum)
        {
            System.out.println(sum);
            System.out.println(temp);
            System.out.println("Amstrong");
        }
        System.out.println(sum);
        System.out.println(temp);
        System.out.println("Not Amstrong");
    }
    }

