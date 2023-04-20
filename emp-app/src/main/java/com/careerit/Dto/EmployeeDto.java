package com.careerit.Dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
//To display the final output created an employeeDto
// EmployeeDto comprises of employee details along with updated salary
public class EmployeeDto
{
    private long id;
    private String first_name;
    private String last_name;
    private String email;
    private String gender;
    private double salary;
    private String currency;
    private String updatedSalary;
}
