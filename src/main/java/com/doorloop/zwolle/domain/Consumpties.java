package com.doorloop.zwolle.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Consumpties {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    long Id;
    String TypeOfConsumption;
    double Portie;
    float Calories;

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getTypeOfConsumption() {
        return TypeOfConsumption;
    }

    public void setTypeOfConsumption(String typeOfConsumption) {
        TypeOfConsumption = typeOfConsumption;
    }

    public double getPortie() {
        return Portie;
    }

    public void setPortie(double portie) {
        Portie = portie;
    }

    public float getCalories() {
        return Calories;
    }

    public void setCalories(float calories) {
        Calories = calories;
    }
}
