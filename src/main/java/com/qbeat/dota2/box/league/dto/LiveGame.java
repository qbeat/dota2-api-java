package com.qbeat.dota2.box.league.dto;

import com.google.gson.annotations.SerializedName;
import com.google.gson.internal.ObjectConstructor;
import com.qbeat.dota2.box.player.dto.BasePlayer;
import com.qbeat.dota2.box.team.dto.BaseTeam;

import java.util.List;

public class LiveGame {

    @SerializedName("players")
    private List<BasePlayer> players;

    @SerializedName("radiant_team")
    private BaseTeam radiantTeam;

    @SerializedName("dire_team")
    private BaseTeam direTeam;

    @SerializedName("lobby_id")
    private long lobbyId;

    @SerializedName("match_id")
    private long matchId;

    @SerializedName("spectators")
    private int spectators;

    @SerializedName("series_id")
    private int seriesId;

    @SerializedName("game_number")
    private int gameNumber;

    @SerializedName("league_id")
    private long leagueId;

    @SerializedName("radiant_series_wins")
    private int radiantSeriesWins;

    @SerializedName("dire_series_wins")
    private int direSeriesWins;

    @SerializedName("series_type")
    private int seriesType;

    @SerializedName("league_series_id")
    private long leagueSeriesId;

    @SerializedName("league_game_id")
    private long leagueGameId;

    @SerializedName("stage_name")
    private String stageName;

    @SerializedName("league_tier")
    private int league_tier;

    public List<BasePlayer> getPlayers() {
        return players;
    }

    public BaseTeam getRadiantTeam() {
        return radiantTeam;
    }

    public BaseTeam getDireTeam() {
        return direTeam;
    }

    public long getLobbyId() {
        return lobbyId;
    }

    public long getMatchId() {
        return matchId;
    }

    public int getSpectators() {
        return spectators;
    }

    public int getSeriesId() {
        return seriesId;
    }

    public int getGameNumber() {
        return gameNumber;
    }

    public long getLeagueId() {
        return leagueId;
    }

    public int getRadiantSeriesWins() {
        return radiantSeriesWins;
    }

    public int getDireSeriesWins() {
        return direSeriesWins;
    }

    public int getSeriesType() {
        return seriesType;
    }

    public long getLeagueSeriesId() {
        return leagueSeriesId;
    }

    public long getLeagueGameId() {
        return leagueGameId;
    }

    public String getStageName() {
        return stageName;
    }

    public int getLeague_tier() {
        return league_tier;
    }
}
