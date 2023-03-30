package com.careerit.day14;

public class RemoteManager
{
    public static void main(String[] args)
    {

        //creating an object for remote
        Remote obj=new Remote();
        //Increasing the volume three times
        System.out.println(obj);
        obj.volumeUp();
        System.out.println(obj);
        obj.volumeUp();
        System.out.println(obj);
        obj.volumeUp();
        System.out.println(obj);
        //Decreasing the volume
        obj.volumeDown();
        //Turning off the remote
        System.out.println(obj);
        obj.powerOn("off");
        System.out.println(obj);
        //Here after turning off the default values are set so again increasing volume
        obj.volumeUp();
        System.out.println(obj);



        //creating other remote by using new object
        Remote obj1=new Remote();
        //Default values of other remote are printed.
        System.out.println(obj1);
        obj1.channelDown();
        System.out.println(obj1);
        obj1.channelUp();
        System.out.println(obj1);
        obj1.channelUp();
        System.out.println(obj1);



    }
}
