package com.qbeat.dota2.box.team.dto;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class TeamList {

    @SerializedName("teams")
    private List<Team> teams;

    public List<Team> getTeams() {
        return teams;
    }
}
