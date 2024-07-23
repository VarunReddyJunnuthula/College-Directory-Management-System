package com.example.collegedirectory1.repository;


import com.example.collegedirectory1.model.StudentProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentProfileRepository extends JpaRepository<StudentProfile, Long> {
}
