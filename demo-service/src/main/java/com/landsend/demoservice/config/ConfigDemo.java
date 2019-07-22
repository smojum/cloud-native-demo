package com.landsend.demoservice.config;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ConfigDemo {
    private Long id;
    private String foo;
    private String bar;
}
