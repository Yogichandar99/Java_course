package com.careerit.day7;
import java.util.Scanner;
import java.util.Arrays;

public class ArrayCopyMethod
{
    public static void main(String[] args)
    {
            Scanner in=new Scanner(System.in);
            System.out.println("enter the length of array 1");
            int n= in.nextInt();
            int arr1[]=new int[n];
            System.out.println("enter the length of array 2:");
            int m=in.nextInt();
            int arr2[]=new int[m];
            System.out.println("enter the elements of array 1: ");
            for(int i=0;i<n;i++)
            {
                arr1[i]=in.nextInt();
            }
            System.out.println("enter the length of array 2: ");
            for(int i=0;i<m;i++)
            {
                arr2[i]=in.nextInt();
            }
            int arr3[]=new int[arr1.length+arr2.length];
            System.arraycopy(arr1,0,arr3,0,arr1.length);
            System.arraycopy(arr2,0,arr3,arr1.length,arr2.length);
            System.out.println(Arrays.toString(arr3));
    }
}
