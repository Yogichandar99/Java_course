package com.careerit.iplstats.service;

import com.careerit.iplstats.Dto.*;

import java.util.List;

public class IplServiceImpl implements IplStatService{
    @Override
    public List<TeamBasicDto> getTeamBasicDetails() {
        return null;
    }

    @Override
    public List<PlayerDto> getPlayer(String team) {
        return null;
    }

    @Override
    public List<TeamAmountStats> getTeamAmountStats() {
        return null;
    }

    @Override
    public List<RoleAmountStats> getRoleAmountStats() {
        return null;
    }

    @Override
    public List<TeamRoleCount> getRoleCountStats(String team) {
        return null;
    }

    @Override
    public List<PlayerDto> getPlayer(String team, String role) {
        return null;
    }
}
