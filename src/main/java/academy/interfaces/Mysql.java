package academy.interfaces;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Mysql {
    private static void createTables() {
        String createTeamsTable = "CREATE TABLE IF NOT EXISTS teams (" +
                "id INT PRIMARY KEY," +
                "name VARCHAR(255)," +
                "coach_id INT" +
                ");";

        String createCoachesTable = "CREATE TABLE IF NOT EXISTS coaches (" +
                "id INT PRIMARY KEY," +
                "name VARCHAR(255)," +
                "qualification VARCHAR(255)" +
                ");";

        String createPlayersTable = "CREATE TABLE IF NOT EXISTS players (" +
                "id INT PRIMARY KEY," +
                "name VARCHAR(255)," +
                "age INT," +
                "position VARCHAR(50)," +
                "team_id INT," +
                "FOREIGN KEY (team_id) REFERENCES teams(id)" +
                ");";

        String createTrainingSessionsTable = "CREATE TABLE IF NOT EXISTS training_sessions (" +
                "id INT PRIMARY KEY," +
                "session_date DATE," +
                "team_id INT," +
                "FOREIGN KEY (team_id) REFERENCES teams(id)" +
                ");";

        String createAttendanceTable = "CREATE TABLE IF NOT EXISTS attendance (" +
                "player_id INT," +
                "session_id INT," +
                "attended BOOLEAN," +
                "PRIMARY KEY (player_id, session_id)," +
                "FOREIGN KEY (player_id) REFERENCES players(id)," +
                "FOREIGN KEY (session_id) REFERENCES training_sessions(id)" +
                ");";

        try (Connection connection = connection.getConnection()) {
            try (Statement statement = connection.createStatement()) {

                statement.execute(createTeamsTable);
                statement.execute(createCoachesTable);
                statement.execute(createPlayersTable);
                statement.execute(createTrainingSessionsTable);
                statement.execute(createAttendanceTable);

                System.out.println("Tables created successfully.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

