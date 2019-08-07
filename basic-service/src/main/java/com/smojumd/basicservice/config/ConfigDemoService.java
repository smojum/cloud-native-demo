package com.smojumd.basicservice.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ConfigDemoService {

    @Value("${app.foo}")
    private String foo;
    public ConfigDemo getData(Integer id) {
        return ConfigDemo.builder()
                .id(id)
                .foo(foo)
                .build();
    }
}
