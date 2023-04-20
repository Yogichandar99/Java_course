package com.careerit.Util;

import com.careerit.domain.Currency;
import com.careerit.domain.Employee;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JsonReader {
    private JsonReader() {

    }
//load the details of employee from emp-json using object mapper
    public static List<Employee> loadEmployee() {
        //take a objectMapper object to access it
        ObjectMapper objectMapper = new ObjectMapper();
        //An empty array list to store employee
        List<Employee> empList = new ArrayList<>();
        //Specifying the type we want to return.
        TypeReference<List<Employee>> type = new TypeReference<List<Employee>>() {
        };
        try {
            empList = objectMapper.readValue(JsonReader.class.getResource("/emp.json"), type);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return empList;
    }
//load the details of currency from common-currency.json using object mapper
    public static List<Currency> loadCurrencyDetails() {
        //take a objectMapper object to access it
        ObjectMapper objectMapper1 = new ObjectMapper();
        //An empty array list to store currency details
        List<Currency> currencyDetails = new ArrayList<>();
        //Specifying the type we want to return.
        TypeReference<List<Currency>> type = new TypeReference<List<Currency>>() {
        };
        try {
            currencyDetails = objectMapper1.readValue(JsonReader.class.getResource("/common-currency.json"), type);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return currencyDetails;
    }
}

//check the logic using main method if needed
/*
    public static void main(String[] args)
    {
        System.out.println(loadEmployee().size());
        System.out.println(loadCurrencyDetails().size());
        List<Employee> list=loadEmployee();
        list.forEach(ele-> System.out.println(ele));
        System.out.println();
        System.out.println("-".repeat(100));
        System.out.println();
        List<Currency> list1=loadCurrencyDetails();
        list1.forEach(ele-> System.out.println(ele));
    }

}

 */