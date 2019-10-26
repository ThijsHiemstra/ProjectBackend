package com.doorloop.zwolle.api;


import com.doorloop.zwolle.domain.Maaltijd;
import com.doorloop.zwolle.persistence.MaaltijdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MaaltijdEndpoint {
    @Autowired
    MaaltijdService maaltijdService;


    @GetMapping("/Maaltijd")
    public Maaltijd maaltijd1(){
        System.out.println("Heeft het gesmaakt?");
        Maaltijd maalt1 = new Maaltijd();
        maalt1.setId(10L);
        maalt1.setDag(2);
        maalt1.setIntakeTotaal(3000);
        return maalt1;
    }

    @PostMapping("/Maaltijd")
    public void saveMaaltijd(@RequestBody Maaltijd maaltijd){
        System.out.println(maaltijd.getIntakeTotaal());
        maaltijdService.saveMaaltijd(maaltijd);
    }


}
