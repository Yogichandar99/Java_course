package com.careerit.day22.playerstats;

import lombok.*;

//Setting getters,setters and allArgConstructor to give required functionality
// and ToString method to override hashcode.
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Player
{
    private String name;
    private String role;
    private double amount;
    private String country;
    private String team;
}
