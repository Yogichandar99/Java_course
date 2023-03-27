package com.careerit.AdditionalExamples.MultipleChoice;

public class IfExample2
{
    public static void main(String[] args)
    {
        boolean a,b=false;
        if(a=!(4==5)&&(b=true))  //a==not(false)=>True
        {
            System.out.print(a +" "); // as both the conditions are true value of a is printed i.e true.
        }
        if(a=true && b)
        {
            System.out.print(a);
        }
    }
}
