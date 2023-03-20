package com.careerit.AdditionalExamples;
import java.util.Scanner;


public class PrimenumbersInGivenRange
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the lower bound: ");
        int n1= in.nextInt();
        System.out.println("enter the upper bound: ");
        int n2= in.nextInt();
        for(int i=n1;i<=n2;i++)
        {
            if(isPrime(i))
            {
                System.out.print(i+" ");
            }
        }
    }
    public static boolean isPrime(int n)
    {
        if(n<2)
        {
            return false;
        }
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
}
