package com.tdoc.patienthealthmetricscollectorapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tdoc.patienthealthmetricscollectorapi.model.OutboxEntity;

@Repository
public interface OutboxRepository extends JpaRepository<OutboxEntity, Long>{
    
}
