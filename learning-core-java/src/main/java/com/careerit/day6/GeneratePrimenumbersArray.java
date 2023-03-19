package com.careerit.day6;
import java.util.Scanner;

public class GeneratePrimenumbersArray
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        //To build array of prime numbers
        System.out.println("Enter the length of array to generate prime: ");
        int num=in.nextInt();
        int primeArr[]=new int[num];
        primeArr=generatePrime(num);
        System.out.println("prime numbers generated are: ");
        for(int i=0;i<num;i++)
        {
            System.out.print(primeArr[i]+" ");
        }
    }
    private static int[] generatePrime(int n)
    {
        int arr[]=new int[n];
        //to generate n prime numbers
        int i;
        int x;
        for(i=1,x=2;i<=n;i++,x++)
        {
            if(isPrime(x))
            {
                arr[i]=x;
            }
        }
        return arr;
    }

    static boolean isPrime (int n)
    {
        // 0, 1 negative numbers are not prime
        if (n < 2)
            return false;

        // checking the number of divisors b/w 1 and the number n-1
        for (int i = 2; i <n; i++)
        {
            if (n % i == 0)
                return false;
        }

        // if reached here then must be true
        return true;
    }
}
