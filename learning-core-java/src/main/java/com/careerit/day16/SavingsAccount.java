package com.careerit.day16;

public class SavingsAccount extends Account
{
    float minBalance;
    public SavingsAccount(long accNum,String name,double balance,double minBalance)
    {
        super(accNum,name,balance);
        this.balance=minBalance;
    }
    @Override
    public double withdraw(double amount) {
        if (balance >= (amount - minBalance)) {
            this.balance -= amount;
        } else {
            System.out.println("Sorry! you don't have enough funds");
        }
        return this.balance;
    }
}
