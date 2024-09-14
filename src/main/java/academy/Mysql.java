package academy;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
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


        try (Connection connection = DatabaseConnection.getConnection();
             Statement statement = connection.createStatement()) {

            statement.execute(createTeamsTable);
            statement.execute(createCoachesTable);
            statement.execute(createPlayersTable);
            statement.execute(createTrainingSessionsTable);
            statement.execute(createAttendanceTable);

            System.out.println("Tables created successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


        try (Connection connection = DatabaseConnection.getConnection();
    Statement statement = connection.createStatement()) {

        // Execute each SQL statement to create the tables
        statement.execute(createTeamsTable);
        statement.execute(createCoachesTable);
        statement.execute(createPlayersTable);
        statement.execute(createTrainingSessionsTable);
        statement.execute(createAttendanceTable);

        System.out.println("Tables created successfully.");
    } catch (SQLException e) {
        e.printStackTrace();
    }
}

// Directly insert a coach into the database
private static void createCoach(int id, String name, String qualification) {
    try (Connection connection = DatabaseConnection.getConnection();
         Statement statement = connection.createStatement()) {

        String sql = "INSERT INTO coaches (id, name, qualification) VALUES (" +
                id + ", '" + name + "', '" + qualification + "')";
        statement.executeUpdate(sql);
        System.out.println("Coach created: " + name);
    } catch (SQLException e) {
        e.printStackTrace();
    }
}

private static void createTeam(int id, String name, int coachId) {
    try (Connection connection = DatabaseConnection.getConnection();
         Statement statement = connection.createStatement()) {

        String sql = "INSERT INTO teams (id, name, coach_id) VALUES (" +
                id + ", '" + name + "', " + coachId + ")";
        statement.executeUpdate(sql);
        System.out.println("Team created: " + name);
    } catch (SQLException e) {
        e.printStackTrace();
    }
}

private static void createPlayer(int id, String name, int age, String position, int teamId) {
    try (Connection connection = DatabaseConnection.getConnection();
         Statement statement = connection.createStatement()) {

        String sql = "INSERT INTO players (id, name, age, position, team_id) VALUES (" +
                id + ", '" + name + "', " + age + ", '" + position + "', " + teamId + ")";
        statement.executeUpdate(sql);
        System.out.println("Player created: " + name);
    } catch (SQLException e) {
        e.printStackTrace();
    }
}

// Directly insert a training session into the database
private static void createTrainingSession(int id, Date date, int teamId) {
    try (Connection connection = DatabaseConnection.getConnection();
         Statement statement = connection.createStatement()) {

        String sql = "INSERT INTO training_sessions (id, session_date, team_id) VALUES (" +
                id + ", '" + new java.sql.Date(date.getTime()) + "', " + teamId + ")";
        statement.executeUpdate(sql);
        System.out.println("Training session created: Session ID " + id);
    } catch (SQLException e) {
        e.printStackTrace();
    }
}

// Directly insert attendance into the database
private static void recordAttendance(int playerId, int sessionId, boolean attended) {
    try (Connection connection = DatabaseConnection.getConnection();
         Statement statement = connection.createStatement()) {

        String sql = "INSERT INTO attendance (player_id, session_id, attended) VALUES (" +
                playerId + ", " + sessionId + ", " + attended + ")";
        statement.executeUpdate(sql);
        System.out.println("Attendance recorded for player ID: " + playerId);
    } catch (SQLException e) {
        e.printStackTrace();
    }
}



