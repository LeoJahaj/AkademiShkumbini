package academy;

import java.util.List;

public interface AttendanceService {
    void recordAttendance(Player player, TrainingSession session, boolean attended);
    List<Attendance> getAttendanceByPlayer(Player player);
}