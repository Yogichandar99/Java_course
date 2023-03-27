package com.careerit.AdditionalExamples.MultipleChoice;

public class WhileExample7
{
    public static void main(String[] args)
    {
        int i = 2, sum = 0;
        while (true) {
            if (i % 2 == 0) {
                sum += i;
            }
            i++;
            if(sum>9)
                break;
        }
        //Final output 12.
        System.out.println(sum);

    }
}
