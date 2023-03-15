package com.careerit.day1;

import java.util.Scanner;

public class CubeOfNumber
{
    public static void main(String args[])
    {
        int n1,result1;
        double result2;
        System.out.println("enter the number n1:");
        Scanner in=new Scanner(System.in);
        n1=in.nextInt();
        result1=n1*n1*n1;
        System.out.println("cube of the number "+n1+ " is "+result1);
        result2=Math.pow(n1,3);
        System.out.println("cube pf same number using math function is"+result2);
    }


}
