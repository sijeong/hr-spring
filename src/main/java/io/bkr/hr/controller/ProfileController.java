package io.bkr.hr.controller;

import io.bkr.hr.entity.Profile;
import io.bkr.hr.repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
class ProfileController {
    @Autowired
    private ProfileRepository profileRepository;

    @GetMapping("/profiles")
    public List<Profile> getAllProfiles() { return  profileRepository.findAll();}
    @PostMapping("/profiles")
    public Profile createProfile(@Valid @RequestBody Profile profile) {return profileRepository.save(profile);}
}



