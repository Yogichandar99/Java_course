package com.careerit.day10;

public class Product
{
    private int pid;
    private String name;
    private double price;

    public Product(int pid, String name, double price) {
        this.pid = pid;
        this.name = name;
        this.price = price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPid() {
        return pid;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
    public void discount(int percentage)
    {
        price=price-(price*percentage/(100));
    }
    public void showDetails()
    {
        System.out.println("Product id :"+pid);
        System.out.println("Product name: "+name);
        System.out.println("Price: "+price);
    }

    @Override
    public String toString() {
        return "Product{" +
                "pid=" + pid +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
