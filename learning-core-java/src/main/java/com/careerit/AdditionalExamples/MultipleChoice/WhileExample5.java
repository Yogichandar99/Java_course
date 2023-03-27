package com.careerit.AdditionalExamples.MultipleChoice;

public class WhileExample5
{
    public static void main(String[] args)
    {
        int i=0,j=10;
        do{
            i++;
            --j;
        }while(i<5);
        System.out.println(i+","+j);
    }
}
