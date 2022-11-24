package com.courage.studentmanagementsystem.models.pojos;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TeachRegistrationRequest {
    private String name;
    private String email;
    private String password;
}
