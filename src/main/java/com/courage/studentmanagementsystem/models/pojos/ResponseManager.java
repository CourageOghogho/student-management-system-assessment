package com.courage.studentmanagementsystem.models.pojos;

import com.courage.studentmanagementsystem.models.pojos.ApiResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ResponseManager<T> {

    public ApiResponse<T> created(T data){
        return new ApiResponse<T>(HttpStatus.CREATED,"Request successful", true, data);
    }

    public ApiResponse<T> searchSuccess(T data){
        return new ApiResponse<T>(HttpStatus.OK,"Search successful", true, data);
    }

    public ApiResponse<T> updateSuccess(T data){
        return new ApiResponse<T>(HttpStatus.ACCEPTED,"Update successful", true, data);
    }

    public ApiResponse<T> badRequest(T data){
        return new ApiResponse<T>(HttpStatus.BAD_REQUEST,"Unacceptable request", false, null);
    }

    public ApiResponse<T> error(T data){
        return new ApiResponse<T>(HttpStatus.INTERNAL_SERVER_ERROR,"something went wrong", false, null);
    }
}