package com.careerit.day14;
import java.util.Scanner;

public class AccountManager
{
    public static void main(String[] args)
    {
        AccountService service=new AccountService();
        Scanner in=new Scanner(System.in);
        while(true)
        {
            System.out.println("1.Create 2.Deposit 3.Withdraw 4.ShowDetails 5.ShowAllAccounts 6.Exit");
            System.out.println("Enter an option: ");
            int ch=in.nextInt();
            switch(ch)
            {
                case 1:
                    in.nextLine();
                    System.out.println("enter accName");
                    String AccName=in.nextLine();
                    System.out.println("Enter the balance with which you want to open the account");
                    float inBalance=in.nextFloat();
                    service.createAccount(AccName,inBalance);
                    break;
                case 2:
                    System.out.println("Enter accNum: ");
                    int accNum=in.nextInt();
                    in.nextLine();
                    System.out.println("Enter the amount you want to deposit: ");
                    float amt=in.nextFloat();
                    service.deposit(accNum,amt);
                    break;
                case 3:
                    System.out.println("Enter accNum");
                    accNum=in.nextInt();
                    amt=in.nextFloat();
                    service.withdraw(accNum,amt);
                    break;
                case 4:
                    System.out.println("enter the account number: ");
                    accNum=in.nextInt();
                    service.ShowDetails(accNum);
                    break;
                case 5:
                    service.ShowAllDetails();
                case 6:
                    System.out.println("Thanks for using my application!");
                    System.exit(0);
                default:
                    System.out.println("Enter a choice between 1-5");
                    break;
            }
            System.out.println("Do you want to continue if yes press 1");
            int c=in.nextInt();
            if(c!=1)
            {
                break;
            }
        }
    }
}
