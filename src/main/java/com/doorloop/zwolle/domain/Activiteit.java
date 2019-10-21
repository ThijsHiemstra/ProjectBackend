package com.doorloop.zwolle.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Activiteit {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    long id;
    String TypeOfExercise;
    float CalPerHour;
    float DurationOfExercise;
    boolean Success;
    float TimeIfFail;
    float CalBurned;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTypeOfExercise() {
        return TypeOfExercise;
    }

    public void setTypeOfExercise(String typeOfExercise) {
        TypeOfExercise = typeOfExercise;
    }

    public float getCalPerHour() {
        return CalPerHour;
    }

    public void setCalPerHour(float calPerHour) {
        CalPerHour = calPerHour;
    }

    public float getDurationOfExercise() {
        return DurationOfExercise;
    }

    public void setDurationOfExercise(float durationOfExercise) {
        DurationOfExercise = durationOfExercise;
    }

    public boolean isSuccess() {
        return Success;
    }

    public void setSuccess(boolean success) {
        Success = success;
    }

    public float getTimeIfFail() {
        return TimeIfFail;
    }

    public void setTimeIfFail(float timeIfFail) {
        TimeIfFail = timeIfFail;
    }

    public float getCalBurned() {
        return CalBurned;
    }

    public void setCalBurned(float calBurned) {
        CalBurned = calBurned;
    }
}
