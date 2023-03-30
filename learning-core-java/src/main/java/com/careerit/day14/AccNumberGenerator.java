package com.careerit.day14;

public class AccNumberGenerator
{
        private static int startNum=1000;
        public static int getNewAccNumber()
        {
            return startNum++;
        }
}
