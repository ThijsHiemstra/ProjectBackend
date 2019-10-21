package com.doorloop.zwolle.persistence;

import com.doorloop.zwolle.domain.Activiteit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActiviteitService {
    @Autowired
    ActiviteitRepository activitieitRepository;
}
