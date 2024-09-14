package academy;
import java.util.List;
public interface TeamService {

        void addTeam(Team team);
        void removeTeam(Team team);
        Team getTeamById(int id);
        List<Team> getAllTeams();
    }

