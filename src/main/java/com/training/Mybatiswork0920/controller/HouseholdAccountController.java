package com.training.Mybatiswork0920.controller;

import com.training.Mybatiswork0920.Form.HouseholdAccountForm;
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
    public ResponseEntity<String> create(@RequestBody HouseholdAccountForm form) {
        // 登録処理は省略
        String urlString = "http://localhost:8080";
        URI url = UriComponentsBuilder.fromUriString(urlString)
                .path("/accounts/id") // id部分は実際に登録された際に発行したidを設定する
                .build()
                .toUri();
        return ResponseEntity.created(url).body("\"message\":\"successfully created\"");
    }

    @GetMapping("/accounts")
    public List<HouseholdAccountResponse> getAccount() {
        return householdAccountService.findAll().stream().map(HouseholdAccountResponse::new).toList();
    }

    @GetMapping("/accounts/search")
    public List<HouseholdAccountResponse> getAccountsByCategory(@RequestParam(name = "category", defaultValue = "") String category) {
        return householdAccountService.findByCategory(category).stream()
                .map(HouseholdAccountResponse::new)
                .toList();
    }

    @PatchMapping("accounts/{id}")
    public ResponseEntity<Map<String, String>> update(@RequestBody HouseholdAccountForm form, @PathVariable("id") int id) {
        // 更新処理は省略
        // 引数のidに
        return ResponseEntity.ok(Map.of("message", "name successfully updated"));
    }

    @DeleteMapping("/accounts/{id}")
    public Map<String, String> delete(@PathVariable("id") int id) {
        return Map.of("message", "ID '" + id + "'のデータを削除しました。");
    }

}
