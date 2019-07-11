package com.landsend.demoservice.observability;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ObservabilityDemoRepository extends JpaRepository<ObservabilityDemo, Long> {

}
