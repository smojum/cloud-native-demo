package com.landsend.demoservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Slf4j
public class DemoService {
    @Autowired
    private DemoRepository repository;

    public Optional<DemoObject> getData(Long id) {
        log.info("getting data for id = " + id);
        return repository.findById(id);
    }
}
