package com.doorloop.zwolle.persistence;


import com.doorloop.zwolle.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface UserRepository extends CrudRepository<User,Long> {
}
