package com.tdoc.patienthealthmetricscollectorapi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tdoc.patienthealthmetricscollectorapi.model.OutboxEntity;
import com.tdoc.patienthealthmetricscollectorapi.repositories.OutboxRepository;

@Service
public class OutboxService {
    
    OutboxRepository outboxRepository;
    
    @Autowired
    public OutboxService(OutboxRepository outboxRepository) {
        this.outboxRepository = outboxRepository;
    }   

    public OutboxEntity saveMessageToOutboxTable(OutboxEntity outboxEntity) {
        return outboxRepository.save(outboxEntity);
    }
}
