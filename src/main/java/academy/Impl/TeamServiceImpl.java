package academy.Impl;

import academy.interfaces.TeamService;
import academy.entity.Team;

import java.util.ArrayList;
import java.util.List;

public class TeamServiceImpl implements TeamService {
    private List<Team> teams;

    public TeamServiceImpl() {
        this.teams = new ArrayList<>();
    }

    @Override
    public void addTeam(Team team) {
        teams.add(team);
    }

    @Override
    public void removeTeam(Team team) {
        teams.remove(team);
    }

    @Override
    public Team getTeamById(int id) {
        for (Team team : teams) {
            if (team.getId() == id) {
                return team;
            }
        }
        return null;
    }

    @Override
    public List<Team> getAllTeams() {
        return teams;
    }
}
