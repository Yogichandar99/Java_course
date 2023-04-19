package com.careerit.service;

import com.careerit.domain.Wallet;

import java.util.List;
import java.util.Optional;

public interface WalletService
{
    //To create a wallet we are passing a wallet type object
    Optional<Wallet> createWallet(Wallet wallet);
    //Passing the mobile number to get the wallet details
    Optional<Wallet> getWallet(String mobile);
    //To get all the wallet information
    List<Wallet> getAllWallets();
    //To load amount into wallet
    Optional<Wallet> loadAmount(String mobile,double amount);
    //To transfer the amount from one account to other
    boolean transferAmount(String fromMobile,String toMobile,double amount);

}
