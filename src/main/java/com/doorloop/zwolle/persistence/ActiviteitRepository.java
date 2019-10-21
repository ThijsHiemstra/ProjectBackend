package com.doorloop.zwolle.persistence;

import com.doorloop.zwolle.domain.Activiteit;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface ActiviteitRepository extends CrudRepository<Activiteit,Long> {
}
