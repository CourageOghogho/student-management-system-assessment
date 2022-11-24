package com.courage.studentmanagementsystem.models.entities;


import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Entity(name = "School")
@Table(name = "school")
@RequiredArgsConstructor
public class School extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(
            name = "id"
    )
    private Long id;


}
