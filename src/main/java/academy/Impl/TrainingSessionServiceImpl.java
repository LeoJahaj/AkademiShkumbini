package academy.Impl;

import academy.interfaces.TrainingSessionService;
import academy.entity.TrainingSession;

import java.util.ArrayList;
import java.util.List;

public class TrainingSessionServiceImpl implements TrainingSessionService {
    private List<TrainingSession> trainingSessions;

    public TrainingSessionServiceImpl() {
        this.trainingSessions = new ArrayList<>();
    }

    @Override
    public void scheduleTrainingSession(TrainingSession session) {
        trainingSessions.add(session);
    }

    @Override
    public List<TrainingSession> getAllTrainingSessions() {
        return trainingSessions;
    }
}
