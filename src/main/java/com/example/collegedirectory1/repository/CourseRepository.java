package com.example.collegedirectory1.repository;


import com.example.collegedirectory1.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
