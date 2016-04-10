package com.qbeat.dota2.box.league.dto;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class LiveGamesList {

    @SerializedName("games")
    private List<LiveGame> liveGames;

    public List<LiveGame> getLiveGames() {
        return liveGames;
    }
}
