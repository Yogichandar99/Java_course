package com.careerit.day10;
import com.careerit.day6.GeneratePrimenumbersArray;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeOperationList
{

    //List of prime numbers in given range
    public List<Integer> generatePrime(int lb,int ub)
    {
        List<Integer> primeList=new ArrayList<>();
        for(int i=lb;i<=ub;i++)
        {
            if(isprime(i))
            {
                primeList.add(i);
            }
        }
        return primeList;
    }
    //Generate n prime numbers as a list
    public List<Integer> generatePrime(int n)
    {
        //creating new list
        List<Integer> PrimeListN=new ArrayList<>();
        int i=2;
        while(PrimeListN.size()!=n)
        {
            if(isprime(i))
            {
                PrimeListN.add(i);
            }
            i++;
        }
        return PrimeListN;
    }

    //prime logic
    private boolean isprime(int num)
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
