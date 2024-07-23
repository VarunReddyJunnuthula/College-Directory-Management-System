package com.example.collegedirectory1.service;

import com.example.collegedirectory1.model.AdministratorProfile;
import com.example.collegedirectory1.repository.AdministratorProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdministratorProfileService {

    @Autowired
    private AdministratorProfileRepository administratorProfileRepository;

    public AdministratorProfile saveAdministratorProfile(AdministratorProfile administratorProfile) {
        return administratorProfileRepository.save(administratorProfile);
    }

    public AdministratorProfile getAdministratorProfileById(Long id) {
        return administratorProfileRepository.findById(id).orElse(null);
    }

    public List<AdministratorProfile> getAllAdministratorProfiles() {
        return administratorProfileRepository.findAll();
    }

    public void deleteAdministratorProfile(Long id) {
        administratorProfileRepository.deleteById(id);
    }
}

