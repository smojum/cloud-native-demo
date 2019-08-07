package com.smojumd.basicservice.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.lang.management.ManagementFactory;

@RestController
public class ConfigDemoController {

    @Autowired
    private ConfigDemoService service;

    @Value("${app.bar}")
    private String bar;

    @GetMapping("config/{id}")
    public ConfigDemo getData(@PathVariable("id") Integer id) {
        ConfigDemo demo = service.getData(id);
        demo.setBar(bar);
        return demo;
    }
}
