package com.example.pruebaNTTDATA.service;

import com.example.pruebaNTTDATA.model.Task;
import com.example.pruebaNTTDATA.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TaskServiceImpl implements  ITaskService{

    private TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public List<Task> listAllTasks() {
        return taskRepository.findAll();
    }

    @Override
    public Task saveTask(Task task) {
        taskRepository.save(task);
        return task;
    }

    @Override
    public Task findByIdTask(int id) {
        return taskRepository.findById(id).get();
    }

    @Override
    public void deleteTask(int id) {
        taskRepository.deleteById(id);
    }
}
