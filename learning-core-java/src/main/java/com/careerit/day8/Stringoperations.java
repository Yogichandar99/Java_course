package com.careerit.day8;
import java.util.Scanner;
public class Stringoperations
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("please enter a string to check: ");
        String str1=in.nextLine();
       // String name1="MOM";
        boolean status1=is_palindrome(str1);
        //boolean status=is_palindrome(name1);
        if(status1){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not palindrome");
        }
        int vCount=countVowels(str1.toLowerCase());
        System.out.println("Number of vowels in given string "+str1+" is "+vCount);
    }

    public static boolean is_palindrome(String str)
    {
        int l=str.length();
        for(int i=0,j=l-1;i<=j;i++,j--)
        {
            if(str.charAt(i)!=str.charAt(j))
            {
                return false;
            }
        }
        return true;
    }
    private static int countVowels(String str)
    {
        int l=str.length();
        int vCount=0;
        //char arr[]=new char[]{'a','e','i','o','u','A','E','I','O','U'};
        for(int i=0;i<l-1;i++)
        {
            if(str.charAt(i)=='a'|str.charAt(i)=='e'|str.charAt(i)=='i'|str.charAt(i)=='o'|str.charAt(i)=='u')
            {
                vCount++;
            }
        }
        return vCount;
    }
}
