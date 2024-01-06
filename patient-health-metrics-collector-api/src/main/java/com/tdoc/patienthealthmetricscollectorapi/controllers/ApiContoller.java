package com.tdoc.patienthealthmetricscollectorapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.health.Health;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tdoc.patienthealthmetricscollectorapi.model.HealthMetrics;
import com.tdoc.patienthealthmetricscollectorapi.services.HealthService;

@Controller
@RestController
@RequestMapping("/api/v1")
public class ApiContoller {
    
    HealthService healthService;

    @Autowired
    public ApiContoller(HealthService healthService) {
        this.healthService = healthService;
    }
  
    @RequestMapping("/metrics")
    public ResponseEntity<String> addPatientData(@RequestBody HealthMetrics healthMetrics) {
    
        ResponseEntity<String> response = null;
        try {
            HealthMetrics healthMetricsResponse = healthService.addPatientData(healthMetrics);
            response = ResponseEntity.ok(healthMetricsResponse.toString());
        } catch (Exception e) {
            response = ResponseEntity.badRequest().body("Could not add patient data.");
        }

        return response;
    }
}