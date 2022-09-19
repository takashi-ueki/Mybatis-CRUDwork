package com.training.Mybatiswork0920.service;

import com.training.Mybatiswork0920.entity.HouseholdAccount;

import java.util.List;

public interface HouseholdAccountService {
    List<HouseholdAccount> findAll();

    // idに指定した名前が存在しない場合に例外をthrowします
    HouseholdAccount findById(int id) throws Exception;
}
