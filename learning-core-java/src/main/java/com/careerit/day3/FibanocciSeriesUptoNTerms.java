package com.careerit.day3;
import java.util.Scanner;

public class FibanocciSeriesUptoNTerms
{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter number of terms you would like to see");
        int n=in.nextInt();
        int a=0,b=1,sum=0;
        for(int i=1;i<=10;i++)
        {
            System.out.print(a+" ");
            sum=a+b;
            a=b;
            b=sum;
        }
    }
}
