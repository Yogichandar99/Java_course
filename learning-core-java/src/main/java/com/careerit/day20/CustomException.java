package com.careerit.day20;

//Here we are extending Exception class i.e checked exceptions
public class CustomException extends Exception
{
    public CustomException(String message)
    {
        super(message);
    }

}
