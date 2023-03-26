package com.careerit.day12;

public class CommandLineArguments
{
    public static void main(String[] args)
    {
        //Initially it prints zero arguments.
        System.out.println(args.length);
        int studentId=Integer.parseInt(args[0]);
        String name=args[1];
        String role=args[2];
        System.out.println("Id: "+studentId);
        System.out.println("Name: "+name);
        System.out.println("Role: "+role);
    }
}
