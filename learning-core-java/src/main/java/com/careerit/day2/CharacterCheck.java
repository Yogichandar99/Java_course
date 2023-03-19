package com.careerit.day2;
import java.util.Scanner;

public class CharacterCheck {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter any character to check");
        char ch = in.next().charAt(0);
        int Vch=(int)ch;
        if(Vch>=65 &&Vch<92)
        {
            System.out.println("entered character "+ch+" has Ascii value of "+Vch+" and is upper case alphabet");
        }
        else if(Vch>=97 &&Vch<=122)
        {
            System.out.println("entered character "+ch+" has Ascii value of "+Vch+" and is Lower case alphabet");
        }
        else if((Vch>=0 && Vch<=47)||(Vch>=58&&Vch<65)||(Vch>=93&&Vch<97)||(Vch>122&&Vch<=127))
        {
            System.out.println("Entered character is"+ch+" with ascii value "+Vch+" is special symbol");
        }
        else if(Vch>=48 &&Vch<=57)
        {
            System.out.println("Entered character is"+ch+" with ascii value "+Vch+" is a Number");
        }

    }
}
