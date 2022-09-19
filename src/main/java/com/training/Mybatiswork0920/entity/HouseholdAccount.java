package com.training.Mybatiswork0920.entity;

public class HouseholdAccount {
    private int id;
    private String ex_in;
    private String category;
    private int amount;

    public HouseholdAccount(int id, String ex_in, String category, int amount) {
        this.id = id;
        this.ex_in = ex_in;
        this.category = category;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public String getEx_in() {
        return ex_in;
    }

    public String getCategory() {
        return category;
    }

    public int getAmount() {
        return amount;
    }
}
