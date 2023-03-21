package com.careerit.day7;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
public class ArrayListExample
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Declaration of an array list
        List<Integer> arr = new ArrayList<>();
        while (true) {
            System.out.println("*".repeat(50) + "\n 1.Add 2.Delete value at index 3.Delete particular value in list 4.Update \n" + "*".repeat(50));
            System.out.println("enter a value:");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("enter a number to add: ");
                    int num = sc.nextInt();
                    arr.add(num);
                    System.out.println(arr);
                    break;
                case 2:
                    System.out.println("enter index of number to delete: ");
                    int index=sc.nextInt();
                    //This allows user to remove the value at that index.
                    arr.remove(index);
                    System.out.println(arr);
                    break;
                case 3:
                    System.out.println("enter a number to delete: ");
                    num=sc.nextInt();
                    //This allows user to remove the specified value from the arrayList.
                    int idx= arr.indexOf(num);
                    if(idx!=-1)
                    arr.remove(idx);
                    System.out.println(arr);
                    break;
                case 4:
                    System.out.println("enter a number to update: ");
                    int unum=sc.nextInt();
                    int ind=arr.indexOf(unum);
                    if(ind!=-1)
                    {
                        arr.set(ind,unum);
                    }
                default:
                    throw new IllegalStateException("Unexpected value: " + ch);
            }
            System.out.println("Do you want to continue: If yes press 1 ");
            int choice=sc.nextInt();
            if(choice!=1)
                break;
        }
    }
}
