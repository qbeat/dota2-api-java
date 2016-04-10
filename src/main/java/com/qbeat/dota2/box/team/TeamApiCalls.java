package com.qbeat.dota2.box.team;

import com.qbeat.dota2.box.team.dto.TeamList;

public interface TeamApiCalls {

    TeamList getTeamInfoByTeamID(long id, int number);
}
