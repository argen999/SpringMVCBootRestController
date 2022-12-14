package com.peaksoft.controller;

import com.peaksoft.dto.request.InstructorRequest;
import com.peaksoft.dto.response.InstructorResponse;
import com.peaksoft.service.InstructorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/instructors")
public class InstructorController {

    private final InstructorService instructorService;

    @GetMapping("/getAllInstructor")
    public List<InstructorResponse> getAllCourse() {
        return instructorService.getAllInstructor();
    }

    @GetMapping("/getAllInstructorByCourseId/{courseId}")
    public List<InstructorResponse> getAllInstructorByCourseId(@PathVariable Long courseId) {
        return instructorService.getAllInstructor(courseId);
    }

    @GetMapping("/getInstructorById/{id}")
    public InstructorResponse getInstructorById(@PathVariable Long id) {
        return instructorService.getInstructorById(id);
    }

    @PostMapping("/saveInstructor/{courseId}")
    public InstructorResponse saveInstructor(@PathVariable Long courseId,
                                             @RequestBody InstructorRequest instructorRequest) throws IOException {
        return instructorService.saveInstructor(courseId, instructorRequest);
    }

    @PutMapping("/updateInstructor/{id}")
    public InstructorResponse saveUpdateInstructor(@PathVariable Long id, @RequestBody InstructorRequest instructorRequest) throws IOException {
        return instructorService.updateInstructor(id, instructorRequest);
    }

    @DeleteMapping("/deleteInstructorById/{id}")
    public InstructorResponse deleteInstructorById(@PathVariable Long id) {
        return instructorService.deleteInstructor(id);
    }
}
