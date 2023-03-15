package com.careerit.day3;
import java.util.Scanner;

public class FactorialOfaGivenNumber
{
    public static void main(String[] args)
    {
       Scanner in=new Scanner(System.in);
       System.out.println("enter the number");
       int n= in.nextInt();
       int fact=1;
       for(int i=1;i<=n;i++)
       {
           fact=fact*i;
       }
       System.out.println("factorial of given number "+n+ " is "+fact);
    }
}
