package com.ii02735.dyma.tennis.service;

import com.ii02735.dyma.tennis.rest.ApplicationStatus;
import com.ii02735.dyma.tennis.rest.HealthCheck;
import org.springframework.stereotype.Service;

@Service
public class HealthCheckService {

    public HealthCheck getApplicationStatus() {
        return new HealthCheck(ApplicationStatus.OK, "Bienvenue sur l'application dyma tennis.");
    }
}
