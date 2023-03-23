package com.careerit.day9;

public class Account
{
    //accNum,name,balance is class variables.
    String accNum;
    String name;
    double balance;
    String SSN;
    public void ShowDetails() {
        System.out.println("Acc.Number is : " + accNum);
        System.out.println("Name : " + name);
        System.out.println("balance : " + balance);
    }
    //This constructor is with three parameters
    public Account(String accNum,String Name,double balance)
    {
        this.accNum=accNum;
        this.name=name;
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


}
