package com.courage.studentmanagementsystem.models.entities;

import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Entity(name = "Teacher")
@Table(name = "teacher")
@RequiredArgsConstructor
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(
            name = "id"
    )
    private Long id;



}
