package com.peaksoft.controller;

import com.peaksoft.dto.request.LessonRequest;
import com.peaksoft.dto.response.LessonResponse;
import com.peaksoft.entity.Lesson;
import com.peaksoft.service.LessonService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/lessons")
public class LessonController {

    private final LessonService lessonService;

    @GetMapping("/getAllLesson")
    public List<LessonResponse> getAllLesson() {
        return lessonService.getAllLesson();
    }

    @GetMapping("/getAllLessonByCourseId/{courseId}")
    public List<LessonResponse> getAllInstructorByCourseId(@PathVariable Long courseId) {
        return lessonService.getAllLesson(courseId);
    }

    @GetMapping("/getLessonById/{id}")
    public LessonResponse getLessonById(@PathVariable Long id) {
        return lessonService.getLessonById(id);
    }

    @PostMapping("/saveLesson/{courseId}")
    public LessonResponse saveLesson(@PathVariable Long courseId, @RequestBody LessonRequest lessonRequest) {
        return lessonService.saveLesson(courseId, lessonRequest);
    }

    @PutMapping("/updateLesson/{id}")
    public LessonResponse updateLesson(@PathVariable Long id, @RequestBody LessonRequest lessonRequest) {
        return lessonService.updateLesson(id, lessonRequest);
    }

    @DeleteMapping("/deleteLessonById/{id}")
    public LessonResponse deleteLessonById(@PathVariable Long id) {
        return lessonService.deleteLesson(id);
    }
}
