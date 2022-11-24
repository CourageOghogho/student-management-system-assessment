package com.courage.studentmanagementsystem.controllers;


import com.courage.studentmanagementsystem.models.pojos.ApiResponse;
import com.courage.studentmanagementsystem.models.pojos.StudentDto;
import com.courage.studentmanagementsystem.models.pojos.StudentRegistrationRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/user")
public class StudentController {

    @PostMapping("/register")
    public ApiResponse<StudentDto> createUser(@RequestBody StudentRegistrationRequest request){

        //update logic here

        return new ApiResponse<>();
    }
}


//    git init
//    git add README.md
//        git commit -m "first commit"
//        git branch -M main
//        git remote add https://github.com/CourageOghogho/studentmanagementsystemhrbp.git
//        git push -u origin main