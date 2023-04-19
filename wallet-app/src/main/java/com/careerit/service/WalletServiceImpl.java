package com.careerit.service;

import com.careerit.domain.Wallet;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;


public class WalletServiceImpl implements WalletService
{
    //Creating a list to store all the wallets
    private List<Wallet> wallets=new ArrayList<>();
    @Override
    public Optional<Wallet> createWallet(Wallet wallet)
    {
        //Initially we are passing mobile,name,amount as wallet object
        //Checking whether already mobile number exists or not
        //if not creates an account
        Optional<Wallet> optWallet=getWallet(wallet.getMobile());
        //If mobile is already present
        if(optWallet.isPresent())
        {
            //return optional of empty
            return Optional.empty();
        }
        //else if mobile doesn't exist we are creating a random id
        long id= ThreadLocalRandom.current().nextLong(1000,9999);
        //setting the id
        wallet.setId(id);
        //passing the values obtained into wallets list
        wallets.add(wallet);
        //returning the entered value
        return Optional.of(wallet);
    }

    @Override
    public Optional<Wallet> getWallet(String mobile)
    {
        //initially setting it as empty wallet
        Optional<Wallet> optional=Optional.empty();
        //looping over all the wallets
        for(Wallet w:wallets)
        {
            //if any of the wallet is equal to the input mobile number
            if(w.getMobile().equals(mobile))
            {
                //we will return the details of wallet
                return Optional.of(w);
            }
        }
        //else writes empty
        return Optional.empty();
    }
    @Override
    public List<Wallet> getAllWallets()
    {
        return wallets;
    }
    @Override
    public Optional<Wallet> loadAmount(String mobile,double amount)
    {
        Optional<Wallet> optWallet=getWallet(mobile);
        if(optWallet.isPresent())
        {
            Wallet wallet=optWallet.get();
            wallet.setBalance(wallet.getBalance()+amount);
            return Optional.of(wallet);
        }
        return Optional.empty();
    }
    @Override
    public boolean transferAmount(String fromMobile, String toMobile, double amount)
    {
        Optional<Wallet> optFromWallet=getWallet(fromMobile);
        Optional<Wallet> optToWallet=getWallet(toMobile);
        if(optFromWallet.isPresent() && optToWallet.isPresent())
        {
            Wallet fromWallet=optFromWallet.get();
            Wallet toWallet=optToWallet.get();
            fromWallet.setBalance(fromWallet.getBalance()-amount);
            toWallet.setBalance(toWallet.getBalance()+amount);
            return true;
        }
        return false;
    }
}
