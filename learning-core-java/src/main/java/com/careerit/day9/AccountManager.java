package com.careerit.day9;
import java.util.ArrayList;
import java.util.List;

public class AccountManager
{
    public static void main(String[] args)
    {
        Account obj=new Account("676767676767","Yogi",10987);
        obj.ShowDetails();
        Account obj1=new Account("78787878787","Ram",15000);
        obj1.ShowDetails();
        Account obj2=new Account("78762625623","Ram kumar",19989);
        obj2.ShowDetails();
       obj1.deposit(10000);
       obj.withdraw(30000);
       Account obj3=new Account("12345678775","Narendra",434343);
       Account obj4=new Account("7878785655343","Ankit",89898);
       Account obj5=new Account("4545454343432","Kumar",454541);
       List<Account> list= List.of(obj,obj1,obj2,obj3,obj4,obj5);



    }
}
