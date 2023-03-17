package com.careerit.day5;
import java.util.Scanner;

public class BillAmountCalculation
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the billAmount");
        float BillAmount=in.nextFloat();
        System.out.println("Enter the day name(mon,tue,wed,thu,fri,sat,sun)");
        String DayName=in.next();
        float discount=0;
        switch(DayName)
        {
            case "sat":
            case "sun":
                discount=-BillAmount*0.10f;
                break;
            case "mon":
            case "thu":
            case "wed":
                discount=BillAmount*0.05f;
                break;
            case "tue":
                discount=BillAmount*0.20f;
                break;
            case "fri":
                discount=BillAmount*0.10f;
                break;
            default:
                System.out.println("Enter valid day name which should be matching as follows(mon,tue,wed,thu,fri,sat,sun)");

        }
        float netAmount=BillAmount-discount;
        System.out.println("BillAmount: "+BillAmount);
        System.out.println("Discount: "+discount);
        System.out.println("NetAmount: "+netAmount);

    }

}
