
package com.doorloop.zwolle.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Sessie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    long id;
    int Dag;
    float CalVerbrand;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getDag() {
        return Dag;
    }

    public void setDag(int dag) {
        Dag = dag;
    }

    public float getCalVerbrand() {
        return CalVerbrand;
    }

    public void setCalVerbrand(float calVerbrand) {
        CalVerbrand = calVerbrand;
    }
}

