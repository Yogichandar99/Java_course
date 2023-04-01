package com.careerit.day16;

public class AccountManager
{
    public static void main(String[] args) {


        Account[] arr = getAccounts();

        int ccount = 0;
        int scount = 0;
        for (Account acc : arr) {
            if (acc instanceof CurrentAccount)
            {
                CurrentAccount obj = (CurrentAccount) acc;
                ccount++;
                obj.showMoreDetails();
            } else if (acc instanceof SavingsAccount)
            {
                SavingsAccount obj = (SavingsAccount) acc;
                scount++;
                obj.showDetails();
            }
        }
        System.out.println(ccount + " " + scount);

    }

    public static Account[] getAccounts() {
        SavingsAccount acc1 = new SavingsAccount(1001L, "Krish", 3000, 500);
        SavingsAccount acc2 = new SavingsAccount(1002L, "Manoj", 6000, 500);
        SavingsAccount acc3 = new SavingsAccount(1003L, "Charan", 7000, 500);
        SavingsAccount acc4 = new SavingsAccount(1004L, "Rajesh", 8000, 500);

        CurrentAccount acc5 = new CurrentAccount(9901L, "XYZ.com", 60000, 10000);
        CurrentAccount acc6 = new CurrentAccount(9901L, "abc.com", 70000, 10000);
        CurrentAccount acc7 = new CurrentAccount(9901L, "lmn.com", 80000, 10000);
        return new Account[]{acc1, acc2, acc5, acc3, acc6, acc7, acc4};
    }
}
