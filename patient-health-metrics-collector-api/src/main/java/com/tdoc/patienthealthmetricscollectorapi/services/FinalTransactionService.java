package com.tdoc.patienthealthmetricscollectorapi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tdoc.patienthealthmetricscollectorapi.model.HealthMetrics;
import com.tdoc.patienthealthmetricscollectorapi.model.OutboxEntity;

import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class FinalTransactionService {
    
    HealthService healthService;
    OutboxService outboxService;
    ObjectMapper objectMapper; 

    @Autowired
    public FinalTransactionService(HealthService healthService, OutboxService outboxService, ObjectMapper objectMapper) {
        this.healthService = healthService;
        this.outboxService = outboxService;
        this.objectMapper = objectMapper;
    }

    @org.springframework.transaction.annotation.Transactional
    public HealthMetrics saveToEntityAndOutboxTable(HealthMetrics healthMetrics) throws JsonProcessingException {
        HealthMetrics healthMetricsResponse = healthService.addPatientData(healthMetrics);
        OutboxEntity outboxEntity = OutboxEntity.builder().msg(objectMapper.writeValueAsString(healthMetricsResponse)).build();
        outboxService.saveMessageToOutboxTable(outboxEntity);

        log.info("messages saved to outbox and health table: " + healthService.toString() + outboxEntity.toString());
        return healthMetricsResponse;
    }

}
