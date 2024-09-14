package academy.interfaces;

import academy.entity.Attendance;
import academy.entity.Player;
import academy.entity.TrainingSession;

import java.util.List;

public interface AttendanceService {
    void recordAttendance(Player player, TrainingSession session, boolean attended);
    List<Attendance> getAttendanceByPlayer(Player player);
}