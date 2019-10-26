package com.doorloop.zwolle.persistence;

import com.doorloop.zwolle.domain.Consumpties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsumptiesService {
    @Autowired
    ConsumptiesRepository consumptiesRepository;

    public Iterable<Consumpties> geefMeAlleConsumpties(){
        return consumptiesRepository.findAll();
    }
    public void saveConsumpties(Consumpties consumpties){
        consumptiesRepository.save(consumpties);
    }
}
