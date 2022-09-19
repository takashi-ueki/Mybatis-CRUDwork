package com.training.Mybatiswork0920.controller;

import com.training.Mybatiswork0920.service.HouseholdAccountService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HouseholdAccountController {
    private final HouseholdAccountService householdAccountService;

    public HouseholdAccountController(HouseholdAccountService householdAccountService) {
        this.householdAccountService = householdAccountService;
    }

    @GetMapping("/accounts")
    public List<HouseholdAccountResponse> getNames() {
        return householdAccountService.findAll().stream().map(HouseholdAccountResponse::new).toList();
    }
}
