package com.srutkowski.abstractfactory.example1;

import java.util.ArrayList;
import java.util.List;

public class TeamManager {

    private AbstractTeamFactory team;

    public TeamManager(AbstractTeamFactory abstractTeamFactory) {
        this.team = abstractTeamFactory;
    }

    public void setTeam(AbstractTeamFactory team) {
        this.team = team;
    }

    public List<Player> getTeamMembers() {
        List<Player> teamPlayers = new ArrayList<>();
        teamPlayers.add(team.createLibero());
        teamPlayers.add(team.createMiddleBlocker1());
        teamPlayers.add(team.createMiddleBlocker2());
        teamPlayers.add(team.createOpposite());
        teamPlayers.add(team.createSetter());
        teamPlayers.add(team.createReceiver1());
        teamPlayers.add(team.createReceiver2());
        return teamPlayers;
    }
}
