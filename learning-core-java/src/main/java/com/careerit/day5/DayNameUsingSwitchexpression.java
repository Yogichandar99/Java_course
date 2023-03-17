package com.careerit.day5;
import java.util.Scanner;

public class DayNameUsingSwitchexpression
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter a number(1-7)");
        int num=in.nextInt();
        String dayname=switch(num){
            case 1 ->"Monday";
            case 2 ->"Tuesday";
            case 3 ->"Wednesday";
            case 4 ->"Thursday";
            case 5 ->"Friday";
            case 6 ->"Saturday";
            case 7 ->"Sunday";
            default ->"Invalid Day";
        };
        System.out.println("Entered number "+num+" and corresponding day name "+dayname);

    }
}
