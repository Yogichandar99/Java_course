package com.careerit.day21;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.ThreadLocalRandom;

public class ListExample2
{
    public static void main(String[] args) {
        //generate 20 random numbers and store it in container(list)
        List<Integer> list=new ArrayList<>();
        for(int i=1;i<=20;i++)
        {
            int num= ThreadLocalRandom.current().nextInt(1,100);
            list.add(num);
        }
        //displaying the list
        //can be done by traditional for loop or for each loop
        //It can also be done by iterator concept
        for(int i=0;i< list.size();i++)
        {
            System.out.println(list.get(i));
        }
        for(int ele:list)
        {
            System.out.println(ele);
        }
        //using Iterator
        //Iterator<Integer> is iterator interface with iterator name "iterator"
        //We are accessing using list.iterator method
        //iterator has methods has,hasNext,remove and forEachRemaining
        System.out.println("using iterator");
        Iterator<Integer> iterator=list.iterator();
        //initially prints all the list elements
        System.out.println(list);
        //when iterator has next element
        while(iterator.hasNext())
        {
            //fetching the next element
            int num=iterator.next();
            //removing even numbers in the list
            if(num%2==0)
            {
                iterator.remove();
            }

        }
        System.out.println("list after removing even elements");
        System.out.println(list);
        //iterator can traverse only in forward direction,for bi direction we can use ListIterator
        //creating a listIterator type
        Iterator<Integer> listItr=list.listIterator();
        System.out.println("printing using list Iterator");
        System.out.println(list);
        while(((ListIterator<Integer>) listItr).hasPrevious())
        {
            int num1= ((ListIterator) listItr).previousIndex();
            if(num1%2!=0)
            {
                list.remove(num1);
            }
        }
        //Should print an empty list.
        System.out.println(list);
    }
}
