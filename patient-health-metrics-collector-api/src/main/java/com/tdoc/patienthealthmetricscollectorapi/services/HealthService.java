package com.tdoc.patienthealthmetricscollectorapi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tdoc.patienthealthmetricscollectorapi.model.HealthMetrics;
import com.tdoc.patienthealthmetricscollectorapi.repositories.HealthRepository;

@Service
public class HealthService {
    
    HealthRepository healthRepository;

    @Autowired
    public HealthService(HealthRepository healthRepository) {
        this.healthRepository = healthRepository;
    }

    public HealthMetrics addPatientData(HealthMetrics healthMetrics) {
        return healthRepository.save(healthMetrics);

    }
}
