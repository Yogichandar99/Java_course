package com.careerit.day16;

import java.util.concurrent.ThreadLocalRandom;

class Greetings{
    void show()
    {
        System.out.println("hi greetings from greeting class(Super class)");
    }
}
class BirthdayGreetings extends Greetings{
    void show()
    {
        System.out.println("Many more happy returns of the day");
    }
    void show(String name)
    {
        System.out.println(String.format("hi %s happy birthday",name));
    }
}
class FestivalGreetings extends Greetings{
    void show()
    {
        System.out.println("Happy new year");
    }
    void show(String name,String festival)
    {
        System.out.println(String.format("hi %s happy %s",name,festival));
    }
}

public class GreetingsManager
{
    public static void main(String[] args)
    {
        //Here we dont know what exactly greetings objects holds
        //depending on the condition it holds an object
        Greetings greetings=getGreetingsobject();
        if(greetings instanceof BirthdayGreetings obj)
        {
            obj.show("Yogi");
        }
        else if(greetings instanceof FestivalGreetings obj)
        {
            obj.show("Yogi","Happy Ugadi");
        }
    }
    private static Greetings getGreetingsobject()
    {
        int num= ThreadLocalRandom.current().nextInt(1,200);
        return num%2==0?new FestivalGreetings():new BirthdayGreetings();
    }
}
