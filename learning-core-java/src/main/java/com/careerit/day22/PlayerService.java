package com.careerit.day22;
import java.util.ArrayList;
import java.util.List;

public class PlayerService
{
    public static void main(String[] args) {

    }

    //here in the player service we need to load the data initially to perform the operations
    //The below is the list of services provided
    double maxAmount() {
        return 0;
    }

    List<Player> getPlayerByTeam(String teamName)
    {
        List<Player> playerNames=new ArrayList<>();
        return playerNames;
    }
    List<Player> getPlayerByCountry(String countryName)
    {
        List<Player> playerNamesByCountry=new ArrayList<>();
        return playerNamesByCountry;
    }
    List<Player> getPlayerByCountryAndRole(String countryName,String role)
    {
        List<Player> playerList=new ArrayList<>();
        return playerList;
    }
    /*List<TeamStatsDto> getTeamAmountStats(){

    }

     */

}
