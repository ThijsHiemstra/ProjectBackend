package com.doorloop.zwolle.persistence;


import com.doorloop.zwolle.domain.Maaltijd;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface MaaltijdRepository extends CrudRepository<Maaltijd,Long> {
}
