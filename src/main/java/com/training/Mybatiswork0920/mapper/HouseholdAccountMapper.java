package com.training.Mybatiswork0920.mapper;

import com.training.Mybatiswork0920.entity.HouseholdAccount;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Optional;

@Mapper
public interface HouseholdAccountMapper {
    @Select("SELECT * FROM accounts")
    List<HouseholdAccount> findAll();

    @Select("SELECT * FROM accounts WHERE id = #{id}")
    Optional<HouseholdAccount> findById(int id);
}
