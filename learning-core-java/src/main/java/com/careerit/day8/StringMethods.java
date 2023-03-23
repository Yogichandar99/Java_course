package com.careerit.day8;
import java.util.Scanner;

public class StringMethods
{
    public static void main(String[] args)
    {
        String name="Random ";
        //Returns length of the given string
        System.out.println(name.length());
        //Returns the character at index 2
        System.out.println(name.charAt(2));
        //converts all the characters into upper case
        System.out.println(name.toUpperCase());
        //Converts all the characters into lower case
        System.out.println(name.toLowerCase());
        //checks whether given set of string exists in the given string or not
        System.out.println(name.contains("dom"));
        //checks whether the given string starts with given character or not
        System.out.println(name.startsWith("R"));
        //To trim the spaces in the string
        System.out.println(name.trim());
        //Substrings
        System.out.println(name.substring(3)); //3 to end
        System.out.println(name.substring(2,5)); //index 2 to 5.

    }
}
