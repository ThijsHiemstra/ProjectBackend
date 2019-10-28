package com.doorloop.zwolle.api;

import com.doorloop.zwolle.domain.Activiteit;
import com.doorloop.zwolle.persistence.ActiviteitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActiviteitEndpoint {

    @Autowired
    ActiviteitService activiteitService;

    @GetMapping("/activiteit")
    public Iterable<Activiteit> geefActiviteit(){

        return  activiteitService.geefMeAlleActiviteiten();
    }

    @PostMapping("/activiteit")
    public void saveActiviteit(@RequestBody Activiteit activiteit){
        System.out.println(activiteit.getCalPerHour());
        activiteitService.saveActiviteit(activiteit);
        System.out.println();
    }
}








/*
 System.out.println("Welcome to workout #1");
        */
/*
        Activiteit Act1 = new Activiteit();
        Act1.setTypeOfExercise(null);
        Act1.setCalPerHour(0);
        Act1.setDurationOfExercise(0);
        Act1.setSuccess(false);
        Act1.setTimeIfFail(0);
        Act1.setCalBurned(0);*/
