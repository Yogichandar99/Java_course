package com.careerit.day19;

import java.util.ArrayList;
import java.util.List;

//Implementing a functional interface
interface MyPredicate1{
    public boolean test(Integer obj);
}

//Inorder to make this work we need to write a class
//Here we are passing the condition to execute
class TestCondition
{
    private List<Integer> ageList=List.of(24,54,76,78,53,23,35,45);
    public List<Integer> ageFilter(MyPredicate myPredicate)
    {
        List<Integer> filteredList=new ArrayList<>();
        for(int ele:ageList)
        {
            if(myPredicate.test(ele))
            {
                filteredList.add(ele);
            }
        }
        return filteredList;
    }
}

public class Manager1
{
    public static void main(String[] args)
    {
        //Accessing the test class by creating an object obj
        TestCondition obj=new TestCondition();
        //using lamda function
        List<Integer> list=obj.ageFilter((age)->age>=30 && age<=50);
        System.out.println(list);
    }
}
