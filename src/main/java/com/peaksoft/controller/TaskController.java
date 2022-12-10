package com.peaksoft.controller;

import com.peaksoft.dto.request.TaskRequest;
import com.peaksoft.dto.response.TaskResponse;
import com.peaksoft.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/tasks")
public class TaskController {

    private final TaskService taskService;

    @GetMapping("/getAllTask")
    public List<TaskResponse> getAllTask() {
        return taskService.getAllTask();
    }

    @GetMapping("/getAllTaskByLessonId/{lessonId}")
    public List<TaskResponse> getAllTaskByLessonId(@PathVariable Long lessonId) {
        return taskService.getAllTask(lessonId);
    }

    @GetMapping("/getTaskById/{id}")
    public TaskResponse getTaskById(@PathVariable Long id) {
        return taskService.getTaskById(id);
    }

    @PostMapping("/saveTask/{lessonId}")
    public TaskResponse saveTask(@PathVariable Long lessonId, @RequestBody TaskRequest taskRequest) {
        return taskService.saveTask(lessonId, taskRequest);
    }

    @PutMapping("/updateTask/{id}")
    public TaskResponse saveUpdateTask(@PathVariable Long id,
                                 @RequestBody TaskRequest taskRequest) {
        return taskService.updateTask(id, taskRequest);
    }

    @DeleteMapping("/deleteTaskById/{id}")
    public TaskResponse deleteTaskById(@PathVariable Long id) {
        return taskService.deleteTask(id);
    }

}
