package com.company.Tasks.repository;

import com.company.Tasks.domain.Tasks;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<Tasks, Long> {
}
