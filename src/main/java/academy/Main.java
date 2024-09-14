package academy;

import academy.Impl.AttendanceServiceImpl;
import academy.Impl.CoachServiceImpl;
import academy.Impl.PlayerServiceImpl;
import academy.Impl.TeamServiceImpl;
import academy.entity.Coach;
import academy.entity.Player;
import academy.entity.Team;
import academy.entity.TrainingSession;
import academy.interfaces.TeamService;

import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        TeamServiceImpl teamService = new TeamServiceImpl();
        CoachServiceImpl coachService = new CoachServiceImpl();

        Coach coach1 = new Coach(1, "John Doe", "UEFA Pro License");
        coachService.addCoach(coach1);


        Team team1 = new Team(1, "Team A", coach1);
        teamService.addTeam(team1);

        PlayerServiceImpl playerService = new PlayerServiceImpl();
        playerService.addPlayer(new Player(1, "Alice", 20, team1));
        playerService.addPlayer(new Player(2, "Bob", 22, team1));
        playerService.addPlayer(new Player(3, "Charlie", 24,team1));
        playerService.addPlayer(new Player(4, "David", 21, team1));
        playerService.addPlayer(new Player(5, "Eve", 23,  team1));
        playerService.addPlayer(new Player(6, "Frank", 25,team1));
        playerService.addPlayer(new Player(7, "Grace", 20, team1));
        playerService.addPlayer(new Player(8, "Hank", 22, team1));
        playerService.addPlayer(new Player(9, "Ivy", 23, team1));
        playerService.addPlayer(new Player(10, "Jack", 21, team1));

        AttendanceServiceImpl attendanceService = new AttendanceServiceImpl();
        TrainingSession session1 = new TrainingSession(1, new Date(), team1);

        attendanceService.getAttendanceByPlayer(session1);


        for (Player player : team1.getPlayers()) {
            boolean attended = player.getId() % 2 == 0;
            recordAttendance(player, session1, attended);
        }


        System.out.println("Team: " + team1.getName() + ", Coach: " + coach1.getName());
        for (Player player : team1.getPlayers()) {
            System.out.println("Attendance for " + player.getName() + ": " +
                    getAttendanceByPlayer(player));
        }
    }
}



