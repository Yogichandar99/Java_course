package com.careerit.day22.playerstats;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

//Implementing all the methods declared in interface
public class PlayerServices implements PlayerService
{
    List<Player> players;
    PlayerServices() throws IOException {
        //In the constructor we are setting all the players info into the players list.
        try {
            players = CsvReaderUtil.loadPlayers();
        }
        catch(IOException e)
        {
            e.printStackTrace();
            throw new RuntimeException("some error occurred please trace back");
        }
    }

    @Override
    public double maxAmount()
    {
        double max=players.get(0).getAmount();
        for(Player ele:players)
        {
            if(ele.getAmount()>max)
            {
                max=ele.getAmount();
            }
        }
        return max;
    }

    @Override
    public List<Player> getPlayerByTeam(String teamName)
    {
        return null;
    }

    @Override
    public List<CountryDto> getPlayerByCountry(String countryName) {
        return null;
    }

    @Override
    public List<CountryAndRoleDto> getPlayerByCountryAndRole(String countryName, String role) {
        return null;
    }
    //By using this method we will return all the players who meet the condition.
    @Override
    public List<Player> getPlayers(Predicate<Player> mypredicate)
    {
        //Creating a new list to store the values
       List<Player> list=new ArrayList<>();
       //looping over all the players
       for(Player p:players)
       {
           //if the condition that was given in myPredicate is true add it to the list
           if(mypredicate.test(p))
           {
               list.add(p);
           }
       }
       return list;
    }

    @Override
    public List<TeamStatsDto> getTeamAmountStats()
    {
        List<TeamStatsDto> teamStats=new ArrayList<>();
        List<String> teamNames=getTeamNames();
        for(String t:teamNames)
        {
            List<Player> list=getPlayers(new Predicate<Player>() {
                @Override
                public boolean test(Player player) {
                    return player.getTeam().equals(t);
                }
            });
            double totalAmount=getAmount(list);
            TeamStatsDto obj=new TeamStatsDto();
            obj.setTeamName(t);
            obj.setTotalAmount(totalAmount);
        }

        return teamStats;
    }
    @Override
    public List<String> getTeamNames()
    {
        List<String> teamName=new ArrayList<>();
        //we need to do it using a list or a set
        //set doesn't provide duplicate values
        for(Player ele:players)
        {
            String tName=ele.getTeam();
            if(!teamName.contains(tName))
            {
                teamName.add(tName);
            }
        }
        return teamName;
    }
    public double getAmount(List<Player> list)
    {
        double totalAmount=0;
        for(Player p:players)
            totalAmount=totalAmount+p.getAmount();
        return totalAmount;
    }
    @Override
    public List<RoleAmountDto> getAmountByRole()
    {
        return null;
    }
}
