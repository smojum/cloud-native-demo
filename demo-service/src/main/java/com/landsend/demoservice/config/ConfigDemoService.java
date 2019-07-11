package com.landsend.demoservice.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ConfigDemoService {

    public void dummy(Long id) {
        log.info("getting dummy data for id = " + id);
    }
}
