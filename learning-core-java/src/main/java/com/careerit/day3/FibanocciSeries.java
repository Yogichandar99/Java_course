package com.careerit.day3;
import java.util.Scanner;

public class FibanocciSeries
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter max limit until when you want the series to be printed");
        int n=in.nextInt();
        int a=0,b=1,sum=0;
        for(;a<=n;)
        {
            sum=a+b;
            System.out.print(a+ " ");
            a=b;
            b=sum;
        }
    }
}
