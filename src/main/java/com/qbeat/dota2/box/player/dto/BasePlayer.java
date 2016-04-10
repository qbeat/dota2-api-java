package com.qbeat.dota2.box.player.dto;

import com.google.gson.annotations.SerializedName;

public class BasePlayer {

    @SerializedName("account_id")
    private long accountId;

    @SerializedName("name")
    private String name;

    @SerializedName("hero_id")
    private int heroId;

    @SerializedName("team")
    private int team;

    public long getAccountId() {
        return accountId;
    }

    public String getName() {
        return name;
    }

    public int getHeroId() {
        return heroId;
    }

    public int getTeam() {
        return team;
    }
}
