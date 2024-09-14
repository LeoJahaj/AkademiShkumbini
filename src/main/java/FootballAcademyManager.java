import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FootballAcademyManager {
    private List<Player> players;
    private List<Team> teams;
    private List<Coach> coaches;
    private List<TrainingSession> trainingSessions;
    private List<Attendance> attendances;

    public FootballAcademyManager() {
        players = new ArrayList<>();
        teams = new ArrayList<>();
        coaches = new ArrayList<>();
        trainingSessions = new ArrayList<>();
        attendances = new ArrayList<>();
    }

    // Methods to manage players
    public void addPlayer(Player player) {
        players.add(player);
    }

    public void removePlayer(Player player) {
        players.remove(player);
        player.setTeam(null);
    }

    // Methods to manage teams
    public void addTeam(Team team) {
        teams.add(team);
    }

    public void removeTeam(Team team) {
        teams.remove(team);
        for (Player player : team.getPlayers()) {
            player.setTeam(null);
        }
    }

    // Methods to manage coaches
    public void addCoach(Coach coach) {
        coaches.add(coach);
    }

    public void removeCoach(Coach coach) {
        coaches.remove(coach);
    }

    // Methods to schedule and manage training sessions
    public void scheduleTrainingSession(TrainingSession session) {
        trainingSessions.add(session);
    }

    public void recordAttendance(Player player, TrainingSession session, boolean attended) {
        Attendance attendance = new Attendance(player, session, attended);
        attendances.add(attendance);
    }

    public List<Attendance> getAttendanceByPlayer(Player player) {
        List<Attendance> result = new ArrayList<>();
        for (Attendance attendance : attendances) {
            if (attendance.getPlayer().equals(player)) {
                result.add(attendance);
            }
        }
        return result;
    }


    public class FootballAcademyManager {
        private PlayerService playerService;
        private TeamService teamService;
        private CoachService coachService;
        private TrainingSessionService trainingSessionService;
        private AttendanceService attendanceService;

        public FootballAcademyManager() {
            playerService = new PlayerServiceImpl();
            teamService = new TeamServiceImpl();
            coachService = new CoachServiceImpl();
            trainingSessionService = new TrainingSessionServiceImpl();
            attendanceService = new AttendanceServiceImpl();
        }

        public PlayerService getPlayerService() { return playerService; }
        public TeamService getTeamService() { return teamService; }
        public CoachService getCoachService() { return coachService; }
        public TrainingSessionService getTrainingSessionService() { return trainingSessionService; }
        public AttendanceService getAttendanceService() { return attendanceService; }

        // Additional methods for managing the system
    }
}