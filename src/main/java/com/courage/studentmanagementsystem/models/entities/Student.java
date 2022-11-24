package com.courage.studentmanagementsystem.models.entities;


import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Entity(name = "Student")
@Table(name = "student")
@RequiredArgsConstructor
@Getter
@Setter
@Builder
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
    @Column(
            name = "name",
            nullable = false
    )
    private String name;
    @Column(
            name = "password",
            nullable = false
    )
    private String password;  //better encrypted at all cost


}
