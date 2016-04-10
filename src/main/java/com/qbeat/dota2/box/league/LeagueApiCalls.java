package com.qbeat.dota2.box.league;

import com.qbeat.dota2.box.league.dto.LeagueList;
import com.qbeat.dota2.box.league.dto.LiveGamesList;

public interface LeagueApiCalls {

    LeagueList getLeagueListing();

    LiveGamesList getLiveLeagueGames();
}
