package com.careerit.services;

import com.careerit.Dto.EmployeeDto;
import java.util.List;

//To handle all the operations
public class EmployeeManager
{
    //write main method to perform the operation
    public static void main(String[] args)
    {
        //displaying all the details of employee with updated salary in required format
        System.out.println("The updated salary list is: ");
        //creating an object for EmployeeServices to access the methods
        EmployeeServices emp=new EmployeeServices();
        //accessing updated details method using created object
        List<EmployeeDto> empDetails=emp.updatedDetails();
        empDetails.forEach(ele-> System.out.println(ele));
    }
}
