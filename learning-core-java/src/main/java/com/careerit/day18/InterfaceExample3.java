package com.careerit.day18;
import java.util.ArrayList;
import java.util.List;
interface NumberOperations
{
    //declaration of abstract methods
    boolean isPrime(int num);
    //Adding new methods/implementations to the Number Operations
    default List<Integer> PrimeInRange(int lb,int ub)
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
    //A new method to get the count of prime in the given range
    default int primeCount(int lb,int ub)
    {
        return PrimeInRange(lb,ub).size();
    }
    //A new private method to get n prime numbers
    private List<Integer> getPrimes(int n)
    {
        List<Integer> list=new ArrayList<>();
        int i=2;
        while(list.size()!=n)
        {
            if(isPrime(i))
            {
                list.add(i);
            }
            i++;
        }
        return list;
    }
    default List<Integer> prime(int n)
    {
        return getPrimes(n);
    }
    //Writing static methods in interface
    private static double power(int a,int b)
    {
        return Math.pow(a,b);
    }
    private static double powerCalc(int a,int b)
    {
        int fact=1;
        for(int i=1;i<=b;i++)
        {
            fact=fact*a;
        }
        return fact;
    }
}
class NumberOp implements NumberOperations
{
    //Inorder to make the class working you need to define all the abstract classes
    public boolean isPrime(int num)
    {
        if(num<2)
        {
            return false;
        }
        for(int i=2;i<num;i++)
        {
            if(num%i==0)
            return false;
        }
        return true;
    }
}
public class InterfaceExample3
{
    public static void main(String[] args)
    {
        //accessing one of the methods defined in interface
        //As we cannot create object for interface
        // creating an object for the class which implemented interface
        NumberOp obj=new NumberOp();
        int result=obj.primeCount(10,20);
        System.out.println(result);
        boolean result1=obj.isPrime(11);
        System.out.println(result1);

    }
}
