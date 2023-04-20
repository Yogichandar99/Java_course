package com.careerit.services;

import com.careerit.Dto.EmployeeDto;
import com.careerit.Util.JsonReader;
import com.careerit.domain.Currency;
import com.careerit.domain.Employee;
import java.util.ArrayList;
import java.util.List;

//This is used to read the json file and convert that into object of that type
//Employee class to make interface methods working
public class EmployeeServices implements ShowDetails
{
    //empList gets all the employee details
    List<Employee> empList=JsonReader.loadEmployee();
    //currencyDetails has all the currency details
    List<Currency> currencyDetails=JsonReader.loadCurrencyDetails();
    //overriding updatedDetails with actual functionality
    @Override
    public List<EmployeeDto> updatedDetails()
    {
        //taking an empty list of type employeeDto to store the values as final output
        List<EmployeeDto> salaryList=new ArrayList<>();
        //Iterating over the empList
        for(Employee emp:empList)
        {
            //obtain all the details and add it to the list
            EmployeeDto empl =getDetails(emp);
            salaryList.add(empl);
        }
        return salaryList;
    }
    private EmployeeDto getDetails(Employee emp)
    {
        //get the details of employee
        EmployeeDto empl = new EmployeeDto();
        long id =emp.getId();
        String first_name = emp.getFirst_name();
        String last_name = emp.getLast_name();
        String email = emp.getEmail();
        String gender = emp.getGender();
        double salary = emp.getSalary();
        String currency = emp.getCurrency();
        //few more details needed
        //obtaining info about how many digits to round off
        int decimal_digits = getDecimalDigits(currency, currencyDetails);
        //obtaining the symbol that need to be updated on
        String symbol=getEquivalentSymbol(currency,currencyDetails);
        String updated_salary = getNewSalary(salary,symbol, decimal_digits);
        //setting the values
        empl.setId(id);
        empl.setFirst_name(first_name);
        empl.setLast_name(last_name);
        empl.setEmail(email);
        empl.setGender(gender);
        empl.setSalary(salary);
        empl.setUpdatedSalary(updated_salary);
        return empl;
    }

    private String getEquivalentSymbol(String currency, List<Currency> currencyDetails)
    {
        String salarySymbol="";
        for(Currency c:currencyDetails)
        {
            if(c.getCode().equals(currency))
            {
                salarySymbol=c.getSymbol_native();
            }
        }
        return salarySymbol;
    }

    private String getNewSalary(double salary, String symbol, int decimalDigits)
    {
        double number = Math.round(salary*Math.pow(10,decimalDigits))/Math.pow(10,decimalDigits);
        String upSal=symbol.concat(String.valueOf(number));
        return upSal;
    }

    public int getDecimalDigits(String currencyCode,List<Currency> CurrencyDetails)
    {
        int decimalDigits=0;
        for(Currency c:CurrencyDetails)
        {
            if(c.getCode().equals(currencyCode))
            {
                return decimalDigits=c.getDecimal_digits();
            }
        }
        return decimalDigits;
    }
}
