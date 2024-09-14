package academy.Impl;

import academy.interfaces.AttendanceService;
import academy.entity.Attendance;
import academy.entity.Player;
import academy.entity.TrainingSession;

import java.util.ArrayList;
import java.util.List;

public class AttendanceServiceImpl implements AttendanceService {
    private List<Attendance> attendances;

    public AttendanceServiceImpl() {
        this.attendances = new ArrayList<>();
    }

    @Override
    public void recordAttendance(Player player, TrainingSession session, boolean attended) {
        Attendance attendance = new Attendance(player, session, attended);
        attendances.add(attendance);
    }

    @Override
    public List<Attendance> getAttendanceByPlayer(Player player) {
        List<Attendance> result = new ArrayList<>();
        for (Attendance attendance : attendances) {
            if (attendance.getPlayer().equals(player)) {
                result.add(attendance);
            }
        }
        return result;
    }
}