package com.training.Mybatiswork0920.controller;

import com.training.Mybatiswork0920.entity.HouseholdAccount;

public class HouseholdAccountResponse {
    private int id;
    private String ex_in;
    private String category;
    private int amount;

    public HouseholdAccountResponse(int id, String ex_in, String category, int amount) {
        this.id = id;
        this.ex_in = ex_in;
        this.category = category;
        this.amount = amount;
    }

    public HouseholdAccountResponse(HouseholdAccount householdAccount) {
        this.id = householdAccount.getId();
        this.ex_in = householdAccount.getEx_in();
        this.category = householdAccount.getCategory();
        this.amount = householdAccount.getAmount();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
