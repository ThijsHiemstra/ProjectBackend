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
    public Iterable<User> geefUser(){


        return  userService.geefMeAlleUsers();

    }


    @PostMapping("/login")
    public void createUser(@RequestBody User user){

        userService.saveUser(user);
    }

    }





