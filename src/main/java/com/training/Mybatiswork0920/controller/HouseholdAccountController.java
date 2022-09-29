package com.training.Mybatiswork0920.controller;

import com.training.Mybatiswork0920.service.HouseholdAccountService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class HouseholdAccountController {
    private final HouseholdAccountService householdAccountService;

    public HouseholdAccountController(HouseholdAccountService householdAccountService) {
        this.householdAccountService = householdAccountService;
    }

    @PostMapping("/accounts")
    public ResponseEntity<String> create(@RequestBody CreateForm form) {
        // 登録処理は省略
        String urlString = "http://localhost:8080";
        URI url = UriComponentsBuilder.fromUriString(urlString)
                .path("/accounts/id") // id部分は実際に登録された際に発行したidを設定する
                .build()
                .toUri();
        return ResponseEntity.created(url).body("\"message\":\"successfully created\"");
    }

    @GetMapping("/accounts")
    public List<HouseholdAccountResponse> getNames() {
        return householdAccountService.findAll().stream().map(HouseholdAccountResponse::new).toList();
    }

    public static class CreateForm {
        private String ex_in;
        private String category;
        private int amount;

        public String getEx_in() {
            return ex_in;
        }

        public void setEx_in(String ex_in) {
            this.ex_in = ex_in;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public int getAmount() {
            return amount;
        }

        public void setAmount(int amount) {
            this.amount = amount;
        }
    }
}
