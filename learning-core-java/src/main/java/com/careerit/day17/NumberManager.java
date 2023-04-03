package com.careerit.day17;
import java.util.ArrayList;
import java.util.List;
//An abstract class is the one with zero or more abstract methods
abstract class NumberOperations
{
    public List<Integer> generatePrime(int lb,int ub)
    {
        List<Integer> list=new ArrayList<>();
        for(int i=lb;i<=ub;i++)
        {
            if(isPrime(i))
            {
                list.add(i);
            }
        }
       return list;
    }
    //We are defining one abstract method to check prime
    //Abstract method is the one without any method definition
    abstract boolean isPrime(int num);
}
//Defining the isPrime logic in subclass
class MyPrimeGenerator extends NumberOperations
{
    @Override
    boolean isPrime(int num)
    {
        if(num<2)
        {
            return false;
        }
        for(int i=2;i<num;i++)
        {
            if(num%i==0)
            {
                return false;
            }
        }
        return true;
    }

}
public class NumberManager
{
    public static void main(String[] args)
    {
        //As we cannot create an object for Number operations we created a object type of NumberOperations
        // Which can hold the MyPrimeGenerator type objects
        //Abstract classes will not have objects
        //This method is accessing concreate methods using subclass objects.
        NumberOperations obj=new MyPrimeGenerator();
        List<Integer> primeList=obj.generatePrime(10,20);
        System.out.println(primeList);
    }

}
