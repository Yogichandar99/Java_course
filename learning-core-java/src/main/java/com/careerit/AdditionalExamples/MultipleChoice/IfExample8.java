package com.careerit.AdditionalExamples.MultipleChoice;

public class IfExample8
{
    public static void main(String[] args)
    {
        for(int i = 0; i < 2; i++)
        {
            for(int j = 2; j>= 0; j--)
            {
                if(i == j)
                    break;
                System.out.print(i + " "+j+ " ");
            }
        }

    }
}
