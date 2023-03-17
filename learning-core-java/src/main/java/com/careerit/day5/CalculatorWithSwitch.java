package com.careerit.day5;
import java.util.Scanner;

public class CalculatorWithSwitch
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter an option 1.Add 2.Subtraction 3.Multiply 4.Division 5.Modulo 6.Exit");
        int n=in.nextInt();
        System.out.println("enter number n1");
        int n1=in.nextInt();
        System.out.println("enter number n2");
        int n2=in.nextInt();
        int result=0;
        String operandName="";
        switch(n)
        {
            case 1:
                result=n1+n2;
                operandName="+";
                break;
            case 2:
                result=n1-n2;
                operandName="-";
                break;
            case 3:
                result=n1*n2;
                operandName="*";
                break;
            case 4:
                result=n1/n2;
                operandName="/";
                break;
            case 5:
                result=n1%n2;
                operandName="%";
                break;
            case 6:System.exit(0);
        }
        System.out.println(n1+" "+operandName+" "+n2+"="+result);
    }
}
