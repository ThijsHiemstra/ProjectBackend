package com.doorloop.zwolle.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue

    long UserId;
    String UserPW;
    String UserFirstName;
    String UserLastName;
    double UserHeight;
    double UserWeight;

    public long getUserID() {
        return UserId;
    }

    public void setUserId(long userId) {
        UserId = userId;
    }

    public String getUserPW() {
        return UserPW;
    }

    public void setUserPW(String userPW) {
        UserPW = userPW;
    }

    public String getUserFirstName() {
        return UserFirstName;
    }

    public void setUserFirstName(String userFirstName) {
        UserFirstName = userFirstName;
    }

    public String getUserLastName() {
        return UserLastName;
    }

    public void setUserLastName(String userLastName) {
        UserLastName = userLastName;
    }

    public double getUserHeight() {
        return UserHeight;
    }

    public void setUserHeight(double userHeight) {
        UserHeight = userHeight;
    }

    public double getUserWeight() {
        return UserWeight;
    }

    public void setUserWeight(double userWeight) {
        UserWeight = userWeight;
    }
}
