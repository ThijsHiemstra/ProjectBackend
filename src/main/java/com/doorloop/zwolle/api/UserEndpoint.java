package com.doorloop.zwolle.api;

import com.doorloop.zwolle.domain.User;
import com.doorloop.zwolle.persistence.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserEndpoint {

    @Autowired
    UserService userService;

    @GetMapping("/{userId}")
    public String User(@PathVariable long Id) {
    return "Handled HTTP Get User Request";
    }


    @PostMapping
    public void createUser(@RequestBody User user){
        userService.saveUser(user);
    }

    }





