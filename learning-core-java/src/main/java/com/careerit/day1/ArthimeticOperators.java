package com.careerit.day1;
import java.util.Scanner;

public class ArthimeticOperators
{
    public static void main(String args[])
    {
        int n1,n2;
        Scanner in=new Scanner(System.in);
        System.out.println("enter number n1");
        n1=in.nextInt();
        System.out.println("enter second number n2");
        n2=in.nextInt();
        System.out.println("sum of "+n1+" and "+n2+ " is "+(n1+n2));
        System.out.println("difference between "+n1+" and "+n2+ " is "+(n1-n2));
        System.out.println("product of "+n1+" and "+n2+" is "+(n1+n2));
        System.out.println("result of division between "+n1+ " " +n2+ " is"+(n1/n2));
        System.out.println("remainder after divison is "+(n1%n2));

    }
}
