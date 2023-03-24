package com.careerit.day11;
import java.util.Scanner;

public class MathOperations
{
    //Checks the biggest in the given two numbers
    public int big(int a,int b)
    {
        return (a>b)?a:b;
    }
    //biggest element in the array using big function
    public int max(int a[])
    {
        int max=a[0];
        for(int i=1;i<a.length;i++)
        {
            max=big(max,a[i]);
        }
        return max;
    }
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the length of an array: ");
        int n=in.nextInt();
        System.out.println("Enter the array elements: ");
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        //As the above methods are not static methods we need to use an object to access them.
        //object need to created for the class
        MathOperations obj=new MathOperations();
        //accessing the maximum method using an object
        int maxOfArray=obj.max(arr);
        System.out.println(String.format("Max of given array elements is %s",maxOfArray));




    }
}
