package com.careerit.day21;

import java.util.ArrayList;
import java.util.List;

public class ListExample3
{
    public static void main(String[] args) {
        List<Integer> list1=new ArrayList<>();
        list1.add(3);
        list1.add(5);
        list1.add(7);
        List<Integer> list2=new ArrayList<>();
        list2.add(2);
        list2.add(4);
        list2.add(6);
        list2.add(8);
        //Adding both list 1 and list 2 to list 3
        List<Integer> list3=new ArrayList<>();
        list3.addAll(list1);
        list3.addAll(list2);
        System.out.println(list3);
        //To check whether an item is present in list or not
        //to check whether 3 is present or not
        System.out.println(list3.contains(3));
        //To check all the elements of list 1 are present in list 3 or not
        System.out.println(list3.containsAll(list1));
        //sublist
        System.out.println(list3.subList(2,5));
        //to check empty value or not
        System.out.println(list3.isEmpty());
        //removes 3 rd index
        System.out.println(list3.remove(3));
        //removes number 3 in the list
        System.out.println(list3.remove(Integer.valueOf(3)));
    }
}
