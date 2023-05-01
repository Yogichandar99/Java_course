package com.careerit.enumExamples;

public class TShirtManager
{
    //Here in  the TShirtManger If we are using enum, only the values specified in Enum are allowed for usage
    //Enums are used for error less environment
    TShirtSize tShirtSize=TShirtSize.L;
    //The below code throws error as something was not part of enum
    //TShirtSize tShirtSize1=TShirtSize.something;

}
