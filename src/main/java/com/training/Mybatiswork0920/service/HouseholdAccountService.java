package com.training.Mybatiswork0920.service;

import com.training.Mybatiswork0920.entity.HouseholdAccount;

import java.util.List;
import java.util.Optional;

public interface HouseholdAccountService {
    List<HouseholdAccount> findAll();

    Optional<HouseholdAccount> findByCategory(String category);

    // idに指定した名前が存在しない場合に例外をthrowします
    HouseholdAccount findById(int id) throws Exception;
}
