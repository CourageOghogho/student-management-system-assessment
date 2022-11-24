package com.courage.studentmanagementsystem.models.pojos;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class StudentDto {
    private Long id;
    private String name;
    private String email;

}
