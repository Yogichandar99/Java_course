package com.careerit.day1;
import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("enter first variable");
        int n1=in.nextInt();
        System.out.println("enter second variable");
        int n2=in.nextInt();
        int sum=0;
        sum=n1+n2;
        float avg=0;
        System.out.println("sum of "+ n1 +" and "+ n2 +" is "+sum);
        avg=(n1+n2)/2;
        System.out.println("average of "+n1+ " and " +n2+ " is " +avg);

    }
}
