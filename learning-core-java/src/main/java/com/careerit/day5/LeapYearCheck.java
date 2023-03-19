package com.careerit.day5;
import java.util.Scanner;

public class LeapYearCheck
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter year");
        int year=in.nextInt();
        int flag=0;
        if((year%4==0)&&(year%100!=0)||(year%400==0)){
            flag=1;
        }
        else
            flag=0;
        if(flag==1)
        {
            System.out.println("Leap year");
        }
        else {
            System.out.println("Not a Leap year");
        }

    }
}
