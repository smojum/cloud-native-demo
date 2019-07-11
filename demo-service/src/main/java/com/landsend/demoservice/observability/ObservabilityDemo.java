package com.landsend.demoservice.observability;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity(name = "message")
public class ObservabilityDemo {
    @Id
    private Long id;
    private String message;
}
