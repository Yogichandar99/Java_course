package com.careerit.day2;
import java.util.Scanner;

public class TotalBillByBillamount {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the bill amount");
        float Bill_Amount=in.nextFloat();
        float discount=0.0f;
        float netamount=0.0f;
        if(Bill_Amount>=10000){
            discount=Bill_Amount * 0.1f;
            netamount=Bill_Amount-discount;
        }
        System.out.println("Bill Amount: "+Bill_Amount);
        System.out.println("Discount: "+discount);
        System.out.println("Net amount: "+netamount);
    }
}

