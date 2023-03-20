package com.careerit.AdditionalExamples;
import java.util.Scanner;

public class NumberPattern1
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter number of rows to print the pattern: ");
        int n= in.nextInt();
        int k=1;
        //first loop to print the required number of rows
        for(int i=1;i<=n;i++)
        {
            //inner loop to print number of times
            for(int j=1;j<=i;j++)
            {
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }
    }
}
