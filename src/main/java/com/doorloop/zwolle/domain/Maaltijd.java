package com.doorloop.zwolle.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Maaltijd {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    long Id;
    int Dag;
    int IntakeTotaal;

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public int getDag() {
        return Dag;
    }

    public void setDag(int dag) {
        Dag = dag;
    }

    public int getIntakeTotaal() {
        return IntakeTotaal;
    }

    public void setIntakeTotaal(int intakeTotaal) {
        IntakeTotaal = intakeTotaal;
    }
}
