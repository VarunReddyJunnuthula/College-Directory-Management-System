package com.example.collegedirectory1.service;

import com.example.collegedirectory1.model.StudentProfile;
import com.example.collegedirectory1.repository.StudentProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentProfileService {

    @Autowired
    private StudentProfileRepository studentProfileRepository;

    public StudentProfile saveStudentProfile(StudentProfile studentProfile) {
        return studentProfileRepository.save(studentProfile);
    }

    public StudentProfile getStudentProfileById(Long id) {
        return studentProfileRepository.findById(id).orElse(null);
    }

    public List<StudentProfile> getAllStudentProfiles() {
        return studentProfileRepository.findAll();
    }

    public void deleteStudentProfile(Long id) {
        studentProfileRepository.deleteById(id);
    }
}
