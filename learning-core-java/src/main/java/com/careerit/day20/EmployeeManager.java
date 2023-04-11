package com.careerit.day20;

import com.careerit.day21.Employee;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class EmployeeManager
{
    public static void main(String[] args) throws CustomException {
        //calling the loadFromFile
        List<Employee> list = loadFromFile();
        list.stream().forEach(System.out::println);
        //System.out.println(checkBalance(0));
    }

    private static List<com.careerit.day21.Employee> loadFromFile()
    {
        //taking an  empty list to store the array of employee objects
        List<Employee> empList = new ArrayList<>();
        try
        {
            //reading the url
            URL url = EmployeeManager.class.getResource("/employee.csv");
            //converting to uri and reaidng all the lines
            List<String> list = Files.readAllLines(Paths.get(url.toURI()));
            //looping over the list of lines we got
            for (int i = 1; i < list.size(); i++)
            {
                //splitting the data
                String data = list.get(i);
                String[] arr = data.split(",");
                //converting each row data into employee object uisng convertRowtoemp function
                Employee emp = convertRowToEmp(arr);
                empList.add(emp);
            }
        }
        //catching all the exceptions
        catch (IOException | URISyntaxException e) {
            e.printStackTrace();
            System.out.println(e);
        }
        return empList;

    }

    private static Employee convertRowToEmp(String[] arr)
    {
        //converting each row to specific specific data
        Long id = Long.parseLong(arr[0]);
        String firstName = arr[1];
        String lastName = arr[2];
        String email = arr[3];
        String gender = arr[4];
        double salary = Double.parseDouble(arr[5]);
        return new Employee(id, firstName, lastName, email, gender, salary);
    }
    //here we are need this implementation in future, but right now we dont no how to use it
    //We are handling this case by throwing an exception explicitly.
    //Throw- to call an exception explictly
    //Throws to let the higher stack about possible exceptions
    private static List<Employee> convertRowtoList(List<String> list)
    {
        throw new UnsupportedOperationException("cannot handle right now");
    }
    private static void withdrwal(double balance,double amount)
    {
        if(balance<amount)
        {
            //Here insuffient funds is custom exception which was thrown explictly.
            throw new InsufficientFundsException("no sufficient funds in the account");
        }
        balance-=amount;
    }
    //Handling the custom checked exceptions
    private static double checkBalance(long accNum) throws CustomException
    {
        double balance=0;
        if(accNum==0)
        {
            throw new CustomException("account doesn't exist");
        }
        return balance;
    }
}