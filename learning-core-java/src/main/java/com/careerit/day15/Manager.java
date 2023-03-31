package com.careerit.day15;

//Product is the child class of object.
class Product extends Object{
    int pid;
    String name;
    double price;

    public Product(int pid, String name, double price)
    {
        this.pid = pid;
        this.name = name;
        this.price = price;
    }
    @Override
    public String toString()
    {
        return String.format("%s %s %s ",pid,name,price);
    }
}
public class Manager
{
    public static void main(String[] args)
    {
        Product product=new Product(1001,"iphone15",120000);
        //This gives error as there is no method in the name of ShowDetails()
        //product.ShowDetails();

        //The below code will not show any errors as they are part of object class
        // and every class inherits the properties of object class by default

        System.out.println(product.hashCode());
        //hashcode in hexadecimal format
        System.out.println(Integer.toHexString(product.hashCode()));
        //Gets the class name
        System.out.println(product.getClass());
        //Gets the hashcode of the object initially but as we have over
        System.out.println(product.toString());



    }


}
