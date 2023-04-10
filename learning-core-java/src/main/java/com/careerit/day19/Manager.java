package com.careerit.day19;

import java.util.ArrayList;
import java.util.List;

//Implementing a functional interface
interface MyPredicate{
    public boolean test(Integer obj);
}

//Inorder to make this function work we need to create a class
//Initially we created a class UserDetails
//Inorder to make Mypredicate interface woriking we need to write class as shown below
//We can implement it without creating a class by using anonymous function
class AgeAbove50 implements MyPredicate{
    @Override
    public boolean test(Integer age) {
        return age>50;
    }
}

class AgeBetween implements MyPredicate{
    @Override
    public boolean test(Integer age) {
        return age>30 && age<50;
    }
}

//Creating a random class UserDetails to perform certain operations
//Such as printing all the employees whose age is greater than,less than and between an area
class UserDetails
{
    private List<Integer> ageList=List.of(24,54,76,78,53,23,35,45);
    //Writing a method to get a list of ages from user ageList with age>50
    public List<Integer> ageBetween(int lb,int ub)
    {
        //taking an empty list to store all the values
        List<Integer> filteredList=new ArrayList<>();
        for(int age:ageList)
        {
            if(age>=lb && age<=ub)
            {
                filteredList.add(age);
            }
        }
        return filteredList;
    }
    //If we want to check on a different condition we can implement it as follows:
    public List<Integer> ageGte(int Gage)
    {
        //taking an empty list to store all the values
        List<Integer> filteredList=new ArrayList<>();
        for(int age:ageList)
        {
            if(age>=Gage)
            {
                filteredList.add(age);
            }
        }
        return filteredList;
    }
    public List<Integer> ageLte(int Lage)
    {
        //taking an empty list to store all the values
        List<Integer> filteredList=new ArrayList<>();
        for(int age:ageList)
        {
            if(age>=Lage)
            {
                filteredList.add(age);
            }
        }
        return filteredList;
    }
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



public class Manager
{
    public static void main(String[] args) {
        UserDetails obj=new UserDetails();
        System.out.println(obj.ageBetween(40,50));
        System.out.println(obj.ageLte(45));
        System.out.println(obj.ageGte(55));
        MyPredicate obj1=new MyPredicate() {
            @Override
            public boolean test(Integer age) {
                return age>=30 && age<=50;
            }
        };
        AgeAbove50 obj2=new AgeAbove50();
        System.out.println(obj2.test(66));
        //we can implement an anonymous class by Creating an object
        MyPredicate object=new MyPredicate(){
            @Override
            public boolean test(Integer age)
            {
                return age>=30 && age<=50;
            }
        };
        //This predicate interface object can be passed to list
        //we are passing the MyPredicate object with condition
        List<Integer> list=obj.ageFilter(object);
        System.out.println(list);

    }
}
