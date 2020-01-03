package io.bkr.hr.controller;

import io.bkr.hr.entity.ContractInfo;
import io.bkr.hr.repository.ContractInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("api/v1")
public class ContractInfoController {
    @Autowired
    private ContractInfoRepository contractInfoRepository;

    @GetMapping("/contractInfo")
    public List<ContractInfo> getAllContractInfo() {return contractInfoRepository.findAll();}
    @PostMapping("/contractInfo")
    public ContractInfo contractInfo(@Valid @RequestBody ContractInfo contractInfo) {return contractInfoRepository.save(contractInfo);}

}
