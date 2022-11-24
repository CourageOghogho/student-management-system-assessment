package com.courage.studentmanagementsystem.controllers;

import com.courage.studentmanagementsystem.models.pojos.ApiResponse;
import com.courage.studentmanagementsystem.models.pojos.TeachRegistrationRequest;
import com.courage.studentmanagementsystem.models.pojos.TeacherDto;
import com.courage.studentmanagementsystem.services.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/teachers")
public class TeacherController {

    private final TeacherService teacherService;

    @Autowired
    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @PostMapping("/new")
    public ApiResponse<TeacherDto> create(@RequestBody TeachRegistrationRequest request){
        return teacherService.create(request);
    }
    @GetMapping("/teacher")
    public ApiResponse<TeacherDto> getTeacher(@RequestParam("id") Long teacherId){
        return teacherService.getTeacher(teacherId);
    }
}
