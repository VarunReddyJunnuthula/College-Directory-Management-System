package com.example.collegedirectory1.controller;


import com.example.collegedirectory1.model.StudentProfile;
import com.example.collegedirectory1.service.StudentProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/student")
public class StudentController {

    @Autowired
    private StudentProfileService studentProfileService;

    @GetMapping("/profile/{id}")
    public StudentProfile getStudentProfile(@PathVariable Long id) {
        return studentProfileService.getStudentProfileById(id);
    }

    @PostMapping("/profile")
    public StudentProfile createStudentProfile(@RequestBody StudentProfile studentProfile) {
        return studentProfileService.saveStudentProfile(studentProfile);
    }
    @GetMapping("/student/dashboard")
    public String studentDashboard() {
        return "student_dashboard";
    }
}
