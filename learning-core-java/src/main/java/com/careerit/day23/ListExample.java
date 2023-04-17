package com.careerit.day23;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExample
{
    public static void main(String[] args)
    {
        //Empty declaration
        List<Integer> list=new ArrayList<>();
        //defining the list with predefined values
        //List allows duplicate elements
        //List is ordered collection
        //List retrieves the elements in the order we have stored.
        List<Integer> list1=List.of(1,2,3,4,5,6,1,2,4);
        //We can retrieve the data using traditional for loop
        for(int i=0;i<list1.size();i++)
        {
            System.out.print(list1.get(i)+" ");
        }
        System.out.println();
        //using enhanced for loop
        for(Integer ele:list1)
        {
            System.out.print(ele+" ");
        }
        System.out.println();
        //using Iterator or listIterator
        Iterator<Integer> ire=list1.iterator();
        while(ire.hasNext())
        System.out.print(ire.next()+" ");
        System.out.println();
        //we can even print the list using stream as well, These are mainly useful in optimisation
        //By using forEach we are accessing consumer interface, Which accepts one argument
        //The argument is printed using lambda function.
        list1.stream().forEach(ele->{
            System.out.print(ele+" ");
        });
        list.stream().forEach(ele-> System.out.println(ele));
        list.forEach(System.out::println);

    }
}
