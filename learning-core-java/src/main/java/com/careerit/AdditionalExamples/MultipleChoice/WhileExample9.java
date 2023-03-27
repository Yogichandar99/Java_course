package com.careerit.AdditionalExamples.MultipleChoice;

public class WhileExample9
{
    public static void main(String[] args)
    {
        int i=3;
        while(2<3){
            if(i<2)
                break;
            System.out.print(i--+" ");
            //output will be 3 2 as post increment is given.
        }

    }
}
