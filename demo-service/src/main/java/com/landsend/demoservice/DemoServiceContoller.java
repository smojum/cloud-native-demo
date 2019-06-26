package com.landsend.demoservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoServiceContoller {
    @GetMapping("message")
    public DemoObject getMessage() {
        return DemoObject.builder()
                .id(1L)
                .message("Foo")
                .build();
    }
}
