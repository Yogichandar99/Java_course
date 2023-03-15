package com.careerit.day3;
import java.util.Scanner;

public class FactorsOfNumber {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter a number to check");
        int n=in.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                System.out.print(i+" ");
            }
        }

    }
}
