package com.example.pruebaNTTDATA;

import com.example.pruebaNTTDATA.controller.TaskController;
import com.example.pruebaNTTDATA.model.Task;
import com.example.pruebaNTTDATA.repository.TaskRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.header;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(TaskController.class)
public class TaskControllerTest {

    private MockMvc mockMvc;

    private ObjectMapper mapper;

    @MockBean
    TaskRepository taskRepository;

    Task RECORD_1 = new Task(1, "clean");
    Task RECORD_2 = new Task(2, "loop");
    Task RECORD_3 = new Task(3, "fly");

    public TaskControllerTest(MockMvc mockMvc, ObjectMapper mapper) {
        this.mockMvc = mockMvc;
        this.mapper = mapper;
    }

//    @Test
//    public void getAllTasks() throws Exception {
//        List<Task> records = new ArrayList<>(Arrays.asList(RECORD_1, RECORD_2, RECORD_3));
//        when(taskRepository.findAll())
//                .thenReturn(List.of(new Task(1, "clean")));
//
//
//        this.mockMvc
//                .perform(MockMvcRequestBuilders.get("/tasks"))
//                .andExpect(MockMvcResultMatchers.status().isOk())
//                .andExpect(MockMvcResultMatchers.jsonPath("$.size()").value(1))
//                .andExpect(MockMvcResultMatchers.jsonPath("$[0].id").value(1))
//                .andExpect(MockMvcResultMatchers.jsonPath("$[0].name").value("clean"));
//
//
//    }



}
