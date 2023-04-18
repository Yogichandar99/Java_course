package com.careerit.iplstats.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Player
{
    private String name;
    private String role;
    private String country;
    private String team;
    @JsonProperty("amount")
    private double price;
}
