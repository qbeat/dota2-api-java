package com.qbeat.dota2.box.team.dto;

import com.google.gson.annotations.SerializedName;

public class Team extends BaseTeam {

    @SerializedName("tag")
    private String tag;

    @SerializedName("time_created")
    private long timeCreated;

    @SerializedName("rating")
    private String rating;

    @SerializedName("logo_sponsor")
    private long logoSponsor;

    @SerializedName("country_code")
    private String countryCode;

    @SerializedName("url")
    private String url;

    @SerializedName("games_played_with_current_roster")
    private int gamesPlayedWithCurrentRoster;

    @SerializedName("admin_account_id")
    private long adminAccountId;

    public String getTag() {
        return tag;
    }

    public long getTimeCreated() {
        return timeCreated;
    }

    public String getRating() {
        return rating;
    }

    public long getLogoSponsor() {
        return logoSponsor;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public String getUrl() {
        return url;
    }

    public int getGamesPlayedWithCurrentRoster() {
        return gamesPlayedWithCurrentRoster;
    }

    public long getAdminAccountId() {
        return adminAccountId;
    }
}
