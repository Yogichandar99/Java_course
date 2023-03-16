package com.careerit.day4;
import java.util.Scanner;

public class PrimeNumberGenerator
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter lower bound");
        int lb = in.nextInt();
        System.out.println("Enter higher limit");
        int ub = in.nextInt();
        for (int i = lb; i <= ub; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
    static boolean isPrime (int n)
    {
        // 0, 1 negative numbers are not prime
        if (n < 2)
            return false;

        // checking the number of divisors b/w 1 and the number n-1
        for (int i = 2; i <n; i++)
        {
            if (n % i == 0)
                return false;
        }

        // if reached here then must be true
        return true;
    }
    }
