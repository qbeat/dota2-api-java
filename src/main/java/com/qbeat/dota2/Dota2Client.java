package com.qbeat.dota2;

import com.qbeat.dota2.box.league.LeagueApiCalls;
import com.qbeat.dota2.box.league.LeagueApiCallsImpl;
import com.qbeat.dota2.box.team.TeamApiCalls;
import com.qbeat.dota2.box.team.TeamApiCallsImpl;

/**
 *The main class for using Dota2 API
 *
 *@author Sergey Kalinchenko
 */
public class Dota2Client {

    private final ApiConfig config;

    public Dota2Client() {
        this(new ApiConfig());
    }

    public Dota2Client(ApiConfig config) {
        this.config = config;
    }

    public LeagueApiCalls getLeagueApiCalls() {
        return new LeagueApiCallsImpl(config);
    }

    public TeamApiCalls getTeamApiCalls() {
        return new TeamApiCallsImpl(config);
    }
}
