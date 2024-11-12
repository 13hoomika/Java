package com.xworkz.sportsclub.sports;

public class Sports {
    private String teamName;
    private int players;

    public Sports () {
        System.out.println("Sport default constructor is invoked");
    }
    public void Info(String teamName, int players){
        this.teamName = teamName;
        this.players = players;
        System.out.println("Team Name: "+this.teamName);
        System.out.println("Number of players: "+this.players);
    }

}
