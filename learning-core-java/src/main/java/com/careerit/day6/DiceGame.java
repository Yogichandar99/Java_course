package com.careerit.day6;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class DiceGame
{
    public static void main(String[] args)
    {
        int rnum=ThreadLocalRandom.current().nextInt(1,7);
        Scanner in=new Scanner(System.in);
        System.out.println("enter a guess");
        int gnum=in.nextInt();
        if(rnum==gnum)
        {
            System.out.println("you have guessed right!");
        }
        else{
            System.out.println("Wrong guess keep on guessing:");
        }
    }
}
