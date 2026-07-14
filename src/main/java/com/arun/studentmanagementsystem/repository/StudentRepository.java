package com.arun.studentmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.arun.studentmanagementsystem.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}