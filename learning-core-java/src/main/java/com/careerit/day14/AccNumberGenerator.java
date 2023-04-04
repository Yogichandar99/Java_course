package com.careerit.day14;

public class AccNumberGenerator
{
    private static int startNum=1001;
    public static int generateAccNumber()
    {
        return startNum++;
    }
}
