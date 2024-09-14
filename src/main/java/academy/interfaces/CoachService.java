package academy.interfaces;

import academy.entity.Coach;

import java.util.List;

public interface CoachService {
        void addCoach(Coach coach);
        void removeCoach(Coach coach);
        Coach getCoachById(int id);
        List<Coach> getAllCoaches();
    }

