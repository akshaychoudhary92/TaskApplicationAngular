package com.company.Tasks.service;

import com.company.Tasks.domain.Tasks;

public interface TaskService {
    Iterable<Tasks> list();
}
