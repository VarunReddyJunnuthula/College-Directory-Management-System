package com.example.collegedirectory1.repository;


import com.example.collegedirectory1.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
