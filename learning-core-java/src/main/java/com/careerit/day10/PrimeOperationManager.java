package com.careerit.day10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeOperationManager
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the value of n to generate n prime numbers: ");
        int n= in.nextInt();
        System.out.println("enter lower bound");
        int lb=in.nextInt();
        System.out.println("Enter upper bound");
        int ub=in.nextInt();
        List<Integer> prime=new ArrayList<>();
        //as static method cannot be accessed we are creating an object for the class to access the menthods
        PrimeOperationList p1=new PrimeOperationList();
        prime=p1.generatePrime(lb,ub);
        System.out.println(prime);
        prime=p1.generatePrime(n);
        System.out.println(prime);
    }
}
