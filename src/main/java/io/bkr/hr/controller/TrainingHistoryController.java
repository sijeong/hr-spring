package io.bkr.hr.controller;

import io.bkr.hr.entity.TrainingHistory;
import io.bkr.hr.repository.TrainingHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("api/v1")
public class TrainingHistoryController {
    @Autowired
    private TrainingHistoryRepository trainingHistoryRepository;

    @GetMapping("/trainingHistory")
    public List<TrainingHistory> getAllTrainingHistory() {return trainingHistoryRepository.findAll();}
    @PostMapping("/trainingHistory")
    public TrainingHistory trainingHistory(@Valid @RequestBody TrainingHistory trainingHistory) {return trainingHistoryRepository.save(trainingHistory);}
}

