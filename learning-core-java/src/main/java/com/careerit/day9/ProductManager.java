package com.careerit.day9;

public class ProductManager
{
    public static void main(String[] args)
    {
        //Creating 10 products
        Product p1=new Product(1,"Television",25000);
        p1.showDetails();
        Product p2=new Product(2,"Refrigirator",20000);
        Product p3=new Product(3,"Air conditioner",15000);
        Product p4=new Product(4,"Amplifier",1500);
        Product p5=new Product(5,"Inverter",1000);
        Product p6=new Product(6,"Voltage converter",1200);
        Product p7=new Product(7,"File",110);
        Product p8=new Product(8,"Board",100);
        Product p9=new Product(9,"Sofa",10000);
        Product p10=new Product(10,"Chairs",200);
        p1.discount();
        p2.discount();
        p3.discount();
        p4.discount();
        p5.discount();
        p6.discount();
        p7.discount();
        p8.discount();
        p9.discount();
        p10.discount();


    }
}
