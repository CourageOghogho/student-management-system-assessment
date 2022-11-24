package com.courage.studentmanagementsystem.repositories;

import com.courage.studentmanagementsystem.models.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
