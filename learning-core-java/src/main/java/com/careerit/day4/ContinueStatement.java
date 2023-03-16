package com.careerit.day4;
import java.util.Scanner;

public class ContinueStatement
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the range");
        int n= in.nextInt();
        System.out.println("enter a number to break");
        int m= in.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(i%m==0)
            {
                System.out.println();
                continue;
            }
            System.out.print(i+" ");
        }
    }
}
