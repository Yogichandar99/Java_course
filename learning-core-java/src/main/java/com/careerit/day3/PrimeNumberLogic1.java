package com.careerit.day3;
import java.util.Scanner;

public class PrimeNumberLogic1
{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=in.nextInt();
        int count=0;
        for(int i=1;i<=n;i++)
        {
            if (n % i == 0) {
                count++;
            }
        }
            if(count==2)
            {
                System.out.println(n+" is prime");
            }
            else
            System.out.println(n+ " is not a prime number");
    }
}
