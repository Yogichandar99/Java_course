package com.careerit.iplstats.util;

import com.careerit.iplstats.domain.Player;
import com.careerit.iplstats.domain.Team;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JsonReader
{
    private JsonReader()
    {

    }
    public static List<Player> loadPlayers(){
        ObjectMapper objectMapper = new ObjectMapper();
        List<Player> players = new ArrayList<>();
        TypeReference<List<Player>> type = new TypeReference<List<Player>>() {};
        try
        {
            players = objectMapper.readValue(JsonReader.class.getResource("/player.json"), type);
        } catch (IOException e)
        {
            throw new RuntimeException(e);
        }
        return players;
    }
    public static List<Team> loadTeam()
    {
        //Taking object mapper inorder to convert the json file into object class of particular type
        ObjectMapper objectMapper=new ObjectMapper();
        //Taking an empty list to store the values
        List<Team> teams=new ArrayList<>();
        //Using the type refernce to let the compiler know what kind it needs to convert
        // here type of team object
        TypeReference<List<Team>> type = new TypeReference<List<Team>>() {};
        try {
            teams = objectMapper.readValue(JsonReader.class.getResource("/team.json"), type);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return teams;
    }

    public static void main(String[] args) {
        System.out.println(loadPlayers().size());
        System.out.println(loadTeam().size());
    }

}
