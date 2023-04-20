package com.careerit.domain;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
//Employee object
public class Employee
{
    private long id;
    private String first_name;
    private String last_name;
    private String email;
    private String gender;
    private double salary;
    private String currency;
}
