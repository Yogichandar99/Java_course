package com.careerit.day2;
import java.util.Scanner;

public class DisplayAge {
    public static void main(String args[])
    {
        int age;
        Scanner in=new Scanner(System.in);
        System.out.println("enter age of user");
        age=in.nextInt();
        if(age<0)
        {
            System.out.println((age*-1));
        }
        System.out.println(age);

    }
}
