package com.courage.studentmanagementsystem.models.utils;


import com.courage.studentmanagementsystem.models.entities.Student;
import com.courage.studentmanagementsystem.models.pojos.StudentDto;
import com.courage.studentmanagementsystem.models.pojos.StudentRegistrationRequest;

public class Mapper {
    public static StudentDto StudentToDTO(Student student){
        return null;
    }

    public  static Student requestToStudent(StudentRegistrationRequest request){
        return Student.builder()
                .name(request.getEmail())
                .email(request.getEmail())
                .password(request.getPassword())
                .build();
    }
}
