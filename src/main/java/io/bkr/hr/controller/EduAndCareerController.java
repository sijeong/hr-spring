package io.bkr.hr.controller;

import io.bkr.hr.entity.EduAndCareer;
import io.bkr.hr.repository.EduAndCareerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("api/v1")
public class EduAndCareerController {
    @Autowired
    private EduAndCareerRepository eduAndCareerRepository;

    @GetMapping("/eduAndCareer")
    public List<EduAndCareer> getAllEduAndCareer(){return eduAndCareerRepository.findAll();}
    @PostMapping("/eduAndCareer")
    public EduAndCareer createEduAndCareer(@Valid @RequestBody EduAndCareer eduAndCareer) {return eduAndCareerRepository.save(eduAndCareer);}

}
