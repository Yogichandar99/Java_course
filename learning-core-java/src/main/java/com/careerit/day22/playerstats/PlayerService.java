package com.careerit.day22.playerstats;

import java.util.List;
import java.util.function.Predicate;

public interface PlayerService
{
//This is the interface which notifies what are the required methodologies
// to implement in the playerStats

    //To make this interface functional we need to create a class to implement all the methods

        //The below is the list of services provided
        //To get the maximum amount
        double maxAmount();
        //To get the players by team name
        List<Player> getPlayerByTeam(String teamName);
        //to get all the players by country
        List<CountryDto> getPlayerByCountry(String countryName);
        //to get the playersByCountryAndRole
        List<CountryAndRoleDto> getPlayerByCountryAndRole(String countryName,String role);

        List<TeamStatsDto> getTeamAmountStats();
        List<String> getTeamNames();
        List<Player> getPlayers(Predicate<Player> mypredicate);
        List<RoleAmountDto> getAmountByRole();


}
