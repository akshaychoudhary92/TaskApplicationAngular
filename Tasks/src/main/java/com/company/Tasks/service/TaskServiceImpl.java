package com.company.Tasks.service;

import com.company.Tasks.domain.Tasks;
import com.company.Tasks.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class TaskServiceImpl implements TaskService {
    @Autowired
    private TaskRepository taskRepository;


    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Iterable<Tasks> list() {
        return this.taskRepository.findAll();
    }
}
