package com.careerit.AdditionalExamples;
import java.util.Scanner;
public class DenominationCalculator
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the number: ");
        int n= in.nextInt();
        int tcount=0,hcount=0,tencount=0,ocount=0;
        int temp=n;
        int r1,r2,r3;
        //int n=in.nextInt();
            tcount=n/1000;
            r1=n%1000;
            hcount=r1/100;
            r2=r1%100;
            tencount=r2/10;
            r3=r2%10;
            ocount=r3;
        System.out.println("given number is "+temp);
        System.out.println(" Thousand count "+tcount);
        System.out.println(" Hundred's count "+hcount);
        System.out.println(" Ten's count "+tencount);
        System.out.println(" one's count "+ocount);
    }
}
