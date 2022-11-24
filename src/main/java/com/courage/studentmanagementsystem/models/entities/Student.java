package com.courage.studentmanagementsystem.models.entities;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Entity(name = "Student")
@Table(name = "student")
@RequiredArgsConstructor
@Getter
@Setter
public class Student extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(
            name = "id"
    )
    private Long id;

    @Column(
            name = "email",
            nullable = false,
            unique = true
    )
    private String email;

}
