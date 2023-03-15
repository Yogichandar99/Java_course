package com.careerit.day2;
import java.util.Scanner;
public class BiggestOfThree {
    public static void main(String args[])
    {
        int n1,n2,n3;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter first number: ");
        n1=in.nextInt();
        System.out.println("Enter second number: ");
        n2=in.nextInt();
        System.out.println("Enter third number: ");
        n3=in.nextInt();
        if((n1>n2) && (n1>n3))
        {
            System.out.println(n1+ " is biggest of three");
        }
        else if(n2>n3){
            System.out.println(n2+ " is the biggest of three");
        }
        else{
            System.out.println(n3+" is the biggest");
        }
    }
}
