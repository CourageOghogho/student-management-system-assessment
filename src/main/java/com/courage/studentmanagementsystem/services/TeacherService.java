package com.courage.studentmanagementsystem.services;

import com.courage.studentmanagementsystem.models.pojos.ApiResponse;
import com.courage.studentmanagementsystem.models.pojos.TeachRegistrationRequest;
import com.courage.studentmanagementsystem.models.pojos.TeacherDto;
import org.springframework.stereotype.Service;

@Service
public interface TeacherService {
    ApiResponse<TeacherDto> create(TeachRegistrationRequest request);

    ApiResponse<TeacherDto> getTeacher(Long teacherId);
}
