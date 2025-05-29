package com.ii02735.dyma.tennis.repository;

import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Repository;

@Repository
public class HealthCheckRepository {

    private final EntityManager entityManager;

    public HealthCheckRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public Long countApplicationConnections() {
        final String query = "SELECT COUNT(*) FROM pg_stat_activity where application_name = 'PostgreSQL JDBC Driver'";
        return (Long) entityManager.createNativeQuery(query).getSingleResult();
    }
}
