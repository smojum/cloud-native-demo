package com.landsend.demoservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;

import java.util.Optional;

@RestController
@Slf4j
public class DemoServiceContoller {
    @Autowired
    private DemoService service;
    @GetMapping("message/{id}")
    public DemoObject getMessage(@PathVariable("id") Long id) {
        log.info("getting data for id = " + id);
        Optional<DemoObject> response = service.getData(id);
        return response.get();
    }
}
