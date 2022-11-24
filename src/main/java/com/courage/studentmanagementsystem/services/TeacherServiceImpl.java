package com.courage.studentmanagementsystem.services;

import com.courage.studentmanagementsystem.models.pojos.ApiResponse;
import com.courage.studentmanagementsystem.models.pojos.TeachRegistrationRequest;
import com.courage.studentmanagementsystem.models.pojos.TeacherDto;
import org.springframework.stereotype.Service;

@Service
public class TeacherServiceImpl implemen TeacherService {
    @Override
    public ApiResponse<TeacherDto> create(TeachRegistrationRequest request) {
        return null;
    }

    @Override
    public ApiResponse<TeacherDto> getTeacher(Long teacherId) {
        return null;
    }
}
