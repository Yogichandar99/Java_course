package com.careerit.day8;
import java.util.Scanner;
public class StringExample5
{
    public static void main(String[] args)
    {
        System.out.println("Enter a string : ");
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        System.out.println("enter size to split: ");
        int size=in.nextInt();
        String str1[]=createSubstring(str,size);
        for(String ele:str1){
            System.out.print(ele+" ");
        }
    }
    private static String[] createSubstring(String str,int size)
    {
        String[] chunks = str.split("(?<=\\G.{" + size + "})");
        return chunks;
    }
}
