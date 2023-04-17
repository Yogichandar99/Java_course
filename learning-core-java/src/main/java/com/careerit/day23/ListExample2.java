package com.careerit.day23;
import com.careerit.day10.Product;
import com.careerit.day22.playerstats.*;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ListExample2
{
    public static void main(String[] args)
    {
        List<Player> players=getPlayers();
        players.forEach(ele-> System.out.println(ele));
        System.out.println(players.size());
        //Printing all the player names
        List<String> playerNames=getPlayerNames(players);
        playerNames.forEach(ele-> System.out.println(ele));
        System.out.println("-".repeat(50));

        //writes all the players with given string name
        List<String> playerWithString=getPlayersWithNameLike(players,"raj");
        playerWithString.forEach(ele-> System.out.println(ele));

        //to get team names from players
        System.out.println("-".repeat(50));
        Set<String> teamNames=getTeamNames(players);
        teamNames.forEach(ele-> System.out.println(ele));
        System.out.println("-".repeat(50));
        List<Integer> integerList= IntStream.rangeClosed(1,100).boxed().toList();
        //integerList.forEach(ele-> System.out.print(ele+" "));
        System.out.println("-".repeat(50));
        List<Integer> filteredList=numberOpe(integerList);
        filteredList.forEach(ele-> System.out.println(ele));
        System.out.println("-".repeat(50));

        //To get team amount stats
        List<TeamStatsDto> amountStats=getTeamAmountStats(players);
        amountStats.forEach(ele-> System.out.println(ele));

    }
    //Operations of integer list
    public static List<Integer> numberOpe(List<Integer> list)
    {
        return list.stream()
                .filter(ele->ele%3==0 && ele%6==0 && ele%9!=0)
                .map(ele->ele*2)
                .filter(ele->ele>=30 &&ele<=50).toList();
    }
    //A method to get only player names
    public static List<String> getPlayerNames(List<Player> playerList)
    {
        /*
        //Creating a list to store player names
        List<String> playerNames=new ArrayList<>();
        for(Player pl:playerList)
        {
            playerNames.add(pl.getName());
        }
        return playerNames;

         */
        //converting all the code using java 8 streams
        //Steps getting the playerList and converting the player list stream into string by using map
        //later getting all the names as a list.
        return playerList
                .stream()
                .map(p->p.getName())
                .toList();
    }
    public static List<Player> getPlayers() {
        List<Player> list = new ArrayList<>();
        try {
            list = CsvReaderUtil.loadPlayers();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return list;
    }
    //passing the list of players and a string to match
    //the players whose name contains str will be returned as output
    public static List<String> getPlayersWithNameLike(List<Player> list,String str)
    {
        /*
        //A new string to store the value player with given string
        List<String> playerWithString=new ArrayList<>();
        //iterating over the players
        String name;
        for(Player pl:list)
        {
            name=pl.getName();
            if(name.contains(str))
            {
                playerWithString.add(pl.getName());
            }
        }
        return playerWithString;

         */
        //converting all the above code into java 8 streams
        //collecting the player list and filtering out the names with given string
        //later mapping all names to list
        //order first do filter then do map to list
        return list
                .stream()
                .filter(p->p.getName().contains(str))
                .map(p->p.getName()).toList();
    }
    public static Set<String> getTeamNames(List<Player> players)
    {
        /*
        Set<String> teamNames=new HashSet<>();
        for(Player pl:players)
            teamNames.add(pl.getTeam());
        return teamNames;

         */
        //Implementing using java 8
        return players
                .stream()
                .map(p->p.getTeam())
                .collect(Collectors.toSet());
    }
    public static List<TeamStatsDto> getTeamAmountStats(List<Player> players) {
//    List<TeamStatsDto> teamStatList = new ArrayList<>();
//    Set<String> teamNames = players.stream().map(p->p.getTeam()).collect(Collectors.toSet());
//    for(String teamName:teamNames){
//      List<Player> list = players.stream().filter(p->p.getTeam().endsWith(teamName)).toList();
//      double totalAmount = list.stream().mapToDouble(p->p.getAmount()).sum();
//      TeamStatsDto obj = new TeamStatsDto();
//      obj.setTeamName(teamName);
//      obj.setTotalAmount(totalAmount);
//      teamStatList.add(obj);
//    }
//    return teamStatList;
        List<TeamStatsDto> ret = players
                .stream()
                .collect(Collectors.groupingBy(Player::getTeam))
                .entrySet().stream().map(ele -> {
                    double totalAmount = ele.getValue().stream().mapToDouble(p -> p.getAmount()).sum();
                    TeamStatsDto obj = new TeamStatsDto();
                    obj.setTeamName(ele.getKey());
                    obj.setTotalAmount(totalAmount);
                    return obj;
                }).toList();
        return ret;
    }
}
