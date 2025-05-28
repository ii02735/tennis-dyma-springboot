package com.ii02735.dyma.tennis.rest;

import com.ii02735.dyma.tennis.service.HealthCheckService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {

    private final HealthCheckService healthCheckService;

    public HealthCheckController(HealthCheckService healthCheckService) {
        this.healthCheckService = healthCheckService;
    }

    @GetMapping("/healthcheck")
    public HealthCheck healthCheck() {
        return this.healthCheckService.getApplicationStatus();
    }
}
