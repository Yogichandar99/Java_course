package com.careerit.day18;
interface Game{
    void start();
    void play();
    void stop();
}
class Bike implements Game{
    @Override
    public void start(){
        System.out.println("The game"+this.getClass().getSimpleName()+"is going to start");
    }
    @Override
    public void play()
    {
        System.out.println("The game"+this.getClass().getSimpleName()+"please use helmet");
    }
    @Override
    public void stop()
    {
        System.out.println("the game"+this.getClass().getSimpleName()+"is going to stop");
    }
}
class Car implements Game{
    @Override
    public void start(){
        System.out.println("The game"+this.getClass().getSimpleName()+"is going to start");
    }
    @Override
    public void play()
    {
        System.out.println("The game"+this.getClass().getSimpleName()+"please use seat belt");
    }
    @Override
    public void stop()
    {
        System.out.println("the game"+this.getClass().getSimpleName()+"is going to stop");
    }
}
public class GameManager
{
    public static void main(String[] args)
    {
        //Initially implemented the logic using Bike
        Game obj=new Bike();
        obj.start();
        obj.play();
        obj.stop();
        //For changing the logic we dont need to do all the process again
        // instead we can make simple changes as follows:
        Game obj1=new Car();
        obj1.start();
        obj1.play();
        obj1.stop();
        //here all the methods are same except the play method
        //Instead of repeating all the code we can implement
        // a abstract class which can be done as follows: implemented in GameManager1.java

    }

}
