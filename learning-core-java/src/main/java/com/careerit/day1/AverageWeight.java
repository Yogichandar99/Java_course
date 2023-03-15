package com.careerit.day1;
import java.util.Scanner;
public class AverageWeight {
    public static void main(String args[])
    {
        float w1,w2,w3,w4,w5;
        float average;
        Scanner in=new Scanner(System.in);
        System.out.println("enter weight w1");
        w1=in.nextInt();
        System.out.println("enter weight w2");
        w2=in.nextInt();
        System.out.println("enter weight w3");
        w3=in.nextInt();
        System.out.println("enter weight w4");
        w4=in.nextInt();
        System.out.println("enter weight w5");
        w5=in.nextInt();
        average=(w1+w2+w3+w4+w5)/5;
        System.out.println("average of given weights is "+average);
    }
}
