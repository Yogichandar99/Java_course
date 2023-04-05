package com.careerit.day18;
interface Game1{
    void start1();
    void play1();
    void stop1();
}
abstract class AbstractGame implements Game1{
    @Override
    public void start1()
    {
        System.out.println("the game "+this.getClass().getSimpleName()+" is going to start");
    }
    @Override
    public void stop1()
    {
        System.out.println("the game "+this.getClass().getSimpleName()+" is going to stop");
    }
}
class Bike1 extends AbstractGame implements Game1
{

    @Override
    public void play1()
    {
        System.out.println("The game"+this.getClass().getSimpleName()+"please use helmet");
    }

}
class Car1 extends AbstractGame implements Game1
{

    @Override
    public void play1()
    {
        System.out.println("The game"+this.getClass().getSimpleName()+"please use seat belt");
    }

}

public class GameManager1
{
    public static void main(String[] args)
    {
        Game1 obj1=new Bike1();
        obj1.start1();
        obj1.play1();
        obj1.stop1();
        Game1 obj2=new Car1();
        obj2.start1();
        obj2.play1();
        obj2.stop1();

    }
}
