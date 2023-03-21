package com.careerit.day7;
//import java.util.ArrayList;
//import java.util.List;
import java.util.Scanner;


public class ArrayStack
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the length of array: ");
        int n=in.nextInt();
        int arr[]=new int[n];
        //Declaration of an array list
        //List<Integer> arr = new ArrayList<>();
        while (true) {
            System.out.println("*".repeat(50) + "\n 1.Add 2.Delete value at index 3.Delete particular value in list 4.Update \n" + "*".repeat(50));
            System.out.println("enter a value:");
            int ch = in.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("enter a number to add: ");
                    int num = in.nextInt();
                    //addition logic
                    break;
                case 2:
                    System.out.println("enter index of number to delete: ");
                    int index=in.nextInt();
                    //This allows user to remove the value at that index.
                    //Deletion logic
                    break;
                case 3:
                    System.out.println("enter a number to delete: ");
                    num=in.nextInt();
                    //This allows user to remove the specified value from the arrayList.
                    int idx= indexOf(arr,num);
                    if(idx!=-1)
                        //Deletion logic
                    //System.out.println(arr);
                    break;
                case 4:
                    System.out.println("enter a number to update: ");
                    int unum=in.nextInt();
                    int ind=indexOf(arr,unum);
                    if(ind!=-1)
                    {
                        //update logic
                    }
                default:
                    throw new IllegalStateException("Unexpected value: " + ch);
            }
            System.out.println("Do you want to continue: If yes press 1 ");
            int choice=in.nextInt();
            if(choice!=1)
                break;
        }
    }
    public static int indexOf(int arr[],int num)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==num)
            {
                return i;
            }
        }
        return -1;
    }
}

