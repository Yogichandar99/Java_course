package com.careerit.day6;
import java.util.Scanner;

public class GeneratePrimeRange
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the lower bound: ");
        int lb= in.nextInt();
        System.out.println("enter the upper bound: ");
        int ub=in.nextInt();
        int arr[]=new int[ub-lb+1];
        int x=0;
        for(int i=lb;i<=ub;i++)
        {
            if(isPrime(i))
            {
                arr[x]=i;
                x++;
            }
        }
        System.out.println("Generated prime number array list with lower bound "+lb+" and upper bound"+ub);
        for(int j=0;j<x;j++)
        {
            System.out.print(arr[j]+" ");
        }

    }
    private static boolean isPrime(int num)
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
