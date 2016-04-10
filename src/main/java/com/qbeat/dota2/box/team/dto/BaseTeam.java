package com.qbeat.dota2.box.team.dto;

import com.google.gson.annotations.SerializedName;

public class BaseTeam {

    @SerializedName("team_id")
    private long teamId;

    @SerializedName(value = "team_name", alternate = {"name"})
    private String name;

    @SerializedName(value = "team_logo", alternate = {"logo"})
    private long logo;

    @SerializedName("complete")
    private boolean complete;

    public long getTeamId() {
        return teamId;
    }

    public String getName() {
        return name;
    }

    public long getLogo() {
        return logo;
    }

    public boolean isComplete() {
        return complete;
    }
}
