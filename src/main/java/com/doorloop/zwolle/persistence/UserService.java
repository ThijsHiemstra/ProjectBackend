package com.doorloop.zwolle.persistence;


import com.doorloop.zwolle.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public Iterable<User> geefMeAlleUsers() {

        return userRepository.findAll();
    }

    public void saveUser(User user){
        userRepository.save(user);
    }
}
