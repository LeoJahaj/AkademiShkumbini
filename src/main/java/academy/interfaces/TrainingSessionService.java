package academy.interfaces;

import academy.entity.TrainingSession;

import java.util.List;

public interface TrainingSessionService {
    void scheduleTrainingSession(TrainingSession session);
    List<TrainingSession> getAllTrainingSessions();
}
