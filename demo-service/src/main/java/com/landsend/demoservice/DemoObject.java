package com.landsend.demoservice;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity(name = "message")
public class DemoObject {
    @Id
    private Long id;
    private String message;
}
