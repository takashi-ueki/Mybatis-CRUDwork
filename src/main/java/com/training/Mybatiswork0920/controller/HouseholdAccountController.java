package com.training.Mybatiswork0920.controller;

import com.training.Mybatiswork0920.service.HouseholdAccountService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Map;

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

    @GetMapping("/accounts/all")
    public List<HouseholdAccountResponse> getAccount() {
        return householdAccountService.findAll().stream().map(HouseholdAccountResponse::new).toList();
    }

    @GetMapping("/accounts")
    public List<HouseholdAccountResponse> getAccountsByCategory(@RequestParam(name = "category", defaultValue = "") String category) {
        return householdAccountService.findByCategory(category).stream()
                .map(HouseholdAccountResponse::new)
                .toList();
    }

    @PatchMapping("accounts/{id}")
    public ResponseEntity<Map<String, String>> update(@RequestBody CreateForm form, @PathVariable("id") int id) {
        // 更新処理は省略
        // 引数のidに
        return ResponseEntity.ok(Map.of("message", "name successfully updated"));
    }

    @DeleteMapping("/accounts/{id}")
    public Map<String, String> delete(@PathVariable("id") int id) {
        return Map.of("message", "ID '" + id + "'のデータを削除しました。");
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
