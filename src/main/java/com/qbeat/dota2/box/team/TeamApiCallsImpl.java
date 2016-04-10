package com.qbeat.dota2.box.team;

import com.qbeat.dota2.ApiCall;
import com.qbeat.dota2.ApiConfig;
import com.qbeat.dota2.box.team.dto.TeamList;

public class TeamApiCallsImpl extends ApiCall implements TeamApiCalls{

    public TeamApiCallsImpl(ApiConfig config) {
        super(config);
    }

    @Override
    public TeamList getTeamInfoByTeamID(long id, int number) {
        setApiCallUrl("/IDOTA2Match_570/GetTeamInfoByTeamID/v001/");
        setReturnType(TeamList.class);

        putParam("start_at_team_id", String.valueOf(id));
        putParam("teams_requested", String.valueOf(number));

        return callAndGet();
    }

}
