package com.example.collegedirectory1.repository;


import com.example.collegedirectory1.model.FacultyProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacultyProfileRepository extends JpaRepository<FacultyProfile, Long> {
}
