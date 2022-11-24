//package com.courage.studentmanagementsystem.models.entities;
//
//import lombok.RequiredArgsConstructor;
//
//import javax.persistence.*;
//import java.util.Date;
//@Entity(name = "Teacher")
//@Table(schema = "teacher")
//@RequiredArgsConstructor
//public class Teacher {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(
//            name = "id"
//    )
//    private Long id;
//
//    @Column(
//            name = "created_at",
//            nullable = false,
//            updatable = false
//    )
//    @Temporal(value = TemporalType.DATE)
//    private Date createdAt;
//
//    @Column(
//            name = "updated_at",
//            updatable = true
//    )
//    @Temporal(value = TemporalType.DATE)
//    private Date modifiedAt;
//
//}
