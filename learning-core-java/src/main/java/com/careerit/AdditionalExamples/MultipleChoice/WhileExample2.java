package com.careerit.AdditionalExamples.MultipleChoice;

public class WhileExample2
{
    public static void main(String[] args)
    {
        int i=0,j=10;
        while(i<j-i){
            i++;
            --j;
        }
        System.out.println(i+","+j);

    }
}
