package com.courage.studentmanagementsystem.controllers;


import com.courage.studentmanagementsystem.models.pojos.ApiResponse;
import com.courage.studentmanagementsystem.models.pojos.StudentDto;
import com.courage.studentmanagementsystem.models.pojos.StudentRegistrationRequest;
import com.courage.studentmanagementsystem.services.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/students")
public class StudentController {
    private  StudentService studentService;


    @PostMapping("/new")
    public ApiResponse<StudentDto> createUser(@RequestBody StudentRegistrationRequest request){
        return studentService.register(request);
    }

    @GetMapping("/student")
    public ApiResponse<StudentDto> getStudent(@RequestParam("id") Long studentId){
        return studentService.getStudent(studentId);
    }
    @GetMapping("/all")
    public ApiResponse<StudentDto> getStudent(){
         return studentService.allStudents();
    }
    @GetMapping("/in-subject")
    public ApiResponse<StudentDto> enrolledInSubject(@RequestParam("subject") String subject){
        return studentService.studentsInSubject(subject);
    }

    @GetMapping("/in-class")
    public ApiResponse<StudentDto> enrolledInClass(@RequestParam("studentClass") String studentClass){
        return studentService.studentsInClass(studentClass);
    }

    @GetMapping("/in-term")
    public ApiResponse<StudentDto> enrolledInATerm(@RequestParam("term") String term){
        return studentService.studentsInATerm(term);
    }


}


