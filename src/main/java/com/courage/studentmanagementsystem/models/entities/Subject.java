package com.courage.studentmanagementsystem.models.entities;

import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "Subject")
@Table(name = "subject")
@RequiredArgsConstructor
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(
            name = "id"
    )
    private Long id;



}
