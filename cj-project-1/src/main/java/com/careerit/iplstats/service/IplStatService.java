package com.careerit.iplstats.service;

import com.careerit.iplstats.Dto.*;

import java.util.List;

public interface IplStatService
{
    //This interface specifies list of all methods that we would like to perform
    //Get the basic information of the team
    List<TeamBasicDto> getTeamBasicDetails();
    //Get the player details of a specific team
    List<PlayerDto> getPlayer(String team);
    List<TeamAmountStats> getTeamAmountStats();
    List<RoleAmountStats> getRoleAmountStats();
    List<TeamRoleCount> getRoleCountStats(String team);
    List<PlayerDto> getPlayer(String team,String role);
}
