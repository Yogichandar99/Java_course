package com.careerit.AdditionalExamples;
import java.util.Scanner;


public class NumberPattern2Oddnumbers
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter number of rows to print: ");
        int n=in.nextInt();
        //To print number of rows
        for(int i=1;i<=n;i++)
        {
            //To print number of characters every row has 2*i-1 characters
            for(int j=1;j<=i;j++)
            {
                //System.out.println(j);
                System.out.print(j+" ");
            }
            for(int j=i-1;j>=1;j--)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
