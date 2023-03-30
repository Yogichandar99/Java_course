package com.careerit.day14;

import java.util.ArrayList;
import java.util.List;

public class AccountService
{
    private List<Account> accList;
    //Everytime we create a new object that is stored in accList
    public AccountService()
    {
        accList = new ArrayList<>();
    }
    public void createAccount(String name,float balance)
    {
        Account account=new Account(name,balance);
        accList.add(account);
        System.out.println("Account created with accNum"+ AccNumberGenerator.getNewAccNumber());
    }
    public void withdraw(int accNum,float amount)
    {
        Account account=getAccount(accNum);
        if(account!=null)
        {
            float updatedBalance=account.withdraw(amount);
            System.out.println(String.format("Account %s has balance %s",accNum,updatedBalance));
        }
        else
        {
            System.out.println("Account doesn't exist");
        }
    }
    public void deposit(int accNum,float amount)
    {
        Account account=getAccount(accNum);
        if(account!=null)
        {
            float newBalance=account.deposit(amount);
            System.out.println(String.format("accNum %s has %s balance ",accNum,newBalance));
        }
        else
        {
            System.out.println("The given account number is not a valid account");
        }
    }
    public void ShowDetails(int accNum)
    {
        Account account=getAccount(accNum);
        if(account!=null)
        {
            account.showDetails();
        }
    }
    private Account getAccount(int accNum)
    {
        for(Account acc:accList)
        {
            if(acc.getAccNum()==accNum)
            {
                return acc;
            }
        }
        return null;
    }
    public List<Account> ShowAllDetails()
    {
        return accList;
    }
}
