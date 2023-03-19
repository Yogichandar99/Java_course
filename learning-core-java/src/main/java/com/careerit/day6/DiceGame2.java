package com.careerit.day6;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
public class DiceGame2
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int rnum=ThreadLocalRandom.current().nextInt(1,7);
        for(int i=1;i<=3;i++)
        {
            System.out.println("enter a number");
            int gnum=in.nextInt();
            if(gnum==rnum)
            {
                System.out.println("Good you guessed the number right "+rnum+ " "+gnum+" in "+i+" attempts");
                break;
            }
            if(i==3)
            {
                System.out.println("you have entered maximum number of attempts please try back agian");
            }
        }
    }
}
