package com.training.Mybatiswork0920.service;

import com.training.Mybatiswork0920.entity.HouseholdAccount;
import com.training.Mybatiswork0920.mapper.HouseholdAccountMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HouseholdAccountServiceImpl implements HouseholdAccountService {
    private HouseholdAccountMapper householdAccountMapper;


    public HouseholdAccountServiceImpl(HouseholdAccountMapper householdAccountMapper) {
        this.householdAccountMapper = householdAccountMapper;
    }

    @Override //インターフェースの処理を実行
    public List<HouseholdAccount> findAll() {
        return householdAccountMapper.findAll();
    }

    @Override
    public HouseholdAccount findById(int id) throws Exception {
        return null;
    }
}
