package com.webmaster.learnspring.example02;

import java.util.Arrays;

import org.springframework.stereotype.Service;

@Service
public class BusinessCalculationService {

    public DataService dataService;

    public BusinessCalculationService(DataService dataService) {
        this.dataService = dataService;
    }
    public int calculateMax() {
        return Arrays.stream(dataService.getData()).max().orElse(0);
    }
}
