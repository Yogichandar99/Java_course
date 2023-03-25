package com.careerit.day10;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import com.careerit.day10.Product;

public class ProductManager {
    public static void main(String[] args)
    {
        //Creating an object for product class to access its methods
        List<Product> products = getProducts();
        for (Product product : products) {
            product.showDetails();
        }
        double maxOfList=maxPrice(products);
        System.out.println(String.format("Maximum price in the given list is %s",maxOfList));
        List<Product> maxPricedItems=maxPricedProducts(products);
        // Doubt: How to convert this hashcode into understandable format?
        System.out.println(maxPricedItems);
        //call sort by price method

    }

    //This method is to generate the products
    private static List<Product> getProducts()
    {
        //Created a list of type Product
        List<Product> list = new ArrayList<>();
        for(int i=0;i<=10;i++)
        {
            //Doubt: How to generate unique id using ThreadLocal? and how to make it constant;
            final int id= ThreadLocalRandom.current().nextInt(1,10);
            String pname="product_"+id;
            final double price=ThreadLocalRandom.current().nextDouble(5000,50000);
            //creating new object p1 of Product type
            Product p1=new Product(id,pname,price);
            //adding the object to list
            list.add(p1);
        }
        return list;
    }
    //This method is used to calculate the maximum price.
    private static double maxPrice(List<Product> list)
    {
        //initially initialised with first element in the list
        //getter method to obtain the price
        double max=list.get(0).getPrice();
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i).getPrice()>max)
            {
                max=list.get(i).getPrice();
            }
        }
       return max;
    }
    //This method writes all the products with maximum price
    //obtains max price from maxPrice method and compares the values
    //All the results are stored in Arraylist
    private static List<Product> maxPricedProducts(List<Product> list)
    {
        //max obtains the maximum price using maxPrice function
        double max=maxPrice(list);
        //Creating a new list with product type to store the results
        List<Product> maxPricedItems=new ArrayList<>();

        for(int i=0;i< list.size();i++)
        {
            if(list.get(i).getPrice()==max)
            {
                //Why it was not appending?
                maxPricedItems.add(list.get(i));
            }
        }
        return maxPricedItems;
    }

    private void applyDiscount(List<Product> list,int percentage)
    {
        double updatedPrice;
        for(int i=0;i< list.size();i++)
        {
            if(list.get(i).getPrice()>5000)
            {
                list.get(i).discount(percentage);
                //Doubt: How to set a value using setter?
                //list.get(i).setPrice();
            }
        }
    }


    private void sortByPrice(List<Product> list)
    {
        list.sort(Comparator.comparing(Product::getPrice));
    }
}
