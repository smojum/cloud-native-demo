package com.landsend.demoservice.observability;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ObservabilityDemoRepository extends JpaRepository<ObservabilityDemo, Long> {
    @Override
    Optional<ObservabilityDemo> findById(Long aLong);
}
