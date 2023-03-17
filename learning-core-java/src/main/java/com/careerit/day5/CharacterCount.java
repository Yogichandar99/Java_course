package com.careerit.day5;
import java.util.Scanner;

public class CharacterCount
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter a String to count number of vowles and consonants");
        String input=in.next();
        int Vcount=0;
        int Ccount=0;
        int Cspace=0;
        for(int i=0;i<input.length();i++)
        {
            char ch=input.charAt(i);
            switch(ch)
            {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    Vcount++;
                    break;
                case ' ':
                    Cspace++;
                    break;
                default:Ccount++;
            }
        }
        System.out.println("number of vowels in given string "+input+" is "+Vcount);
        System.out.println("number of constant in given string "+input+" is "+Ccount);
        System.out.println("number of Spaces in given string "+input+" is "+Cspace);

    }
}
