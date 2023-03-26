package com.careerit.day12;

import java.util.concurrent.ThreadLocalRandom;

//In a class only one class should be public.
//product had private members pid,name,price.
class Product{
    private String pid;
    private String name;
    private double price;
    //count is declared static so that as the file is loaded memory is initiated and the variable
    // belongs to the class itself rather than to any specific instance of the class.
    // This means that there is only one copy of the variable in memory,
    // regardless of how many instances of the class are created.
    private static int count=0;
    //If it is not created as static,everytime we create an object count values remains 0 at starting
    public Product(String pid, String name, double price)
    {
        this.pid = pid;
        this.name = name;
        this.price = price;
        count=count+1;
    }
    public static int getCount()
    {
        return count;
    }
}

public class ProductManager
{
    public static void main(String[] args)
    {
        for(int i=1;i< ThreadLocalRandom.current().nextInt(1,11);i++)
        {
            //we are creating multiple objects based on the input range generated.
            Product obj=new Product("p_000"+i,"product_"+i,i*3000);
        }
        System.out.println(Product.getCount());
    }

}
