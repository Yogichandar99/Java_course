package com.careerit.day2;
import java.util.Scanner;
public class BiggestOfTwo {
    public static void main(String args[])
    {
        int n1,n2;
        Scanner in=new Scanner(System.in);
        System.out.println("enter number n1");
        n1=in.nextInt();
        System.out.println("enter number n2");
        n2=in.nextInt();
        if(n1>n2){
            System.out.println(n1+ " is biggest of given two numbers");
        }
        else{
            System.out.println(n2+ "is biggest of given two numbers");
        }
    }
}
