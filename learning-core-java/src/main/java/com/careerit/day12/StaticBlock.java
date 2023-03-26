package com.careerit.day12;

public class StaticBlock
{
    //static blocks are executed while loading class itself by JVM
    //A class can have multiple static blocks
    //these blocks are executed first
    //Regard less of number of objects static block has they are only printed once.
    //outputs are printed like one,Two and then main Method.
    //static blocks are used to any operations/Initializations
    static
    {
        System.out.println("one");
    }
    public static void main(String[] args)
    {
        System.out.println("Main method");
    }
    static
    {
        System.out.println("Two");
    }
}
