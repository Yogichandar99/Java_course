package com.careerit.day4;
import java.util.Scanner;

public class NestedForLoopExample {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter number of rows");
        int n=in.nextInt();
        System.out.println("enter number of columns");
        int m= in.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(i+""+j+" ");
            }
            System.out.println();
        }
    }
}
