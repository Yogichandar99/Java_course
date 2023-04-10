package com.careerit.day19;

import java.util.Scanner;

public class ExceptionExample
{
    public static void main(String[] args) {
        System.out.println("Start of main");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter num 1:");
        int num1= sc.nextInt();
        System.out.println("enter num 2:");
        int num2= sc.nextInt();
        try {
            float res = num1 / num2;
            System.out.println(String.format("num 1 %s divided by num2 %s is %s", num1, num2, res));
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
            System.out.println("number cannot be zero: ");
        }
        System.out.println("end of main");
    }
}
