package com.example.collegedirectory1.repository;


import com.example.collegedirectory1.model.Enrollment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnrollmentRepository extends JpaRepository<Enrollment, Long> {
}
