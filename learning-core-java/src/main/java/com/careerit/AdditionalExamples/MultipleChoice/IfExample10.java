package com.careerit.AdditionalExamples.MultipleChoice;

public class IfExample10
{
    public static void main(String[] args)
    {
        int count = 0;
        for (int i = 0; i < 5; i++)
        {
            for (int j = 2; j >= 0 ; j--, count++)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
