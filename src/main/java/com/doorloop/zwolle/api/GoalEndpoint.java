package com.doorloop.zwolle.api;

import com.doorloop.zwolle.domain.Goal;
import com.doorloop.zwolle.persistence.GoalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GoalEndpoint {

    @Autowired
    GoalRepository goalRepository;

    @GetMapping("/goal")
    public Goal goal(){
        System.out.println("Je eerste doelstelling!");
        Goal goal1 = new Goal();
        goal1.setGoalInputWeight(0.0);
        goal1.setGoalOutputWeight(0.0);
        goal1.setPassed(false);
        return goal1;


    }
}
