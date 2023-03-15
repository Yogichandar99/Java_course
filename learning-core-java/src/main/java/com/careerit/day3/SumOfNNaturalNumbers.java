package com.careerit.day3;
import java.util.Scanner;

public class SumOfNNaturalNumbers
{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the limit: ");
        int n=in.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum=sum+i;
        }
        System.out.println("sum of first "+n+ " natural numbers is "+sum);
    }

}
