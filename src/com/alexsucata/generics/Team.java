package com.alexsucata.generics;

import java.util.ArrayList;

public class Team<T extends Player> {

    private String name;
    Integer played = 0;
    Integer won = 0;
    Integer lost = 0;
    Integer tied = 0;

    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player) {
        if (members.contains(player)) {
            System.out.println(player.getName() + " is already on this team");
            return false;
        } else {
            members.add(player);
            System.out.println(player.getName() + " picked for team " + this.name);
            return true;
        }
    }

    public Integer numPlayers() {
        return this.members.size();
    }

    public void matchResult(Team<T> opponent, Integer ourScore, Integer theirScore) {

        String message;

        if (ourScore > theirScore) {
            won++;
            message = " beat ";
        } else if (ourScore == theirScore) {
            tied++;
            message = " drew with ";
        } else {
            lost++;
            message = " lost to ";
        }
        played++;
        if (opponent != null) {
            System.out.println(this.getName() + message + opponent.getName());
            opponent.matchResult(null, theirScore, ourScore);
        }
    }

    public Integer ranking() {
        return (won * 3) + tied;
    }

}
