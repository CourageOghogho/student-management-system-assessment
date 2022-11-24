package com.courage.studentmanagementsystem.controllers;


import com.courage.studentmanagementsystem.models.pojos.ApiResponse;
import com.courage.studentmanagementsystem.models.pojos.StudentDto;
import com.courage.studentmanagementsystem.models.pojos.StudentRegistrationRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/user")
public class StudentController {


    @PostMapping("/new")
    public ResponseEntity<StudentDto> createUser(@RequestBody StudentRegistrationRequest request){

        //update logic here
        StudentDto student=new StudentDto();
        return new ResponseEntity<>(student, HttpStatus.CREATED);
    }
    @GetMapping("/all")
    public ApiResponse<StudentDto> getStudent(){
        StudentDto student=new StudentDto(9L,"Courage","courage@gmail.com");
        ApiResponse<StudentDto> ob=new ApiResponse<>(HttpStatus.OK,"object found",true,student);
        System.out.println(ob);
         return new ApiResponse<>(HttpStatus.OK,"object found",true,student);
    }
}


//    git init
//    git add README.md
//        git commit -m "first commit"
//        git branch -M main
//        git remote add https://github.com/CourageOghogho/studentmanagementsystemhrbp.git
//        git push -u origin main