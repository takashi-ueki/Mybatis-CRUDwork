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
public class HouseholdAccountController<CreateForm> {
    private final HouseholdAccountService householdAccountService;

    public HouseholdAccountController(HouseholdAccountService householdAccountService) {
        this.householdAccountService = householdAccountService;
    }
    @PostMapping("/accounts")
    public ResponseEntity<String> create(@RequestBody CreateForm form) { //Json形式でリクエスト飛ばす
        // 登録処理は省略
        URI url = UriComponentsBuilder.fromUriString("http://localhost:8080")//指定された URI 文字列で初期化されるビルダーを作成。
                .path("/accounts/id") // id部分は実際に登録された際に発行したidを設定する
                .build()
                .toUri();
        return ResponseEntity.created(url).body("name successfully created");
    }
    @GetMapping("/accounts")
    public List<HouseholdAccountResponse> getNames() {
        return householdAccountService.findAll().stream().map(HouseholdAccountResponse::new).toList();
    }
}
