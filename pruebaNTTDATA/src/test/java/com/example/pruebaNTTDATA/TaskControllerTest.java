package com.example.pruebaNTTDATA;

import com.example.pruebaNTTDATA.controller.TaskController;
import com.example.pruebaNTTDATA.exceptions.JsonUtil;
import com.example.pruebaNTTDATA.model.Task;
import com.example.pruebaNTTDATA.service.TaskServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.jsonPath;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@RunWith(SpringRunner.class)
@WebMvcTest(TaskController.class)
public class TaskControllerTest {

    private MockMvc mockMvc;


    @MockBean
    private TaskServiceImpl taskService;

    public TaskControllerTest(MockMvc mockMvc) {
        this.mockMvc = mockMvc;
    }

//    @Test
//    public void saveTaskWhenPostMethod() throws Exception {
//
//        Task task = new Task();
//        task.setName("Test Name");
//
//        given(taskService.saveTask(task)).willReturn(task);
//
//        mockMvc.perform(post("/tasks/add")
//                        .contentType(MediaType.APPLICATION_JSON)
//                        .content(JsonUtil.toJson(task)))
//                .andExpect(status().isCreated())
//                .andExpect(jsonPath("$.name", is(task.getName())));
//    }
}


