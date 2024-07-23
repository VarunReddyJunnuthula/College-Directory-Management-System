package com.example.collegedirectory1.service;


import com.example.collegedirectory1.model.FacultyProfile;
import com.example.collegedirectory1.repository.FacultyProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacultyProfileService {

    @Autowired
    private FacultyProfileRepository facultyProfileRepository;

    public FacultyProfile saveFacultyProfile(FacultyProfile facultyProfile) {
        return facultyProfileRepository.save(facultyProfile);
    }

    public FacultyProfile getFacultyProfileById(Long id) {
        return facultyProfileRepository.findById(id).orElse(null);
    }

    public List<FacultyProfile> getAllFacultyProfiles() {
        return facultyProfileRepository.findAll();
    }

    public void deleteFacultyProfile(Long id) {
        facultyProfileRepository.deleteById(id);
    }
}
