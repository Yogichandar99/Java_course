package com.careerit.day17;

class Product
{
    //Declaring all the variables as final as one product will be having same properties all the time
    private final int id;
    private final String name;
    private final double price;
    private final double discount;

    public Product(int id, String name, double price, double discount)
    {
        this.id = id;
        this.name = name;
        this.price = price;
        this.discount = discount;
    }
    //It is required that price will change at times
    //Just changing the price of an item without making any modifications to other details.
    public Product changePrice(double newPrice)
    {
        return new Product(id, name, newPrice, discount);
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", discount=" + discount +
                '}';
    }
}

public class ChangeProductDetails
{
    public static void main(String[] args)
    {
        Product p=new Product(1,"iphone",45000,0);
        //Here we have assigned a value to change price but has not done change in actual product
        p.changePrice(95000);
        System.out.println(p.changePrice(95000));
        //The original price of product is printed as output.
        System.out.println(p);
        //This concept is also similar to string class
        //Inorder to reflect the changes we need to assign it as follows:
        p=p.changePrice(95000);
        System.out.println(p);
    }


}
