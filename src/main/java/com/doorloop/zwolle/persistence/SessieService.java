package com.doorloop.zwolle.persistence;


import com.doorloop.zwolle.domain.Sessie;
import org.springframework.stereotype.Service;

@Service
public class SessieService {
    SessieRepository sessieRepository;

    public Iterable<Sessie> geefMeAlleSessies(){
        Sessie sessie1 = new Sessie();
            Sessie eersteSessie = new Sessie();
            eersteSessie.setId(1);
            eersteSessie.setDag(1);
            eersteSessie.setCalVerbrand(500);

            return sessieRepository.findAll();

    }

    public void saveSessie(Sessie sessie){
        sessieRepository.save(sessie);
    }
}
