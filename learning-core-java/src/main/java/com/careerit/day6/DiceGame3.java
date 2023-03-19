package com.careerit.day6;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class DiceGame3
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        //making the first generated number constant
        final int rnum=ThreadLocalRandom.current().nextInt(1,7);
        for(int i=1;i<=3;i++)
        {
            System.out.println("enter your guess");
            int gnum=in.nextInt();
            if(rnum==gnum)
            {
                System.out.println("You have guessed the number in "+i+" attempts and number is "+rnum);
                break;
            }
            if(i==3){
                System.out.println("You have exceeded maximum number of guesses please try back again");
            }
        }

    }
}
