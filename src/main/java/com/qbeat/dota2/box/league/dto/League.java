package com.qbeat.dota2.box.league.dto;

import com.google.gson.annotations.SerializedName;

public class League {

    @SerializedName("name")
    private String name;

    @SerializedName("leagueid")
    private long leagueId;

    @SerializedName("description")
    private String description;

    @SerializedName("tournament_url")
    private String tournamentUrl;

    @SerializedName("itemdef")
    private int itemdef;

    public String getName() {
        return name;
    }

    public long getLeagueId() {
        return leagueId;
    }

    public String getDescription() {
        return description;
    }

    public String getTournamentUrl() {
        return tournamentUrl;
    }

    public int getItemdef() {
        return itemdef;
    }
}
