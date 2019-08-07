package com.smojumd.basicservice.config;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ConfigDemo {
    private Integer id;
    private String foo;
    private String bar;
}
