package academy.Impl;

import academy.interfaces.CoachService;
import academy.entity.Coach;

import java.util.ArrayList;
import java.util.List;

    public class CoachServiceImpl implements CoachService {
        private List<Coach> coaches;

        public CoachServiceImpl() {
            this.coaches = new ArrayList<>();
        }

        @Override
        public void addCoach(Coach coach) {
            coaches.add(coach);
        }

        @Override
        public void removeCoach(Coach coach) {
            coaches.remove(coach);
        }

        @Override
        public Coach getCoachById(int id) {
            for (Coach coach : coaches) {
                if (coach.getId() == id) {
                    return coach;
                }
            }
            return null;
        }

        @Override
        public List<Coach> getAllCoaches() {
            return coaches;
        }
    }
}
