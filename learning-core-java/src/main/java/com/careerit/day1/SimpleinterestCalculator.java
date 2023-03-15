package com.careerit.day1;
import java.util.Scanner;

public class SimpleinterestCalculator
{
    public static void main(String args[])
    {
        int p,r;
        float t;
        float interest;
        Scanner in=new Scanner(System.in);
        System.out.println("enter principal");
        p=in.nextInt();
        System.out.println("enter rate");
        r=in.nextInt();
        System.out.println("enter number of years");
        t=in.nextFloat();
        interest=(p*t*r)/100;
        System.out.println("interest for given principal "+p+" rate "+r+ " time "+t+ " is "+interest);
    }
}
