package io.bkr.hr.controller;

import io.bkr.hr.entity.PersonalInfo;
import io.bkr.hr.repository.PersonalInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("api/v1")
public class PersonalInfoController {
    @Autowired
    private PersonalInfoRepository personalInfoRepository;

    @GetMapping("/personalInfo")
    public List<PersonalInfo> getAllPersonalInfo() {return personalInfoRepository.findAll();}
    @PostMapping("/personalInfo")
    public PersonalInfo createPersonalInfo(@Valid @RequestBody PersonalInfo personalInfo){return personalInfoRepository.save(personalInfo);}


}
