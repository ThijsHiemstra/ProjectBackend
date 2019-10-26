package com.doorloop.zwolle.domain;

import org.springframework.http.converter.json.GsonBuilderUtils;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Goal {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    double GoalInputWeight;
    double GoalOutputWeight;
    Boolean Passed;

    public double getGoalInputWeight() {
        return GoalInputWeight;
    }

    public void setGoalInputWeight(double goalInputWeight) {
        GoalInputWeight = goalInputWeight;
    }

    public double getGoalOutputWeight() {
        return GoalOutputWeight;
    }

    public void setGoalOutputWeight(double goalOutputWeight) {
        GoalOutputWeight = goalOutputWeight;
    }

    public Boolean getPassed() {
        return Passed;
    }

    public void setPassed(Boolean passed) {
        Passed = passed;
    }
}
