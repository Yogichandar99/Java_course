package com.careerit.day14;

public class Account
{
    private int accNum;
    private String name;
    private float balance;
    private static String bankName="SBI";

    public Account(String name, float balance)
    {
        this.accNum =AccNumberGenerator.getNewAccNumber();
        this.name = name;
        this.balance = balance;
    }

    //As all the values are set to default we need to make accNum public so that it will be accessible
    //The above operation can be done using getter method

    public int getAccNum()
    {
        return accNum;
    }
    public float withdraw(float amount)
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
    public float deposit(float amount)
    {
        return this.balance+=amount;
    }
    public void showDetails()
    {
        System.out.println(String.format("Hi %s your account %s at %s has %s balance",name,accNum,bankName,balance));
    }
}
