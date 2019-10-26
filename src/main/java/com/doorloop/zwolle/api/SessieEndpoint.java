package com.doorloop.zwolle.api;


import com.doorloop.zwolle.domain.Sessie;
import com.doorloop.zwolle.persistence.SessieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SessieEndpoint {

    @Autowired
    SessieService sessieService;

    @GetMapping("/Sessie")
    public Sessie sessie1(){
        Sessie eersteSessie = new Sessie();
        eersteSessie.setId(1);
        eersteSessie.setDag(1);
        eersteSessie.setCalVerbrand(500);

        return eersteSessie;
    }
}
