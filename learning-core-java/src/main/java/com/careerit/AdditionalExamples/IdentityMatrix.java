package com.careerit.AdditionalExamples;
import java.util.Scanner;

public class IdentityMatrix
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int n= in.nextInt();
        System.out.println("Enter number of columns: ");
        int m=in.nextInt();
        System.out.println("Enter a number to print when i==j");
        int k=in.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=m;j++)
            {
                if(j==i)
                {
                    System.out.print(k+" ");
                }
                else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }

    }
}
