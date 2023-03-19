package com.careerit.day6;
import java.util.Scanner;

public class ArrayPalindrome
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the capacity of array : ");
        int arr1[]=new int[20];
        int n=in.nextInt();
        int flag=1;
        System.out.println("enter the elements of array");
        for(int i=0;i<n;i++)
        {
            arr1[i]=in.nextInt();
        }
        for(int i=0,j=n-1;i<=j;i++,j--)
        {

            if(arr1[i]!=arr1[j])
            {
                flag=0;
                break;
            }
        }
        if(flag==1)
        {
            System.out.println("given array is palindrome");
        }
        else {
            System.out.println("given array is not a palindrome");
        }

    }
}
