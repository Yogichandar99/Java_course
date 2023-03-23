package com.careerit.day8;
import java.util.Scanner;
public class StringExample4
{
    public static void main(String[] args)
    {
        String data="1001-krish-23,1002-Manoj-32,1003-charan-35,1004-kiran-45";
        String arr[]=data.split(",");
        String inddata[];
        /*
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }

         */
        for(int i=0;i<data.length();i++)
        {
            String arr1[]=data.split(",");
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }


    }
}
