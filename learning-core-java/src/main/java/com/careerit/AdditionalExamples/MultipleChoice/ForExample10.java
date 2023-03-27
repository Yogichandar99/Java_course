package com.careerit.AdditionalExamples.MultipleChoice;

public class ForExample10
{
    public static void main(String[] args)
    {
        int i, j, k, l, count = 0;
        for (i = 1; i <= 3; i++)
        {
            count++;
            for (j = 1; j <= 3 - i; j++)
                count++;
            for (k = 1; k <= i; k++)
            {
                count++;
                break;
            }
            for (l = k - 2; l >= 1; l--)
                count++;
        }
        System.out.println(count);

    }
}
