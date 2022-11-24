package com.courage.studentmanagementsystem.repositories;

import com.courage.studentmanagementsystem.models.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
