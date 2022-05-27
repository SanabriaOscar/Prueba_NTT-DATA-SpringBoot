package com.example.pruebaNTTDATA.controller;

import com.example.pruebaNTTDATA.model.Task;
import com.example.pruebaNTTDATA.service.TaskServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TaskController {
    private TaskServiceImpl taskService;


    public TaskController(TaskServiceImpl taskService) {
        this.taskService = taskService;
    }

    @GetMapping("/tasks")
    public List<Task> listAllTaskC(){
        return taskService.listAllTasks();
    }
    @PostMapping("/tasks/add")
    public String saveTaskC(@RequestBody Task task){
        taskService.saveTask(task);
        return "user saved sussesfull";
    }
    @GetMapping("/tasks/{id}")
    public Task listTaskByIdC(@PathVariable int id) {
        return taskService.findByIdTask(id);
    }
    @PutMapping("/tasks/edit/{id}")
    public Task updateTaskByIdC(@PathVariable int id, @RequestBody Task task) {
        Task taskUpdate=taskService.findByIdTask(id);
        taskUpdate.setName(task.getName());
        taskUpdate.setDate(task.getDate());
        taskService.saveTask(taskUpdate);
        return taskUpdate;
    }
    @DeleteMapping("/tasks/delete/{id}")
    public String deleteTaskC(@PathVariable int id){
        taskService.deleteTask(id);
        return "Task deleted sussesfull";
    }

}
