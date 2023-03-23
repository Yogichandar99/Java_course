package com.careerit.day9;

public class Product
{
    long productId;
    String pname;
    double price;
    public Product(long productId, String pname, double price)
    {
        this.productId = productId;
        this.pname = pname;
        this.price = price;
    }
    public void showDetails()
    {
        System.out.println("Product ID: "+productId);
        System.out.println("product name: "+pname);
        System.out.println("price :" +price);
    }
    public double discount()
    {
        this.price=price;
        double temp=price;
        double discount=0;
        double net_price=price;
        if(price>5000)
        {
            discount=0.1*price;
            net_price=price-discount;
            price=net_price;
        }
        System.out.println("Price of given product "+temp+" Discount "+discount+" and net price: "+net_price);
        showDetails();
        return discount;
    }


}
