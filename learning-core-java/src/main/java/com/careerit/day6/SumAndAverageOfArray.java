package com.careerit.day6;
import java.util.Scanner;

public class SumAndAverageOfArray
{
    public static void main(String[] args)
    {
        int[] arr=new int[20];
        int n;
        System.out.println("enter the capacity of the array");
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        int sum=0;
        float avg;
        System.out.println("enter the array elements");
        for(int i=0;i<n;i++)
        {
            arr[i]= in.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            sum=sum+arr[i];
        }
        avg=(sum)/n;
        System.out.println("Sum of given array elements is "+sum);
        System.out.println("Average of given array elements is "+avg);



    }
}
