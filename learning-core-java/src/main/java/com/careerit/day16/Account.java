package com.careerit.day16;

public class Account
{
   public long accNumber;
    String name;
    double balance;

    public Account(long accNumber, String name, double balance) {
        this.accNumber = accNumber;
        this.name = name;
        this.balance = balance;
    }

    public long getAccNum()
    {
        return accNumber;
    }
    public double withdraw(double amount)
    {
        if(this.balance>amount)
        {
            this.balance-=amount;
        }
        else
        {
            System.out.println("You don't have sufficient balance in your account");
        }
        return this.balance;
    }
    public double deposit(double amount)
    {
        return this.balance+=amount;
    }
    public void showDetails()
    {
        System.out.println(String.format("Hi %s your account %s has %s balance",name,accNumber,balance));
    }
}
