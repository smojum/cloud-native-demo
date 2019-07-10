package com.landsend.demoservice;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DemoRepository extends PagingAndSortingRepository<DemoObject, Long> {
}
