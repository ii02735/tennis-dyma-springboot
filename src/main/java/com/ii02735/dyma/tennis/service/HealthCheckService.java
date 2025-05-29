package com.ii02735.dyma.tennis.service;

import com.ii02735.dyma.tennis.repository.HealthCheckRepository;
import com.ii02735.dyma.tennis.rest.ApplicationStatus;
import com.ii02735.dyma.tennis.rest.HealthCheck;
import org.springframework.stereotype.Service;

@Service
public class HealthCheckService {

    private final HealthCheckRepository healthCheckRepository;

    public HealthCheckService(HealthCheckRepository healthCheckRepository) {
        this.healthCheckRepository = healthCheckRepository;
    }

    public HealthCheck getApplicationStatus() {
        final Long activeSessions = this.healthCheckRepository.countApplicationConnections();

        if (activeSessions > 0) {
            return new HealthCheck(ApplicationStatus.OK, "Bienvenue sur l'application dyma tennis.");
        }

        return new HealthCheck(ApplicationStatus.KO, "L'application dyma tennis n'est pas pleinement fonctionnelle.");
    }
}
