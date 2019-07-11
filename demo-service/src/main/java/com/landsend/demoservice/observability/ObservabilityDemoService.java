package com.landsend.demoservice.observability;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
@Slf4j
public class ObservabilityDemoService {
    @Autowired
    private ObservabilityDemoRepository repository;

    public Optional<ObservabilityDemo> getData(Long id) {
        log.info("getting data for id = " + id);
        return repository.findById(id);
    }

    public List<ObservabilityDemo> getData() {
        return StreamSupport.stream(repository.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }
}
