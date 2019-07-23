package com.landsend.demoservice.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.lang.management.ManagementFactory;
import java.util.Random;

@RestController
@RefreshScope
public class ConfigDemoController {

    @Autowired
    private ConfigDemoService service;

    @Value("${app.bar}")
    private String bar;

    private static final Integer sleep = (new Random()).nextInt(10) ;

    @GetMapping("config/{id}")
    public ConfigDemo getData(@PathVariable("id") Long id) throws InterruptedException {
        ConfigDemo demo = service.getData(id);
        demo.setBar(bar);
        demo.setProcessName(ManagementFactory.getRuntimeMXBean().getName());
        demo.setSleepFor(sleep);
        Thread.sleep(sleep * 1000);
        return demo;
    }
}
