package com.example.collegedirectory1.controller;


import com.example.collegedirectory1.model.FacultyProfile;
import com.example.collegedirectory1.service.FacultyProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/faculty")
public class FacultyController {

    @Autowired
    private FacultyProfileService facultyProfileService;

    @GetMapping("/profile/{id}")
    public FacultyProfile getFacultyProfile(@PathVariable Long id) {
        return facultyProfileService.getFacultyProfileById(id);
    }

    @PostMapping("/profile")
    public FacultyProfile createFacultyProfile(@RequestBody FacultyProfile facultyProfile) {
        return facultyProfileService.saveFacultyProfile(facultyProfile);
    }
    @GetMapping("/faculty/dashboard")
    public String facultyDashboard() {
        return "faculty_dashboard";
    }
}

