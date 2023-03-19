package com.careerit.day5;
import java.util.Scanner;

public class DaysinaMonthCalculator
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the month number(range:1-12)");
        int n=in.nextInt();
        int y=2023;
        int flag=0;
        if(n==2)
        {
            System.out.println("enter the year");
            y=in.nextInt();
        }

        switch(n){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 days in this month");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 days in this month");
                break;
            case 2:
                if (((y % 4 == 0) && (y % 100!= 0)) || (y%400 == 0)){
                    flag=1;
                }
                else {
                    flag=0;
                }
                if(flag==1)
                {
                    System.out.println("leap year 29 days in this month");
                }
                else{
                    System.out.println("not leap year 28 days in this month");
                }
                break;
            default:
                System.out.println("please enter appropriate month number between 1-12: ");
        }
    }
}
