package com.careerit.day6;
import java.util.Scanner;

public class BasicsOfArray
{
    public static void main(String[] args)
    {
        //declaring an array with predefined size
        int arr1[]=new int[20];
        //initialising the array(As the array elements are predefined while declaring length should be given).
        int arr2[]=new int[]{1,2,3,4,5};
        //initialising the array length as sum of two individual arrays
        int arr3[]=new int[arr1.length+ arr2.length];
        //taking user input
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the array 1 elements");
        for(int i=0;i<arr1.length;i++)
        {
            arr1[i]=in.nextInt();
        }
        //Displaying array1
        System.out.println("Array 1 elements are: ");
        for(int i=0;i<arr1.length;i++)
        {
            System.out.print(arr1[i]+" ");
        }
        //Display the array elements using for each loop
        for(int ele:arr2)
        {
            System.out.println(ele);
        }
        //initialising arr3 in the program
        arr3[0]=0;
        arr3[1]=1;
        arr3[2]=2;
        arr3[3]=4;
        arr3[4]=5;
        arr3[5]=6;
        //displaying first three elements of array 3
        System.out.println("First three elements of array3");
        for(int i=0;i<3;i++)
        {
            System.out.print(arr3[i]+" ");
        }
        //Displaying last three elements of array 3
        System.out.println("last three elements of array 3 are : ");
        for(int i=0;i<arr3.length;i++)
        {
            System.out.print(arr3[i]+" ");
        }
        //reverse of an array3
        System.out.println("displaying reverse of array 3 elements: ");
        for(int i=arr3.length-1;i>=0;i--)
        {
            System.out.println(arr3[i]+" ");
        }
    }
}
