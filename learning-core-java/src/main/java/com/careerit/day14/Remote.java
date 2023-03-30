package com.careerit.day14;

public class Remote
{
    //creating instance variables volume, isMute and  power button
    int volume;
    boolean powerButton;
    boolean isMute;
    int channel;
    public Remote()
    {
        this.volume=5;
        this.powerButton=false;
        this.isMute=false;
        //Adding channel as well(Assuming the channel starts from 100)
        this.channel=100;
    }
    public void powerOn(String action)
    {
        //if the remote is off then we are turing it on.
        if(action=="on")
        {
            this.powerButton=false;
            this.volume=5;
            this.channel=100;
        }
        else if(action=="off")
        {
           this.powerButton=true;
        }
    }
    //A function to perform volume up operation.
    public void volumeUp()
    {
        //if remote is off, we are first turning it on and setting default values first
        if(this.powerButton)
        {
            powerOn("on");
        }
        if(this.isMute)
        {
            this.isMute=false;
        }
        this.volume++;
    }


    //A function to perform volume down operation.
    public void volumeDown()
    {
        if(this.volume>0)
        {
            this.volume--;
        }
    }
    public void channelUp()
    {
        if(this.powerButton)
        {
            powerOn("on");
        }
        //System.out.println(this.channel);
        this.channel++;
    }
    public void channelDown()
    {
        if(this.channel>100)
        {
            this.channel--;
        }
        else
        {
            System.out.println("There is no channel below the present one ");
        }
    }

    @Override
    public String toString() {
        return "Remote{" +
                "volume=" + volume +
                ", powerButton=" + powerButton +
                ", isMute=" + isMute +
                ", channel=" + channel +
                '}';
    }
}
