package com.careerit.day24;
/* getting players of each team*/
import com.careerit.day22.playerstats.CsvReaderUtil;
import com.careerit.day22.playerstats.Player;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExample4
{
    public static void main(String[] args) throws IOException {
        List<Player> players= CsvReaderUtil.loadPlayers();
        //Taking an empty map to add the team name(adding unique team name ifabsent)
        //The map need to hold the team name and list of players
        Map<String,List<Player>> map=new HashMap<>();
        //looping over all the players
        for(Player pl:players)
        {
            //Getting the team name and initially taking an empty array list
            map.putIfAbsent(pl.getTeam(),new ArrayList<>());
            //Getting all the players with that team name
            List<Player> list=map.get(pl.getTeam());
            //Adding the player to list that we created
            list.add(pl);
            //updating the map with team and player details
            map.put(pl.getTeam(),list);
        }
        //Printing the map
        map.entrySet().forEach(ele->{
            System.out.println(ele.getKey()+" "+ele.getValue());
        });
    }
}
