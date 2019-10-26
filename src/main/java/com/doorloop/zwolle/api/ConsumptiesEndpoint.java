package com.doorloop.zwolle.api;


import com.doorloop.zwolle.domain.Consumpties;
import com.doorloop.zwolle.persistence.ConsumptiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumptiesEndpoint {

    @Autowired
    ConsumptiesService consumptiesService;

    @GetMapping("/Consumpties")
    public Consumpties consumptie1() {
        Consumpties eenConsumptie = new Consumpties();

        eenConsumptie.setId(1);
        eenConsumptie.setCalories(150);
        eenConsumptie.setPortie(0.5);
        return eenConsumptie;

    }

    @PostMapping("/Consumpties")
    public void saveConsumpties(@RequestBody Consumpties consumpties){
        consumptiesService.saveConsumpties(consumpties);
    }
}
