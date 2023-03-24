package com.careerit.day11;
import java.util.Scanner;

public class TernaryOperator
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a: ");
        int a=in.nextInt();
        System.out.println("Enter b: ");
        int b=in.nextInt();
        int result=(a>b)?a:b;
        System.out.println("biggest of given numbers "+a+ " and "+b+" is "+result);
    }
}
