package com.careerit.day6;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ArrayOperations
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int n=20;
        int arr[]=getElements(n);
        //prints the random numbers generated from the getElments function
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int key=8;
        int index=findElement(key,arr);
        if(index>=0)
        {
            System.out.println("found the key elements given at index "+index);
        }
        //to find three key elements in the array
        int key1=1;
        int key2=8;
        int key3=3;
        boolean KeySearch=findThreeElements(arr,key1,key2,key3);
        System.out.println("The three elements are found:"+KeySearch);

        //To find the maximum of given array
        int biggest=biggestOfArray(arr);
        System.out.println("max in the generated array: "+biggest);
        int smallest=smallOfArray(arr);
        System.out.println("min in the generated array: "+smallest);

    }
    //Gets the value of n and assigns random values in the given range
    public static int[] getElements(int n)
    {
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=ThreadLocalRandom.current().nextInt(1,n+1);
        }
        return arr;
    }
    public static int findElement(int key_in,int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==key_in)
            {
                return i;
            }
        }
        return -1;
    }
    public static boolean findThreeElements(int arr[],int key_in1,int key_in2,int key_in3)
    {
        return(findElement(key_in1,arr)!=-1&&(findElement(key_in2,arr)!=-1)&&(findElement(key_in3,arr)!=-1));
    }
    public static int biggestOfArray(int arr[])
    {
        int max=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        return max;
    }
    public static int smallOfArray(int arr[])
    {
        int min=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(min>arr[i])
            {
                min=arr[i];
            }
        }
        return min;
    }


}
