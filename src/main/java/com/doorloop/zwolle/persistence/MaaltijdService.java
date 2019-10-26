package com.doorloop.zwolle.persistence;


import com.doorloop.zwolle.domain.Maaltijd;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MaaltijdService {
    @Autowired
    MaaltijdRepository maaltijdRepository;

    public Iterable<Maaltijd> geefMeAlleMaaltijden(){
        Maaltijd maaltijd1 = new Maaltijd();
        maaltijd1.setId(0L);
        maaltijd1.setDag(1);
        maaltijd1.setIntakeTotaal(1500);

        return maaltijdRepository.findAll();
    }

    public void saveMaaltijd(Maaltijd maaltijd){
        maaltijdRepository.save(maaltijd);
    }
}
