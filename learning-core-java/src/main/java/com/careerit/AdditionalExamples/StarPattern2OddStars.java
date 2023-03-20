package com.careerit.AdditionalExamples;
import java.util.Scanner;

public class StarPattern2OddStars
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int n=in.nextInt();
        //first loop to have number of rows
        for(int i=1;i<=n;i++)
        {
            //To print odd number of stars
            for(int j=1;j<=(2*i)-1;j++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
