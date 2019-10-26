package com.doorloop.zwolle.persistence;

import com.doorloop.zwolle.domain.Consumpties;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;


@Component
public interface ConsumptiesRepository extends CrudRepository<Consumpties, Long> {
}
