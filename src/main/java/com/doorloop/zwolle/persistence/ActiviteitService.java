package com.doorloop.zwolle.persistence;

import com.doorloop.zwolle.domain.Activiteit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActiviteitService {
    @Autowired
    ActiviteitRepository activitieitRepository;



    public Iterable<Activiteit> geefMeAlleActiviteiten(){

        Activiteit Act1 = new Activiteit();
        Act1.setTypeOfExercise(null);
        Act1.setCalPerHour(0);
        Act1.setDurationOfExercise(0);
        Act1.setSuccess(false);
        Act1.setTimeIfFail(0);
        Act1.setCalBurned(0);

        return activitieitRepository.findAll();

    }

        public void saveActiviteit(Activiteit activiteit){
        activitieitRepository.save(activiteit);
        }

}
