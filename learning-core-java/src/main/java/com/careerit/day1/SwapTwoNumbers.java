package com.careerit.day1;
import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String args[])
    {
        int n1,n2;
        Scanner in=new Scanner(System.in);
        System.out.println("enter number n1:");
        n1=in.nextInt();
        System.out.println("enter number n2: ");
        n2=in.nextInt();
        n1=n1+n2;
        n2=n1-n2;
        n1=n1-n2;
        System.out.println("numbers after swapping are "+n1+ " " +n2);
    }
}
