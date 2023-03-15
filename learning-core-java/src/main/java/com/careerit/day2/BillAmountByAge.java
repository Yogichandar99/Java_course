package com.careerit.day2;
import java.util.Scanner;
public class BillAmountByAge {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("enter the Bill Amount");
        Float Bill_Amount=in.nextFloat();
        System.out.println("enter the age of customer");
        int age= in.nextInt();
        double discount=0.0f;
        double netamount=0.0f;
        if(age>=50){
            discount=Bill_Amount * 0.05;
            netamount=Bill_Amount-discount;
        }
        System.out.println("Bill Amount: "+Bill_Amount);
        System.out.println("Discount: "+discount);
        System.out.println("Net amount:"+netamount);
    }
}
