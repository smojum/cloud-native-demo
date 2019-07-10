package com.landsend.demoservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoServiceContoller {
    @Autowired
    private DemoService service;
    @GetMapping("message/{id}")
    public DemoObject getMessage(@PathVariable("id") Long id) {
        return service.getData(id).get();
    }
}
