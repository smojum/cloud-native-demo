package com.landsend.demoservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DemoService {
    @Autowired
    private DemoRepository repository;
    public Optional<DemoObject> getData(Long id) {
       return repository.findById(id);
    }
}
