package com.landsend.demoservice.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ConfigDemoController {

    @Autowired
    private ConfigDemoService service;

    @Value("${app.bar}")
    private String bar;

    @GetMapping("config/{id}")
    public ConfigDemo getData(@PathVariable("id") Long id) {
        ConfigDemo demo = service.getData(id);
        demo.setBar(bar);
        return demo;
    }
}
