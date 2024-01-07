package com.tdoc.patienthealthmetricscollectorapi.model;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "health_metrics")
public class HealthMetrics {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Nonnull
    String id;

    @Nonnull @Column(name = "device_id")
    String deviceId;

    @Nonnull @Column(name = "bp")
    String bp;

    @Nonnull @Column(name = "heart_rate")
    String heartRate;

    @Nonnull @Column(name = "o2_level")
    String o2Level;
}
