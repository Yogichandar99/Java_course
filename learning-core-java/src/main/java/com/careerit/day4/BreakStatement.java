package com.careerit.day4;
import java.util.Scanner;

public class BreakStatement
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter a number to break the loop");
        int n=in.nextInt();
        for(int i=0;;i++)
        {
            if(i==n)
            {
                System.out.println("loop terminated at "+i);
                break;
            }
            System.out.println(i+ " ");
        }
    }

}
