package com.careerit.day14;

public class Account
{
    private int accNumber;
    private String name;
    private float balance;
    private static String bankName="SBI";
    //A constructor
    public Account(String name,float balance)
    {
        this.accNumber=AccNumberGenerator.generateAccNumber();
        this.name=name;
        this.balance=balance;
    }

    public int getAccNumber() {
        return accNumber;
    }

    public String getName() {
        return name;
    }

    public float getBalance() {
        return balance;
    }

    public static String getBankName() {
        return bankName;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accNumber=" + accNumber +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
    public float withdraw(float amount)
    {
        if(balance>amount)
        {
            this.balance-=amount;
        }
        return balance;
    }
    public float deposit(float amount)
    {
        this.balance+=amount;
        return balance;
    }
    public void ShowDetails()
    {
        System.out.println(String.format("%s %s %s %s",accNumber,name,balance,bankName));
    }
}
