package com.qbeat.dota2.box.league.dto;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class LeagueList {

    @SerializedName("leagues")
    private List<League> leagues;

    public List<League> getLeagues() {
        return leagues;
    }
}
