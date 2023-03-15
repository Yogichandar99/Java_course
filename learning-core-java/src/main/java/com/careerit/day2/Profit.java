package com.careerit.day2;
import java.util.Scanner;
public class Profit {
    public static void main(String args[])
    {
        float cost_price,selling_price,profit;
        Scanner in=new Scanner(System.in);
        System.out.println("enter the costprice: ");
        cost_price=in.nextFloat();
        System.out.println("enter the selling price");
        selling_price=in.nextFloat();
        if(selling_price>cost_price)
        {
            //System.out.println("seller made profit");
            profit=selling_price-cost_price;
            System.out.println("seller made profit: "+profit);
        }
        else{
            System.out.println("seller had loss of: " +(cost_price-selling_price));
        }
    }
}
