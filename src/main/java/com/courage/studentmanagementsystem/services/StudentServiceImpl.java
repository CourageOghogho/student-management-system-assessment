package com.courage.studentmanagementsystem.services;

import com.courage.studentmanagementsystem.models.entities.Student;
import com.courage.studentmanagementsystem.models.pojos.ApiResponse;
import com.courage.studentmanagementsystem.models.pojos.ResponseManager;
import com.courage.studentmanagementsystem.models.pojos.StudentDto;
import com.courage.studentmanagementsystem.models.pojos.StudentRegistrationRequest;
import com.courage.studentmanagementsystem.models.utils.Mapper;
import com.courage.studentmanagementsystem.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService{
    private final StudentRepository studentRepository;
    private final ResponseManager responseManager;

    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository, ResponseManager responseManager) {
        this.studentRepository = studentRepository;
        this.responseManager=responseManager;
    }

    @Override
    public ApiResponse<StudentDto> register(StudentRegistrationRequest studentRequest) {

        if(studentRequest==null) return responseManager.badRequest(null);
        if(studentRequest.getName().isEmpty()|| studentRequest.getEmail().
                isEmpty()||studentRequest.getPassword().isEmpty()) return responseManager.badRequest(null);
        //better well validate at all cost

        return responseManager.created(studentRepository.save(Mapper.requestToStudent(studentRequest)));
    }

    @Override
    public ApiResponse<StudentDto> allStudents() {
        return responseManager.searchSuccess(studentRepository.findAll());
    }

    @Override
    public ApiResponse<StudentDto> studentsInSubject(String subject) {

        return null;
    }

    @Override
    public ApiResponse<StudentDto> getStudent(Long studentId) {
        Optional<Student> student=studentRepository.findById(studentId);
        if(student.isPresent()) return responseManager.searchSuccess(student.get());
        return responseManager.badRequest(null);
    }

    @Override
    public ApiResponse<StudentDto> studentsInClass(String studentClass) {
        return null;
    }

    @Override
    public ApiResponse<StudentDto> studentsInATerm(String term) {
        return null;
    }
}
