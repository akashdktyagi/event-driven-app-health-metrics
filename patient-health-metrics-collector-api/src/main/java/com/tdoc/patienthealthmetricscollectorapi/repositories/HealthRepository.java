package com.tdoc.patienthealthmetricscollectorapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tdoc.patienthealthmetricscollectorapi.model.HealthMetrics;

@Repository
public interface HealthRepository extends JpaRepository<HealthMetrics, Long> {
    
}
