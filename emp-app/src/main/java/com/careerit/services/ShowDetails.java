package com.careerit.services;

import com.careerit.Dto.EmployeeDto;

import java.util.List;

//An interface to implement all the required functionality
public interface ShowDetails
{
    //Just having one abstract method that only displays employee details
    List<EmployeeDto> updatedDetails();
}
