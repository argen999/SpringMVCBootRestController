package com.peaksoft.controller;

import com.peaksoft.dto.request.GroupRequest;
import com.peaksoft.dto.response.GroupResponse;
import com.peaksoft.service.GroupService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/groups")
public class GroupController {

    private final GroupService groupService;

    @GetMapping("/getAllGroup")
    public List<GroupResponse> getAllGroup() {
        return groupService.getAllGroup();
    }

    @GetMapping("/getAllGroupByCourseId/{courseId}")
    public List<GroupResponse> getAllGroupByCourseId(@PathVariable Long courseId) {
        return groupService.getAllGroup(courseId);
    }

    @GetMapping("/getGroupById/{id}")
    public GroupResponse getGroupById(@PathVariable Long id) {
        return groupService.getGroupById(id);
    }

    @PostMapping("saveGroup/{courseId}")
    public GroupResponse saveGroup(@PathVariable Long courseId, @RequestBody GroupRequest groupRequest) {
        return groupService.saveGroup(courseId, groupRequest);
    }

    @PutMapping("/updateGroupByCourseId/{id}")
    public GroupResponse updateGroupByCourseId(@PathVariable Long id, @RequestBody GroupRequest groupRequest) {
        return groupService.updateGroup(id, groupRequest);
    }

    @DeleteMapping("/deleteGroupById/{courseId}/{id}")
    public GroupResponse deleteGroupById(@PathVariable Long courseId, @PathVariable Long id) {
        return groupService.deleteGroup(courseId, id);
    }


//    @PostMapping("/{groupId}/assignStudent")
//    private String assignStudent(@PathVariable("groupId") Long groupId,
//                                 @ModelAttribute("student") Student student) throws IOException {
//        studentService.assignStudent(student.getId(), groupId);
//        return "redirect:/getAllStudentByGroupId/ " + groupId;
//    }
}
