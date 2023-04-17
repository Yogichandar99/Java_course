package com.careerit.day22.playerstats;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
//This class is created to create an object that can hold teamName and totalAmount
public class TeamStatsDto
{
    private String teamName;
    private double totalAmount;
}
