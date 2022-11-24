//package com.courage.studentmanagementsystem.models.entities;
//
//
//import lombok.RequiredArgsConstructor;
//
//import javax.persistence.*;
//import java.util.Date;
//
//@Entity(name = "Student")
//@Table(schema = "student")
//@RequiredArgsConstructor
//public class Student {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(
//            name = "id"
//    )
//    private Long id;
//
//    @Column(
//            name = "email",
//            nullable = false,
//            updatable = true,
//            unique = true
//    )
//    private String email;
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
//
//    @PrePersist
//    public void prePersist(){
//        this.createdAt=new Date();
//    }
//
//}
