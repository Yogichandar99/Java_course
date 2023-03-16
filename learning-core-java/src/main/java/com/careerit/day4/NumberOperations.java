package com.careerit.day4;
import java.util.Scanner;
import java.lang.Math;
public class NumberOperations
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter a number");
        int n=in.nextInt();
        System.out.println("Reverse of the given number "+n+" is "+numberReversal(n));
        System.out.println("The given number "+n+" is "+isprime(n));
        System.out.println("The given number "+n+" is "+ispalindrome(n));
        System.out.println("The given number "+n+" is "+isAmstrong(n));
        System.out.println("Sum of given number "+n+ " is "+SumOfDigits(n));
    }
    public static int numberReversal(int n)
    {
        int rev=0,r;
        while(n>0)
        {
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        return rev;
    }
    public static String isprime(int n)
    {
        if(n<2)
        {
            return "not prime";
        }
        for(int i=2;i<n;i++)
        {
            if(n%i==0) {
                return "not prime";
            }
        }
        return "prime";
    }
    public static String ispalindrome(int n)
    {
        int temp=n;
        int rev=numberReversal(n);
        if(rev==temp)
        {
            return "Palindrome";
        }
        return "Not Palindrome";
    }
    public static String isAmstrong(int n)
    {
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
            return "Amstrong";
        }
        return "Not Amstrong";
    }
    public static int SumOfDigits(int n)
    {
        int r,sum=0;
        while(n>0)
        {
            r=n%10;
            sum=sum+r;
            n=n/10;
        }
        return sum;
    }
}
