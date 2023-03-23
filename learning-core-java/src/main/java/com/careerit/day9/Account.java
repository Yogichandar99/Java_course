package com.careerit.day9;

public class Account
{
    //accNum,name,balance is class variables.
    String accNum;
    String name;
    double balance;
    String SSN;
    public void ShowDetails() {
        System.out.println("Acc.Number is : " + MaskAccountNumber(accNum));
        System.out.println("Name : " + name);
        System.out.println("balance : " + balance);
    }
    //This constructor is with three parameters
    public Account(String accNum,String Name,double balance)
    {
        this.accNum=accNum;
        this.name=Name;
        this.balance=balance;
    }
    //This constructor is with four parameters
    public Account(String accNum,String Name,double balance,String SSN)
    {
        this(accNum,Name,balance);
        this.SSN=SSN;
    }
    private String MaskAccountNumber(String accNum)
    {
        if(accNum!=null &&accNum.length()>4)
        {
            return "*******"+accNum.substring(accNum.length()-4);
        }
        return accNum;
    }
    public void deposit(double amount)
    {
        balance+=amount;
        System.out.println("hi "+name+ " you have deposited an amount of "+amount+ "updated balance is "+balance);
    }
    public void withdraw(double amount)
    {
        if(balance>=amount)
        {
            balance=balance-amount;
            System.out.println("you are have withdrawn an amount of"+amount+" and updated balance is "+balance);
        }
        else{
            System.out.println("insufficient balance in your account "+MaskAccountNumber(accNum));
        }
    }


}
