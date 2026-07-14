package com.arun.studentmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.arun.studentmanagementsystem.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {
}