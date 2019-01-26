package com.srutkowski.abstractfactory.example1;

public class TestUsage {

    public static void main(String... args) {
        var skra = new SkraTeamFactory();
        var zaksa = new ZaksaTeamFactory();

        var manager = new TeamManager(skra);
        printManagersTeamInfo(manager);

        manager.setTeam(zaksa);
        printManagersTeamInfo(manager);
    }

    private static void printManagersTeamInfo(TeamManager manager) {
        System.out.println("\nCurrent manager's team:");
        manager.getTeamMembers()
                .forEach(player -> System.out.println(String.format("%s %s", player.getName(), player.getSurname())));
    }

}
