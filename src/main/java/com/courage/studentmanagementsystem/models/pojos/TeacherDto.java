package com.courage.studentmanagementsystem.models.pojos;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TeacherDto {
    private Long id;
    private String name;
    private String email;
}
