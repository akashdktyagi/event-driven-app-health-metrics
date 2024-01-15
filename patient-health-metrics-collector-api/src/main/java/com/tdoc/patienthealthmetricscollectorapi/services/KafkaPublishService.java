package com.tdoc.patienthealthmetricscollectorapi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class KafkaPublishService {
    
    KafkaTemplate<String, String> kafkaTemplate;

    @Autowired
    public KafkaPublishService(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void publish(String topic,String message) {
        log.info("Publishing message to topic: " + topic + " message: " + message);
        kafkaTemplate.send(topic, message);
    }
}
