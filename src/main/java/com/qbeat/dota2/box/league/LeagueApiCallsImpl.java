package com.qbeat.dota2.box.league;

import com.qbeat.dota2.ApiCall;
import com.qbeat.dota2.ApiConfig;
import com.qbeat.dota2.box.league.dto.LeagueList;
import com.qbeat.dota2.box.league.dto.LiveGamesList;

public class LeagueApiCallsImpl extends ApiCall implements LeagueApiCalls {

    public LeagueApiCallsImpl(ApiConfig config) {
        super(config);
    }

    @Override
    public LeagueList getLeagueListing() {
        setApiCallUrl("/IDOTA2Match_570/GetLeagueListing/v0001/");
        setReturnType(LeagueList.class);

        return callAndGet();
    }

    @Override
    public LiveGamesList getLiveLeagueGames() {
        setApiCallUrl("/IDOTA2Match_570/GetLiveLeagueGames/v0001/");
        setReturnType(LiveGamesList.class);

        return callAndGet();
    }
}
