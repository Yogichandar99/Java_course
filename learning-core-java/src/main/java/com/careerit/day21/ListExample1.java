package com.careerit.day21;

import java.util.ArrayList;
import java.util.List;

public class ListExample1
{
    public static void main(String[] args)
    {
        List<Integer> list=new ArrayList<>();
        list.add(1001);
        list.add(1005);
        list.add(1008);
        list.add(1010);
        //list will allow duplicate elements
        list.add(1010);
        //List can allow any number of null values
        //list is ordered collection
        //printing the size of list
        System.out.println(list.size());
        //Retrieving the list using for loop
        for(int i=0;i< list.size();i++)
        {
            System.out.println(list.get(i));
        }
        System.out.println();
        //retrieving using for each loop
        for(int ele:list)
        {
            System.out.println(ele);
        }
        //two times list is printed using traditional for loop and for each loop
        //traditional for loop is used to get elements based on some condition
        //for each is used to get all the elements in the list.


    }


}
