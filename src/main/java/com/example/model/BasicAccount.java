package com.example.model;

import java.math.BigDecimal;

/*
    Create by Atiye Mousavi 
    Date: 3/13/2022
    Time: 11:12 AM
**/
public class BasicAccount {
    private String name;
    private BigDecimal balance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}
