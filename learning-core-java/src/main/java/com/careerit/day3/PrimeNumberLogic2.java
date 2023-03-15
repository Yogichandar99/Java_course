package com.careerit.day3;
import java.util.Scanner;

public class PrimeNumberLogic2
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number");
        int n = in.nextInt();
        boolean flag = false;
        for (int i = 2; i <= n / 2; ++i) {
            // condition for nonprime number
            if (n % i == 0) {
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("Not a prime");
        }
        else {
            System.out.println("prime");
        }
    }

}
