package com.careerit.day1;
import java.util.Scanner;

public class NumberOfCabs {
    public static void main(String args[])
    {
        int capacity,num,cabs;
        Scanner in=new Scanner(System.in);
        System.out.println("enter the capacity for a cab");
        capacity=in.nextInt();
        System.out.println("enter number of people waiting: ");
        num=in.nextInt();
        if((num%capacity)==0)
        {
            System.out.println("cabs required for "+num+" people with capacity "+capacity+" is " +(num/capacity));
        }
        else{
            System.out.println("cabs required for "+num+" people with capacity "+capacity+" is " +((num/capacity)+1));
        }
    }
}
