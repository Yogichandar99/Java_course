package com.careerit.day4;
import java.util.Scanner;

public class MultiplicationTables {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter tables that you want to see");
        int n=in.nextInt();
        System.out.println("enter until when you want each table product should be printed");
        int m= in.nextInt();
        for(int i=1;i<=n;i++)
        {
            System.out.println(i+ " th table ");
            for(int j=1;j<=m;j++)
            {
                System.out.println(+i+" * "+j+" = "+(i*j));
            }
            System.out.println("-----------------------");
        }
    }
}
