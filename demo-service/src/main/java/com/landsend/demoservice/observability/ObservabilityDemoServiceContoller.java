package com.landsend.demoservice.observability;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@Slf4j
public class ObservabilityDemoServiceContoller {
    @Autowired
    private ObservabilityDemoService service;

    @GetMapping("message/{id}")
    public ObservabilityDemo getMessage(@PathVariable("id") Long id) {
        log.info("getting data for id = " + id);
        Optional<ObservabilityDemo> response = service.getData(id);
        return response.get();
    }

    @GetMapping("message")
    public List<ObservabilityDemo> getMessages() {
        List<ObservabilityDemo> response = service.getData();
        return response;
    }
}
