package academy;

import academy.Impl.CoachServiceImpl;
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


            Coach coach1 = new Coach(1, "John Doe",new Team());
            manager.getCoachService().addCoach(coach1);

            // Create a team
            Team team1 = new Team(1, "Team A", coach1);
            manager.getTeamService().addTeam(team1);

            // Add 5 players manually, one by one
            Player player1 = new Player(1, "Alice", 20, team1);
            manager.getPlayerService().addPlayer(player1);
            team1.addPlayer(player1);

            Player player2 = new Player(2, "Bob", 22, team1);
          getPlayerService().addPlayer(player2);
            team1.addPlayer(player2);

            Player player3 = new Player(3, "Charlie", 24,team1);
            manager.getPlayerService().addPlayer(player3);
            team1.addPlayer(player3);

            Player player4 = new Player(4, "David", 21,  team1);
            manager.getPlayerService().addPlayer(player4);
            team1.addPlayer(player4);

            Player player5 = new Player(5, "Eve", 23, team1);
            manager.getPlayerService().addPlayer(player5);
            team1.addPlayer(player5);

            // Schedule a training session
            TrainingSession session1 = new TrainingSession(1, new Date(), team1);
            manager.getTrainingSessionService().scheduleTrainingSession(session1);

            // Record attendance for all players
            for (Player player : team1.getPlayers()) {
                boolean attended = player.getId() % 2 == 0; // Alternate attendance for demonstration
                manager.getAttendanceService().recordAttendance(player, session1, attended);
            }

            // Print team details and attendance
            System.out.println("Team: " + team1.getName() + ", Coach: " + coach1.getName());
            for (Player player : team1.getPlayers()) {
                System.out.println("Attendance for " + player.getName() + ": " +
                        manager.getAttendanceService().getAttendanceByPlayer(player));
            }
        }
    }


