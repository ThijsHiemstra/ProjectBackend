package com.doorloop.zwolle.api;

import com.doorloop.zwolle.domain.Activiteit;
import com.doorloop.zwolle.persistence.ActiviteitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActiviteitEndpoint {
    @Autowired
    ActiviteitService activiteitService;

@GetMapping("/Activiteit")
    public Activiteit workout1(){
    System.out.println("Welcome to workout #1");
    Activiteit Act1 = new Activiteit();
    Act1.setTypeOfExercise(null);
    Act1.setCalPerHour(0);
    Act1.setDurationOfExercise(0);
    Act1.setSuccess(false);
    Act1.setTimeIfFail(0);
    Act1.setCalBurned(0);

    return  Act1;


}



}
