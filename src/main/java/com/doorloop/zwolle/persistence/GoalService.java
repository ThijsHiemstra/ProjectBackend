package com.doorloop.zwolle.persistence;


import com.doorloop.zwolle.domain.Goal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoalService {
    @Autowired
    GoalRepository goalRepository;


    public Iterable<Goal> geefMeAlleGoals(){
        Goal Goal1 = new Goal();
        Goal1.setGoalInputWeight(0.0);
        Goal1.setGoalOutputWeight(0.0);
        Goal1.setPassed(false);

        return goalRepository.findAll();
    }
    public void saveGoal(Goal goal){
        goalRepository.save(goal);
    }
}
