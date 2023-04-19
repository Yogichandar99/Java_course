package com.careerit.service;

import com.careerit.domain.Wallet;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class WalletManager
{
    public static void main(String[] args)
    {
        System.out.println("--------Welcome to Wallet App-------");
        Scanner sc=new Scanner(System.in);
        //Creating a new walletService object for interface using the class walletServiceImpl
        // to access all the methods in the interface.
        WalletService walletService=new WalletServiceImpl();
        while(true)
        {
            System.out.println("-".repeat(100));
            System.out.println("1.Create 2.GetWallet 3.Get All wallets 4.Load Amount 5.Transfer Amount 6.Exit");
            System.out.println("-".repeat(100));
            int ch=sc.nextInt();
            //To skip the first line and empty spaces
            sc.nextLine();
            switch(ch)
            {
                case 1:
                    //Getting all the details
                    Wallet newwallet=getInputWallet();
                    //passing all the details to createWallet method
                    walletService.createWallet(newwallet);
                    System.out.println("wallet created with id: "+newwallet.getId());
                    break;
                case 2:
                    System.out.println("enter the mobile number");
                    String mobileIn=sc.nextLine();
                    Optional<Wallet> opt=walletService.getWallet(mobileIn);
                    if(opt.isPresent())
                    {
                        showWalletDetails(opt.get());
                    }
                    else{
                        System.out.println("Wallet is not found with the given mobile num: "+mobileIn);
                    }
                    break;
                case 3:
                    List<Wallet> walletList=walletService.getAllWallets();
                    if(walletList.isEmpty())
                    {
                        System.out.println("no wallet created yet.. create one");
                    }
                    else
                    {
                        for(Wallet wallet1:walletList)
                        {
                            showWalletDetails(wallet1);
                            System.out.println("-".repeat(100));
                        }
                    }
                    break;
                case 4:
                    System.out.println("Enter mobile number: ");
                    String toAddMoneyMobile = sc.nextLine();
                    System.out.println("Enter amount to be added: ");
                    double addAmount = sc.nextDouble();
                    Optional<Wallet> addMoneyWallet = walletService.loadAmount(toAddMoneyMobile,addAmount);
                    if (addMoneyWallet.isPresent())
                    {
                        showWalletDetails(addMoneyWallet.get());
                    }
                    else
                    {
                        System.out.println("Wallet not found");
                    }
                    break;
                case 5:
                    System.out.println("enter the from mobile number");
                    String fromMobile=sc.nextLine();
                    System.out.println("enter to mobile: ");
                    String toMobile=sc.nextLine();
                    System.out.println("enter the amount: ");
                    double trAmount=sc.nextDouble();
                    boolean isSuccess= walletService.transferAmount(fromMobile,toMobile,trAmount);
                    if(isSuccess)
                    {
                        System.out.println(String.format("the amount %s is transferred from %s to %s",trAmount,fromMobile,toMobile));
                    }
                    else {
                        System.out.println("please verify from and to mobile numbers and check balance as well");
                    }
                    break;
                case 6:
                    System.out.println("Thanks for using wallet app");
                    System.exit(0);
            }
        }
    }

    private static void showWalletDetails(Wallet wallet)
    {
        System.out.println(String.format("mobile num %s name %s and balance %s",wallet.getMobile(),wallet.getName(),wallet.getBalance()));
    }

    public static Wallet getInputWallet()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter mobile number");
        String mobileNumber=sc.nextLine();
        System.out.println("enter name");
        String name=sc.nextLine();
        System.out.println("enter amount");
        double amount=sc.nextDouble();
        return Wallet.builder()
                .mobile(mobileNumber)
                .name(name)
                .balance(amount)
                .build();
    }
}
