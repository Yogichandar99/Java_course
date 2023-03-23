package com.careerit.day8;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
public class AnagramExample
{
    public static void main(String[] args)
    {
        System.out.println(isAnagram("cat","act"));
        System.out.println(isAnagram("accct","hajah"));
        System.out.println(isAnagram("cata","acta"));

    }
    private static boolean isAnagram(String str1,String str2)
    {
        if(str1.length()!=str2.length())
        {
            return false;
        }
        char [] w1=str1.toCharArray();
        char [] w2=str2.toCharArray();
        Arrays.sort(w1);
        Arrays.sort(w2);
        return Arrays.equals(w1,w2);
    }
}
