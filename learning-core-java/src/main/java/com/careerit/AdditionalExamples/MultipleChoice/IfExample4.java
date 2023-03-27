package com.careerit.AdditionalExamples.MultipleChoice;

public class IfExample4
{
    void showResult()
    {
        boolean a=false,b=false,c=true;
        if(a & (b=true) & (c=false));
        System.out.println(a+" "+b+" "+c);
    }
}
