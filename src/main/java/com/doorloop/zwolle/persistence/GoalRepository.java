package com.doorloop.zwolle.persistence;


import com.doorloop.zwolle.domain.Goal;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface GoalRepository extends CrudRepository<Goal,Long> {
}




