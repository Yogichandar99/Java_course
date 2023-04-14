package com.careerit.day22.playerstats;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
//This class is created to hold the object that can hold role and total amount spend on that role
public class RoleAmountDto
{
    private String roleName;
    private double totalAmount;
}
