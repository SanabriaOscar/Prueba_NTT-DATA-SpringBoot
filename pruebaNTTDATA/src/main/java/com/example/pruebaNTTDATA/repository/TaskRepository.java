package com.example.pruebaNTTDATA.repository;

import com.example.pruebaNTTDATA.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Integer> {
}
