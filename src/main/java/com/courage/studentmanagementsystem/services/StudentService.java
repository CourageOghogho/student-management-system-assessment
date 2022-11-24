package com.courage.studentmanagementsystem.services;

import com.courage.studentmanagementsystem.models.pojos.ApiResponse;
import com.courage.studentmanagementsystem.models.pojos.StudentDto;
import com.courage.studentmanagementsystem.models.pojos.StudentRegistrationRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface StudentService {
    ApiResponse<StudentDto> register(StudentRegistrationRequest studentRequest);

    ApiResponse<StudentDto> allStudents();

    ApiResponse<StudentDto> studentsInSubject(String subject);

    ApiResponse<StudentDto> getStudent(Long studentId);

    ApiResponse<StudentDto> studentsInClass(String studentClass);

    ApiResponse<StudentDto> studentsInATerm(String term);
}
