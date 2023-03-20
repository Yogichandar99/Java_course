package com.careerit.AdditionalExamples;
import java.util.Scanner;
public class CountOfPrimeDigitsInANumber
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter a number to check number of prime numbers occuring in that number: ");
        int n= in.nextInt();
        int temp=n;
        int primeCount=0;
        while(n>0)
        {
            int r=n%10;
            if(isPrime(r))
            {
                System.out.println(r+" ");
                primeCount++;
            }
            n=n/10;
        }
        System.out.println("Number of prime numbers in given number "+temp+" are "+primeCount);
    }
    public static boolean isPrime(int num)
    {
        if(num<2)
        {
            return false;
        }
        for(int i=2;i<num;i++)
        {
            if(num%i==0)
            {
                return false;
            }
        }
        return true;
    }
}
