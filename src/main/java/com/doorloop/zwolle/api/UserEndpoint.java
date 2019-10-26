package com.doorloop.zwolle.api;

import com.doorloop.zwolle.domain.User;
import com.doorloop.zwolle.persistence.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
public class UserEndpoint {

    @Autowired
    UserService userService;

    @GetMapping("/login")
    public User workout1(){
        System.out.println("Welkom User");
        User gebruiker1 = new User();

        gebruiker1.setUserFirstName("sample");
        gebruiker1.setUserLastName("sample");
        gebruiker1.setUserHeight(00);
        gebruiker1.setUserWeight(00);

        return  gebruiker1;

    }


    @PostMapping("/login")
    public void createUser(@RequestBody User user){
        userService.saveUser(user);
    }

    }





